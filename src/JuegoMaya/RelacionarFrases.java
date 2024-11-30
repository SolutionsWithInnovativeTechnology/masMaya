package JuegoMaya;

import Util.BD;
import Util.Botones;
import Util.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class RelacionarFrases extends javax.swing.JFrame {
    private String[][] frases = {{"Bet uts", "Por favor"}, {"In yakumeech", "Te amo"},{"Mix ba´al", "De nada"},  {"Bix a beel", "¿Cómo estás?"},{"Kanáantabaj", "Cuídate"}, 
        {"Ka´akate´", "Más tarde"}, {"Tu'ux ka bin", "¿A dónde vas?"}, {"In k'aabae'","Me llamo"}, {"Luba'an in wóol", "Estoy triste"}};
    
    private int[] palabras = new int[3];
    private int intentos;
    private boolean botonPresionado;
    private boolean primerB;
    private String fraseMaya;
    private String fraseEspaniol;
    private JButton[] pbtn = new JButton [2];
    private String[] opciones = new String[6];
    private String ultimaPalabra = "";
    Jugador jugador;
    BD mBD;
    public RelacionarFrases(Jugador jugador) {
        this.jugador=jugador;
        mBD = new BD("BD_maya?useSSL=false","root","");
        
        initComponents();
        lblpuntuacionGlobal.setText(jugador.getPuntuacion()+"");
        Botones.transparenciaButton(btnImgRegresar);
        Botones.transparenciaButton(btnImgInicio);
        Botones.transparenciaButton(btnImgSoporte);
        Botones.transparenciaButtonBorder(reiniciar);
        comenzarJuego();
        setResizable(false);
    }
    Timer timer = new Timer(250, new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        if(botonPresionado && primerB){
            boolean resultado = false;
            for(int i = 0; i < 3; i++){
                if((fraseMaya.equals(opciones[i]))&&(fraseEspaniol.equals(opciones[i+3]))){
                    resultado = true;
                    break;
                }
            }
            if(resultado) {
                pbtn[0].setBorderPainted(true);
                pbtn[0].setEnabled(false);
                pbtn[1].setBorderPainted(true);
                pbtn[1].setEnabled(false);
            } else if(intentos > 0){
                intentos--;
                lblIntentos.setText(intentos+"");
            } else {
                intentos--;
            }
            
            if(ultimaPalabra.equals("Maya")){
                if(!opcion4.isBorderPainted()) opcion4.setEnabled(true);
                if(!opcion5.isBorderPainted()) opcion5.setEnabled(true);
                if(!opcion6.isBorderPainted()) opcion6.setEnabled(true);
            } else{
                if(!opcion1.isBorderPainted()) opcion1.setEnabled(true);
                if(!opcion2.isBorderPainted()) opcion2.setEnabled(true);
                if(!opcion3.isBorderPainted()) opcion3.setEnabled(true);
            }
            comprobarGanador();
            if(intentos < 0){
                perder();
            }
            botonPresionado=false;
        }
    }
    });
    
    private void comenzarJuego() {
        botonPresionado = false;
        primerB = false;
        opcion1.setBorderPainted(false);
        opcion2.setBorderPainted(false);
        opcion3.setBorderPainted(false);
        opcion4.setBorderPainted(false);
        opcion5.setBorderPainted(false);
        opcion6.setBorderPainted(false);
        
        if(jugador.getPuntuacion() == 0){
            lblintentos.setVisible(false);
            lblIntentos.setVisible(false);
            intentos = 0;
        }
        else{
            intentos = 1;
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
        }
        lblIntentos.setText(intentos+"");
        Random random = new Random();
        palabras[0] = 9;
        palabras[1] = 9;
        palabras[2] = 9;
        
        int cont=0;
        int aleatorio;
        boolean repetido;
        while(cont<3){
            aleatorio = random.nextInt(frases.length);
            repetido = false;
            for(int i=0; i<3; i++){
                if(palabras[i] == aleatorio){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                palabras[cont] = aleatorio;
            } else {
                cont--;
            }
            cont++;
        }
        
        opciones[0] = frases[palabras[0]][0];
        opciones[1] = frases[palabras[1]][0];
        opciones[2] = frases[palabras[2]][0];
        opciones[3] = frases[palabras[0]][1];
        opciones[4] = frases[palabras[1]][1];
        opciones[5] = frases[palabras[2]][1];
        
        String[] botones = {"","","","","",""};
        cont=0;
        while(cont<3){
            aleatorio = random.nextInt(3);
            repetido = false;
            for(int i=0; i<3; i++){
                if(botones[i].equals(opciones[aleatorio])){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                botones[cont]=opciones[aleatorio];
            } else {
                cont--;
            }
            cont++;
        }
        cont = 3;
        while(cont<6){
            aleatorio = random.nextInt(3)+3;
            repetido = false;
            for(int i=3; i<6; i++){
                if(botones[i].equals(opciones[aleatorio])){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                botones[cont]=opciones[aleatorio];
            } else {
                cont--;
            }
            cont++;
        }
        
        opcion1.setText(botones[0]);
        opcion2.setText(botones[1]);
        opcion3.setText(botones[2]);
        opcion4.setText(botones[3]);
        opcion5.setText(botones[4]);
        opcion6.setText(botones[5]);
        opcion1.setEnabled(true);
        opcion2.setEnabled(true);
        opcion3.setEnabled(true);
        opcion4.setEnabled(true);
        opcion5.setEnabled(true);
        opcion6.setEnabled(true);
        timer.start();
    }
    
    private void btnEnabled(JButton btn, String lenguaje){
        ultimaPalabra = lenguaje;
        if(!botonPresionado){
            if (ultimaPalabra.equals("Maya")) {
                fraseMaya = btn.getText();
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);
            }
            else {
                fraseEspaniol = btn.getText();
                opcion4.setEnabled(false);
                opcion5.setEnabled(false);
                opcion6.setEnabled(false);
            }
            
            pbtn[0] = btn;
            botonPresionado = true;
            primerB = false;
        }else{
            if (ultimaPalabra.equals("Maya")) {
                fraseMaya = btn.getText();
            }
            else{
                fraseEspaniol = btn.getText();
            }
            pbtn[1] = btn;
            primerB = true;

        }

    }
    
    private void comprobarGanador() {
        if(opcion1.isBorderPainted() && opcion2.isBorderPainted() && 
                opcion3.isBorderPainted() && opcion4.isBorderPainted() && 
                opcion5.isBorderPainted() && opcion6.isBorderPainted()){
            if(intentos == 0 && jugador.getPuntuacion() >= 10){
                puntuacion(10);
                JOptionPane.showMessageDialog(this, "Usted ha ganado 10 puntos.", "Fin del juego", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado 20 puntos.", "Win!!", JOptionPane.INFORMATION_MESSAGE);
                puntuacion(20);
            }
            timer.stop();
            comenzarJuego();
        }
    }
    
    private void perder(){
        JOptionPane.showMessageDialog(this, "Has perdido. Tu puntaje es: 0", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        opcion4.setEnabled(false);
        opcion5.setEnabled(false);
        opcion6.setEnabled(false);
    }

    private void puntuacion(int puntos){
        jugador.actualizarPuntuacion(puntos);
        if(!jugador.isOffline() && mBD.conectar()){
            mBD.actualizarPuntuacion(jugador);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImgRegresar = new javax.swing.JButton();
        btnImgSoporte = new javax.swing.JButton();
        btnImgInicio = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpuntuacionGlobal = new javax.swing.JLabel();
        opcion1 = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        opcion3 = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        lblintentos = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        opcion4 = new javax.swing.JButton();
        opcion5 = new javax.swing.JButton();
        opcion6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Relacionar palabras");

        btnImgRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar.png"))); // NOI18N
        btnImgRegresar.setBorder(null);
        btnImgRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar1.png"))); // NOI18N
        btnImgRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgRegresarActionPerformed(evt);
            }
        });

        btnImgSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda.png"))); // NOI18N
        btnImgSoporte.setBorder(null);
        btnImgSoporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda1.png"))); // NOI18N
        btnImgSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgSoporteActionPerformed(evt);
            }
        });

        btnImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio.png"))); // NOI18N
        btnImgInicio.setBorder(null);
        btnImgInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio1.png"))); // NOI18N
        btnImgInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgInicioActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Puntuación global:");

        opcion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion1.setText("jButton1");
        opcion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion2.setText("jButton2");
        opcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion3.setText("jButton3");
        opcion3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        lblintentos.setText("Intentos:");

        lblIntentos.setText("1");

        opcion4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion4.setText("jButton4");
        opcion4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        opcion5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion5.setText("jButton5");
        opcion5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });

        opcion6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion6.setText("jButton6");
        opcion6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(lblintentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(reiniciar)
                                .addGap(96, 96, 96)
                                .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(opcion5, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(opcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 211, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion1)
                        .addGap(40, 40, 40)
                        .addComponent(opcion2)
                        .addGap(39, 39, 39)
                        .addComponent(opcion3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion4)
                        .addGap(40, 40, 40)
                        .addComponent(opcion5)
                        .addGap(39, 39, 39)
                        .addComponent(opcion6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImgRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblintentos)
                            .addComponent(lblIntentos)
                            .addComponent(reiniciar))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosFrasesComunes regresar = new JuegosFrasesComunes(jugador);
        regresar.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSoporteActionPerformed
        JOptionPane.showMessageDialog(this, "Presiona la frase en maya y a continuación \npresiona la frase en español que le corresponde \n", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgSoporteActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        MenuPrincipal inicio = new MenuPrincipal();
        inicio.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion1, "Maya");
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion2, "Maya");
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion3, "Maya");
    }//GEN-LAST:event_opcion3ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        timer.stop();
        comenzarJuego();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion4, "Español");
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion5, "Español");
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion6, "Español");
    }//GEN-LAST:event_opcion6ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(completarPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new completarPalabras(jugador).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImgInicio;
    private javax.swing.JButton btnImgRegresar;
    private javax.swing.JButton btnImgSoporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lblpuntuacionGlobal;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton opcion3;
    private javax.swing.JButton opcion4;
    private javax.swing.JButton opcion5;
    private javax.swing.JButton opcion6;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}

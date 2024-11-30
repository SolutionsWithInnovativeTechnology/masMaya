package JuegoMaya;

import Util.BD;
import Util.Botones;
import Util.Jugador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ClasificacionesAnimales extends javax.swing.JFrame {
    private String[][] animales = {{"Balam", "Terrestres"},
        {"Tunkuluchú", "Aéreos"}, {"Ts'unu'un", "Aéreos"},  
        {"Kaab", "Aéreos"}, {"Masam", "Acuáticos"}, 
        {"Miis", "Terrestres"}, {"Peek'", "Terrestres"}, 
        {"Kan", "Terrestres"}, {"Kai", "Acuáticos"},
        {"Tssímin", "Terrestres"}, {"Kekén", "Terrestres"},
        {"T'u'ul", "Terrestres"}, {"T'eel", "Terrestres"},
        {"Peépem", "Aéreos"}, {"Chi'ich", "Aéreos"}
    };
    
    private int[] animal = new int[6];
    private int intentos;
    private boolean botonPresionado;
    private boolean primerB;
    private String animalO;
    private String tipoO;
    private JButton[] pbtn = new JButton [2];
    private String[][] opciones = new String[6][2];
    private String ultimaPalabra = "";
    Jugador jugador;
    BD mBD;
    public ClasificacionesAnimales(Jugador jugador) {
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
            for(int i = 0; i < 6; i++){
                if((animalO.equals(opciones[i][0]))&&(tipoO.equals(opciones[i][1]))){
                    resultado = true;
                    break;
                }
            }
            if(resultado) {
                pbtn[0].setBorderPainted(true);
                pbtn[0].setEnabled(false);
            } else if(intentos > 0){
                intentos--;
                lblIntentos.setText(intentos+"");
            } else {
                intentos--;
            }
            
            if(ultimaPalabra.equals("Animal")){
                opcion7.setEnabled(true);
                opcion8.setEnabled(true);
                opcion9.setEnabled(true);
            } else{
                if(!opcion1.isBorderPainted()) opcion1.setEnabled(true);
                if(!opcion2.isBorderPainted()) opcion2.setEnabled(true);
                if(!opcion3.isBorderPainted()) opcion3.setEnabled(true);
                if(!opcion4.isBorderPainted()) opcion4.setEnabled(true);
                if(!opcion5.isBorderPainted()) opcion5.setEnabled(true);
                if(!opcion6.isBorderPainted()) opcion6.setEnabled(true);
            }
            comprobarGanador();
            if(intentos <= 0){
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
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
            intentos = 1;
        }
        else{
            intentos = 2;
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
        }
        lblIntentos.setText(intentos+"");
        Random random = new Random();
        animal[0] = animales.length;
        animal[1] = animales.length;
        animal[2] = animales.length;
        animal[3] = animales.length;
        animal[4] = animales.length;
        animal[5] = animales.length;
        
        
        int cont=0;
        int aleatorio;
        boolean repetido;
        while(cont<6){
            aleatorio = random.nextInt(animales.length);
            repetido = false;
            for(int i=0; i<6; i++){
                if(animal[i] == aleatorio){
                    repetido = true;
                    break;
                }
            }
            if(!repetido){
                animal[cont] = aleatorio;
            } else {
                cont--;
            }
            cont++;
        }
        for(int i=0; i <6 ;i++){
            opciones[i][0] = animales[animal[i]][0];
            opciones[i][1] = animales[animal[i]][1];
        }
        
        String[] botones = {opciones[0][0],opciones[1][0],opciones[2][0],opciones[3][0],opciones[4][0],opciones[5][0]};

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
        opcion7.setEnabled(false);
        opcion8.setEnabled(false);
        opcion9.setEnabled(false);
        timer.start();
    }
    
    private void btnEnabled(JButton btn, String tipo){
        ultimaPalabra = tipo;
        if(!botonPresionado){
            if (ultimaPalabra.equals("Animal")) {
                animalO = btn.getText();
                opcion1.setEnabled(false);
                opcion2.setEnabled(false);
                opcion3.setEnabled(false);
                opcion4.setEnabled(false);
                opcion5.setEnabled(false);
                opcion6.setEnabled(false);
                opcion7.setEnabled(true);
                opcion8.setEnabled(true);
                opcion9.setEnabled(true);
            }
            else {
                tipoO = btn.getToolTipText();
                opcion1.setEnabled(true);
                opcion2.setEnabled(true);
                opcion3.setEnabled(true);
                opcion4.setEnabled(true);
                opcion5.setEnabled(true);
                opcion6.setEnabled(true);
                opcion7.setEnabled(false);
                opcion8.setEnabled(false);
                opcion9.setEnabled(false);
            }
            
            pbtn[0] = btn;
            botonPresionado = true;
            primerB = false;
        }else{
            if (ultimaPalabra.equals("Animal")) {
                animalO = btn.getText();
            }
            else{
                tipoO = btn.getToolTipText();
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
                JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado 20 puntos.", "¡Ganaste!", JOptionPane.INFORMATION_MESSAGE);
                puntuacion(20);
            }
            timer.stop();
            comenzarJuego();
        }
    }
    
    private void perder(){
        JOptionPane.showMessageDialog(this, "Has perdido. Tu puntaje es: 0", "¡Perdiste!", JOptionPane.INFORMATION_MESSAGE);
        opcion1.setEnabled(false);
        opcion2.setEnabled(false);
        opcion3.setEnabled(false);
        opcion4.setEnabled(false);
        opcion5.setEnabled(false);
        opcion6.setEnabled(false);
        opcion7.setEnabled(false);
        opcion8.setEnabled(false);
        opcion9.setEnabled(false);
        
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
        opcion7 = new javax.swing.JButton();
        opcion8 = new javax.swing.JButton();
        opcion9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLASIFICACIONES");

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

        opcion7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAnimales/terrestres.jpeg"))); // NOI18N
        opcion7.setToolTipText("Terrestres");
        opcion7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion7ActionPerformed(evt);
            }
        });

        opcion8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAnimales/aereos.jpeg"))); // NOI18N
        opcion8.setToolTipText("Aéreos");
        opcion8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion8ActionPerformed(evt);
            }
        });

        opcion9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        opcion9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgAnimales/acuaticos.jpeg"))); // NOI18N
        opcion9.setToolTipText("Acuáticos");
        opcion9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 168, 107), 3));
        opcion9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lblintentos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(reiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(opcion9, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(opcion6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(opcion2)
                    .addComponent(opcion3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion4)
                    .addComponent(opcion5)
                    .addComponent(opcion6))
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(opcion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reiniciar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImgInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImgRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblintentos)
                        .addComponent(lblIntentos)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosAnimales regresar = new JuegosAnimales(jugador);
        regresar.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSoporteActionPerformed
        JOptionPane.showMessageDialog(this, "Relaciona al animal en maya\ncon su clasificación correspondiente \n", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgSoporteActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        MenuPrincipal inicio = new MenuPrincipal();
        inicio.setVisible(true);
        timer.stop();
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion1, "Animal");
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion2, "Animal");
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion3, "Animal");
    }//GEN-LAST:event_opcion3ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        timer.stop();
        comenzarJuego();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion4, "Animal");
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion5, "Animal");
    }//GEN-LAST:event_opcion5ActionPerformed

    private void opcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion6ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion6, "Animal");
    }//GEN-LAST:event_opcion6ActionPerformed

    private void opcion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion7ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion7, "Tipo");
    }//GEN-LAST:event_opcion7ActionPerformed

    private void opcion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion8ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion8, "Tipo");
    }//GEN-LAST:event_opcion8ActionPerformed

    private void opcion9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion9ActionPerformed
        if(!(botonPresionado && primerB)) btnEnabled(opcion9, "Tipo");
    }//GEN-LAST:event_opcion9ActionPerformed

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
    private javax.swing.JButton opcion7;
    private javax.swing.JButton opcion8;
    private javax.swing.JButton opcion9;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}

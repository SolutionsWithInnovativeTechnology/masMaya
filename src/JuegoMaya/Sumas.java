package JuegoMaya;

import Util.BD;
import Util.Botones;
import Util.Jugador;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Sumas extends javax.swing.JFrame {
    private int numero1, numero2;
    int intentos;
    private int[] opciones = new int[3];
    BD mBD;
    Jugador jugador;
    
    public Sumas(Jugador jugador) {
        this.jugador=jugador;
        mBD = new BD("BD_maya?useSSL=false","root","");
        initComponents();
        
        lblpuntuacionGlobal.setText(jugador.getPuntuacion()+"");
        if(!jugador.isOffline())
        {
            lblUsuario.setText(this.jugador.getUsuario());    
        }
        
        Botones.transparenciaButton(btnImgRegresar);
        Botones.transparenciaButton(btnImgInicio);
        Botones.transparenciaButton(btnImgSoporte);
        Botones.transparenciaButtonBorder(opcion1);
        Botones.transparenciaButtonBorder(opcion2);
        Botones.transparenciaButtonBorder(opcion3);
        Botones.transparenciaButtonBorder(reiniciar);
        comenzarJuego();
        setResizable(false);
    }
    
    private void comenzarJuego() {
        
        if(jugador.getPuntuacion() == 0){
            lblintentos.setVisible(false);
            lblIntentos.setVisible(false);
            intentos = 0;
        }else{
            intentos = 1;
            lblintentos.setVisible(true);
            lblIntentos.setVisible(true);
        }
        lblIntentos.setText(intentos + "");
        Random random = new Random();
        numero1 = random.nextInt(6);
        numero2 = random.nextInt(6);
        
        String imagenPath1 = "/imgCartas/png" + String.valueOf(numero1) + ".png";
        String imagenPath2 = "/imgCartas/png" + String.valueOf(numero2) + ".png";

        // Redimensionar las imágenes proporcionalmente
        ImageIcon icon1 = new ImageIcon(getClass().getResource(imagenPath1));
        ImageIcon icon2 = new ImageIcon(getClass().getResource(imagenPath2));

        // Obtener las dimensiones originales de las imágenes
        int originalWidth1 = icon1.getIconWidth();
        int originalHeight1 = icon1.getIconHeight();
        int originalWidth2 = icon2.getIconWidth();
        int originalHeight2 = icon2.getIconHeight();

        // Definir el tamaño máximo deseado (por ejemplo, un ancho máximo de 100 píxeles)
        int maxWidth = 100;
        int maxHeight = 100;

        // Redimensionar la imagen 1 proporcionalmente
        double scale1 = Math.min((double) maxWidth / originalWidth1, (double) maxHeight / originalHeight1);
        int newWidth1 = (int) (originalWidth1 * scale1);
        int newHeight1 = (int) (originalHeight1 * scale1);
        Image image1 = icon1.getImage().getScaledInstance(newWidth1, newHeight1, Image.SCALE_SMOOTH);

        // Redimensionar la imagen 2 proporcionalmente
        double scale2 = Math.min((double) maxWidth / originalWidth2, (double) maxHeight / originalHeight2);
        int newWidth2 = (int) (originalWidth2 * scale2);
        int newHeight2 = (int) (originalHeight2 * scale2);
        Image image2 = icon2.getImage().getScaledInstance(newWidth2, newHeight2, Image.SCALE_SMOOTH);

        // Asignar las imágenes redimensionadas
        numeroOperacion1.setIcon(new ImageIcon(image1));
        numeroOperacion2.setIcon(new ImageIcon(image2));

        opciones[0] = -1;
        opciones[1] = -1;
        opciones[2] = -1;
        
        opciones[0] = numero1 + numero2;
        String imagenSumaResta = "/img/suma.png";
        ImageIcon sumaIcon = new ImageIcon(getClass().getResource(imagenSumaResta));
        Image sumaImage = sumaIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH); // Redimensionar a 50x50
        sumaIcon = new ImageIcon(sumaImage);
        operacion.setIcon(sumaIcon);
        

        int opcion;
        for (int i = 1; i < 3; i++) {
            do {
                opcion = random.nextInt(20);  // Generar un número aleatorio entre 0 y 19
            } while (opcion == opciones[0] || opcion == opciones[1] || opcion == opciones[2]);
            opciones[i] = opcion;
        }

        // Mezclar las opciones de manera aleatoria
        String[] botones = {"", "", ""};
        int cont = 0;
        while (cont < 3) {
            int opcionAl = random.nextInt(3);
            boolean repetido = false;
            for (int i = 0; i < 3; i++) {
                if (botones[i].equals(String.valueOf(opciones[opcionAl]))) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                botones[cont] = String.valueOf(opciones[opcionAl]);
            } else {
                cont--;  // Volver a intentar si ya se encontró una opción repetida
            }
            cont++;
        }

        // Asignar las opciones a los botones
        opcion1.setText(botones[0]);
        opcion2.setText(botones[1]);
        opcion3.setText(botones[2]);

        // Habilitar los botones
        opcion1.setEnabled(true);
        opcion2.setEnabled(true);
        opcion3.setEnabled(true);
    }
    
    private void comprobarPalabra(String respuestaJugador) {
        int resultadoCorrecto = 0;
        
        resultadoCorrecto = numero1 + numero2;
        
        int respuesta= Integer.parseInt(respuestaJugador);
        if(respuesta == resultadoCorrecto) {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado 20 puntos.", "Win!!", JOptionPane.INFORMATION_MESSAGE);
            puntuacion(20);
            comenzarJuego();
        } else if(intentos > 0){
            JOptionPane.showMessageDialog(this, "Vuelve a intentarlo ", "Respuesta Incorrecta", JOptionPane.INFORMATION_MESSAGE);
            intentos--;
            lblIntentos.setText(intentos+"");
            puntuacion(-10);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Has perdido. Tu puntaje es: 0", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
            opcion1.setEnabled(false);
            opcion2.setEnabled(false);
            opcion3.setEnabled(false);
        }  
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
        reiniciar = new javax.swing.JButton();
        lblintentos = new javax.swing.JLabel();
        lblIntentos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        numeroOperacion1 = new javax.swing.JLabel();
        numeroOperacion2 = new javax.swing.JLabel();
        operacion = new javax.swing.JLabel();
        opcion1 = new javax.swing.JButton();
        opcion2 = new javax.swing.JButton();
        opcion3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("+Maya");

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUMAS");

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

        jPanel2.setBackground(new java.awt.Color(255, 237, 213));

        numeroOperacion1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numeroOperacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroOperacion1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 35, 29), 3, true));

        numeroOperacion2.setBackground(new java.awt.Color(255, 255, 255));
        numeroOperacion2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        numeroOperacion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroOperacion2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(162, 35, 29), 3, true));

        operacion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        operacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(numeroOperacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(numeroOperacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(numeroOperacion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroOperacion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        opcion1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        opcion1.setText("opcion1");
        opcion1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        opcion1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        opcion2.setText("opcion2");
        opcion2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        opcion2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        opcion3.setText("opcion3");
        opcion3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        opcion3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblintentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(26, 26, 26))
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
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnImgRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblintentos)
                                .addComponent(lblIntentos))
                            .addContainerGap()))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(reiniciar)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosNumeros regresar = new JuegosNumeros(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSoporteActionPerformed
        JOptionPane.showMessageDialog(this, "Selecciona la opcion correspondiente a la\nsuma o resta que aparece en pantalla.", "Instrucciones", JOptionPane.INFORMATION_MESSAGE);   
    }//GEN-LAST:event_btnImgSoporteActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        MenuPrincipal inicio = new MenuPrincipal();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        comprobarPalabra(opcion1.getText());
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        comprobarPalabra(opcion2.getText());
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        comprobarPalabra(opcion3.getText());
    }//GEN-LAST:event_opcion3ActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        comenzarJuego();
    }//GEN-LAST:event_reiniciarActionPerformed

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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIntentos;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lblpuntuacionGlobal;
    private javax.swing.JLabel numeroOperacion1;
    private javax.swing.JLabel numeroOperacion2;
    private javax.swing.JButton opcion1;
    private javax.swing.JButton opcion2;
    private javax.swing.JButton opcion3;
    private javax.swing.JLabel operacion;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}

package JuegoMaya;

import Util.Jugador;
import Util.Botones;

public class JuegosFrutas extends javax.swing.JFrame {
    Jugador jugador;
    public JuegosFrutas(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        lblpuntuacionGlobal.setText(jugador.getPuntuacion()+"");
        if(!jugador.isOffline())
        {
            lblUsuario.setText(this.jugador.getUsuario());
        }
        Botones.transparenciaButtonBorder(btnImgSopaDeLetras);
        Botones.transparenciaButtonBorder(btnImgLoteria);
        Botones.transparenciaButtonBorder(btnImgAhorcado);
        Botones.transparenciaButtonBorder(btnImgPuzzle);
        Botones.transparenciaButton(btnImgSoporte);
        Botones.transparenciaButton(btnImgInicio);
        Botones.transparenciaButton(btnImgRegresar);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnImgSopaDeLetras = new javax.swing.JButton();
        btnImgLoteria = new javax.swing.JButton();
        btnImgPuzzle = new javax.swing.JButton();
        btnImgAhorcado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnImgSoporte = new javax.swing.JButton();
        btnImgInicio = new javax.swing.JButton();
        btnImgRegresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblpuntuacionGlobal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("+Maya");

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juegos");

        jPanel2.setBackground(new java.awt.Color(255, 237, 213));

        btnImgSopaDeLetras.setBackground(new java.awt.Color(255, 237, 213));
        btnImgSopaDeLetras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgCategoria2/pngSopaDeLetras.png"))); // NOI18N
        btnImgSopaDeLetras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgSopaDeLetras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgSopaDeLetras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgSopaDeLetras.setPreferredSize(new java.awt.Dimension(150, 120));
        btnImgSopaDeLetras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgCategoria2/pngSopaDeLetras1.png"))); // NOI18N
        btnImgSopaDeLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgSopaDeLetrasActionPerformed(evt);
            }
        });

        btnImgLoteria.setBackground(new java.awt.Color(255, 237, 213));
        btnImgLoteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngLoteria.png"))); // NOI18N
        btnImgLoteria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgLoteria.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgLoteria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgLoteria.setPreferredSize(new java.awt.Dimension(150, 120));
        btnImgLoteria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngLoteria1.png"))); // NOI18N
        btnImgLoteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgLoteriaActionPerformed(evt);
            }
        });

        btnImgPuzzle.setBackground(new java.awt.Color(255, 237, 213));
        btnImgPuzzle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAudio.png"))); // NOI18N
        btnImgPuzzle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgPuzzle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgPuzzle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgPuzzle.setPreferredSize(new java.awt.Dimension(150, 120));
        btnImgPuzzle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAudio1.png"))); // NOI18N
        btnImgPuzzle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgPuzzleActionPerformed(evt);
            }
        });

        btnImgAhorcado.setBackground(new java.awt.Color(255, 237, 213));
        btnImgAhorcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngPescar.png"))); // NOI18N
        btnImgAhorcado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgAhorcado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgAhorcado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgAhorcado.setPreferredSize(new java.awt.Dimension(150, 120));
        btnImgAhorcado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngPescar1.png"))); // NOI18N
        btnImgAhorcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgAhorcadoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pronunciación");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sopa de Letras");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lotería");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pescar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnImgPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnImgAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnImgSopaDeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImgLoteria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImgLoteria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImgSopaDeLetras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImgAhorcado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImgPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnImgSoporte.setBackground(new java.awt.Color(255, 237, 213));
        btnImgSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda.png"))); // NOI18N
        btnImgSoporte.setBorder(null);
        btnImgSoporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgSoporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgSoporte.setMaximumSize(new java.awt.Dimension(40, 40));
        btnImgSoporte.setMinimumSize(new java.awt.Dimension(40, 40));
        btnImgSoporte.setPreferredSize(new java.awt.Dimension(40, 40));
        btnImgSoporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda1.png"))); // NOI18N
        btnImgSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgSoporteActionPerformed(evt);
            }
        });

        btnImgInicio.setBackground(new java.awt.Color(255, 237, 213));
        btnImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio.png"))); // NOI18N
        btnImgInicio.setBorder(null);
        btnImgInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngInicio1.png"))); // NOI18N
        btnImgInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgInicioActionPerformed(evt);
            }
        });

        btnImgRegresar.setBackground(new java.awt.Color(255, 237, 213));
        btnImgRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar.png"))); // NOI18N
        btnImgRegresar.setBorder(null);
        btnImgRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar1.png"))); // NOI18N
        btnImgRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgRegresarActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Puntuación global:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 9, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lblpuntuacionGlobal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(btnImgRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnImgInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImgSoporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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

    private void btnImgSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSoporteActionPerformed
        InformacionFrutas informacion = new InformacionFrutas(jugador);
        informacion.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_btnImgSoporteActionPerformed

    private void btnImgLoteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgLoteriaActionPerformed
        Loteria loteria = new Loteria(jugador);
        loteria.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgLoteriaActionPerformed

    private void btnImgPuzzleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgPuzzleActionPerformed
        Pronunciacion pronunciacion = new Pronunciacion(jugador);
        pronunciacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgPuzzleActionPerformed

    private void btnImgAhorcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgAhorcadoActionPerformed
        Pescar ahorcado = new Pescar(jugador);
        ahorcado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgAhorcadoActionPerformed

    private void btnImgSopaDeLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgSopaDeLetrasActionPerformed
        SopaDeLetras sopa = new SopaDeLetras(jugador);
        sopa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgSopaDeLetrasActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        MenuPrincipal regresar = new MenuPrincipal();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        Categorias regresar = new Categorias(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

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
//            java.util.logging.Logger.getLogger(JuegosFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JuegosFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JuegosFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JuegosFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Jugador jugador = new Jugador("","");
//                jugador.offline();
//                new JuegosFrutas(jugador).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImgAhorcado;
    private javax.swing.JButton btnImgInicio;
    private javax.swing.JButton btnImgLoteria;
    private javax.swing.JButton btnImgPuzzle;
    private javax.swing.JButton btnImgRegresar;
    private javax.swing.JButton btnImgSopaDeLetras;
    private javax.swing.JButton btnImgSoporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblpuntuacionGlobal;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}

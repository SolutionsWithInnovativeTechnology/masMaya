package JuegoMaya;
import Util.Jugador;
import Util.Botones;
import Util.ReproductorSonido;
import javax.swing.JOptionPane;

public class InformacionFrutas extends javax.swing.JFrame {
    Jugador jugador;
    ReproductorSonido reproductor = new ReproductorSonido();
    public InformacionFrutas(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        Botones.transparenciaButton(btnImgAyuda); 
        Botones.transparenciaButton(btnImgRegresar);
        Botones.transparenciaButton(btnPlatano);
        Botones.transparenciaButton(jButton2);
        Botones.transparenciaButton(jButton3);
        Botones.transparenciaButton(jButton4);
        Botones.transparenciaButton(jButton5);
        Botones.transparenciaButton(btnSandia);
        Botones.transparenciaButton(btnCiruela);
        Botones.transparenciaButton(btnNaranja);
        Botones.transparenciaButton(btnMamey);
        Botones.transparenciaButton(btnMango);
        Botones.transparenciaButton(btnJicama);
        Botones.transparenciaButton(btnTomate);
        Botones.transparenciaButton(btnZapote);
        Botones.transparenciaButton(btnPapaya);
        Botones.transparenciaButton(btnLimon);
        Botones.transparenciaButton(btnCalabaza);
        
        
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnImgRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnPlatano = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblFruta = new javax.swing.JLabel();
        btnImgAyuda = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnSandia = new javax.swing.JButton();
        btnCiruela = new javax.swing.JButton();
        btnNaranja = new javax.swing.JButton();
        btnMamey = new javax.swing.JButton();
        btnMango = new javax.swing.JButton();
        btnJicama = new javax.swing.JButton();
        btnTomate = new javax.swing.JButton();
        btnZapote = new javax.swing.JButton();
        btnPapaya = new javax.swing.JButton();
        btnLimon = new javax.swing.JButton();
        btnCalabaza = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("+Maya");

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnImgRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 35, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Plátano");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Aguacate");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nance");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Guayaba");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hecho por: María, Alonso y Saúl");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Uva");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sandía");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 60, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ciruela");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Naranja");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 110, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Papaya");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 80, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mango");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Limón");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 60, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Calabaza");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 80, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Jicama");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 60, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Zapote");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 70, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tomate");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 80, 30));

        btnPlatano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatanoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlatano, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, 100));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 80, 100));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mamey");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 80, 30));

        lblFruta.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblFruta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFruta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 230, 30));

        btnImgAyuda.setBackground(new java.awt.Color(255, 237, 213));
        btnImgAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda.png"))); // NOI18N
        btnImgAyuda.setBorder(null);
        btnImgAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImgAyuda.setMaximumSize(new java.awt.Dimension(40, 40));
        btnImgAyuda.setMinimumSize(new java.awt.Dimension(40, 40));
        btnImgAyuda.setPreferredSize(new java.awt.Dimension(40, 40));
        btnImgAyuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAyuda1.png"))); // NOI18N
        btnImgAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgAyudaActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, -1, -1));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 103, 80, 90));

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 103, 80, 90));

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 203, 80, 100));

        btnSandia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSandiaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 203, 80, 100));

        btnCiruela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCiruelaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCiruela, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 203, 90, 100));

        btnNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaranjaActionPerformed(evt);
            }
        });
        jPanel1.add(btnNaranja, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 203, 90, 100));

        btnMamey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMameyActionPerformed(evt);
            }
        });
        jPanel1.add(btnMamey, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 313, 90, 90));

        btnMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMangoActionPerformed(evt);
            }
        });
        jPanel1.add(btnMango, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 313, 90, 90));

        btnJicama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJicamaActionPerformed(evt);
            }
        });
        jPanel1.add(btnJicama, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 313, 90, 90));

        btnTomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomateActionPerformed(evt);
            }
        });
        jPanel1.add(btnTomate, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 313, 100, 90));

        btnZapote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZapoteActionPerformed(evt);
            }
        });
        jPanel1.add(btnZapote, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 423, 90, 100));

        btnPapaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapayaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPapaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 423, 100, 100));

        btnLimon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimonActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 413, 90, 110));

        btnCalabaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalabazaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalabaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 423, 90, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/InfoEnMaya.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 590, 473));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reproducirNumero(int i){
        //reproductor.cargarSonido(getClass().getResource("../sonidos/"+i+".wav"));
        reproductor.cargarSonido("/sonidos/frutas/"+i+".wav");
        //reproductor.reproducir();
    }
    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosFrutas regresar = new JuegosFrutas(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Presiona cualquier fruta para escuchar su pronunciación y ver su escritura.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgAyudaActionPerformed

    private void btnPlatanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatanoActionPerformed
        reproducirNumero(0);
        lblFruta.setText("Ja'as");
    }//GEN-LAST:event_btnPlatanoActionPerformed

    private void btnCiruelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCiruelaActionPerformed
        reproducirNumero(6);
        lblFruta.setText("Abal");
    }//GEN-LAST:event_btnCiruelaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reproducirNumero(1);
        lblFruta.setText("Oon");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reproducirNumero(2);
        lblFruta.setText("Chi'");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        reproducirNumero(3);
        lblFruta.setText("Pichi´");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        reproducirNumero(4);
        lblFruta.setText("Aba");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSandiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSandiaActionPerformed
        reproducirNumero(5);
        lblFruta.setText("Chak bojonja'");
    }//GEN-LAST:event_btnSandiaActionPerformed

    private void btnNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaranjaActionPerformed
        reproducirNumero(7);
        lblFruta.setText("Ch'ujuk pak'áal");
    }//GEN-LAST:event_btnNaranjaActionPerformed

    private void btnMameyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMameyActionPerformed
        reproducirNumero(8);
        lblFruta.setText("Chakal ja'as");
    }//GEN-LAST:event_btnMameyActionPerformed

    private void btnMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMangoActionPerformed
        reproducirNumero(9);
        lblFruta.setText("Ook");
    }//GEN-LAST:event_btnMangoActionPerformed

    private void btnJicamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJicamaActionPerformed
        reproducirNumero(10);
        lblFruta.setText("Chi'ikma");
    }//GEN-LAST:event_btnJicamaActionPerformed

    private void btnTomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomateActionPerformed
        reproducirNumero(11);
        lblFruta.setText("P'aak");
    }//GEN-LAST:event_btnTomateActionPerformed

    private void btnZapoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZapoteActionPerformed
        reproducirNumero(12);
        lblFruta.setText("Ya'");
    }//GEN-LAST:event_btnZapoteActionPerformed

    private void btnPapayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapayaActionPerformed
        reproducirNumero(13);
        lblFruta.setText("Puut");
    }//GEN-LAST:event_btnPapayaActionPerformed

    private void btnLimonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimonActionPerformed
        reproducirNumero(14);
        lblFruta.setText("Su'uts' muliix");
    }//GEN-LAST:event_btnLimonActionPerformed

    private void btnCalabazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalabazaActionPerformed
        reproducirNumero(15);
        lblFruta.setText("K'uúm");
    }//GEN-LAST:event_btnCalabazaActionPerformed

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
//            java.util.logging.Logger.getLogger(Información.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Información.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Información.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Información.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Jugador jugador = new Jugador("","");
//                jugador.offline();
//                new Información(jugador).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalabaza;
    private javax.swing.JButton btnCiruela;
    private javax.swing.JButton btnImgAyuda;
    private javax.swing.JButton btnImgRegresar;
    private javax.swing.JButton btnJicama;
    private javax.swing.JButton btnLimon;
    private javax.swing.JButton btnMamey;
    private javax.swing.JButton btnMango;
    private javax.swing.JButton btnNaranja;
    private javax.swing.JButton btnPapaya;
    private javax.swing.JButton btnPlatano;
    private javax.swing.JButton btnSandia;
    private javax.swing.JButton btnTomate;
    private javax.swing.JButton btnZapote;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFruta;
    // End of variables declaration//GEN-END:variables
}

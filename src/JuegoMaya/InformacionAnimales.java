package JuegoMaya;
import Util.Jugador;
import Util.Botones;
import Util.ReproductorSonido;
import javax.swing.JOptionPane;

public class InformacionAnimales extends javax.swing.JFrame {
    Jugador jugador;
    ReproductorSonido reproductor = new ReproductorSonido();
    public InformacionAnimales(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        Botones.transparenciaButton(btnImgAyuda); 
        Botones.transparenciaButton(btnImgRegresar);
        Botones.transparenciaButton(btnAnimal0);
        Botones.transparenciaButton(btnAnimal1);
        Botones.transparenciaButton(btnAnimal2);
        Botones.transparenciaButton(btnAnimal3);
        Botones.transparenciaButton(btnAnimal4);
        Botones.transparenciaButton(btnAnimal5);
        Botones.transparenciaButton(btnAnimal6);
        Botones.transparenciaButton(btnAnimal7);
        Botones.transparenciaButton(btnAnimal8);
        Botones.transparenciaButton(btnAnimal9);
        Botones.transparenciaButton(btnAnimal10);
        Botones.transparenciaButton(btnAnimal11);
        Botones.transparenciaButton(btnAnimal12);
        Botones.transparenciaButton(btnAnimal13);
        Botones.transparenciaButton(btnAnimal14);
        Botones.transparenciaButton(btnAnimal15);
        
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
        btnAnimal0 = new javax.swing.JButton();
        btnAnimal1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblFruta = new javax.swing.JLabel();
        btnImgAyuda = new javax.swing.JButton();
        btnAnimal2 = new javax.swing.JButton();
        btnAnimal3 = new javax.swing.JButton();
        btnAnimal4 = new javax.swing.JButton();
        btnAnimal5 = new javax.swing.JButton();
        btnAnimal6 = new javax.swing.JButton();
        btnAnimal7 = new javax.swing.JButton();
        btnAnimal8 = new javax.swing.JButton();
        btnAnimal9 = new javax.swing.JButton();
        btnAnimal10 = new javax.swing.JButton();
        btnAnimal11 = new javax.swing.JButton();
        btnAnimal12 = new javax.swing.JButton();
        btnAnimal13 = new javax.swing.JButton();
        btnAnimal14 = new javax.swing.JButton();
        btnAnimal15 = new javax.swing.JButton();
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
        jLabel4.setText("Abeja");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 90, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ballena");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 120, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Búho");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Caballo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 70, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hecho por: María, Alonso y Saúl");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 610, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cerdo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Colibrí");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Conejo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Gallo");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 70, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Pez");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 80, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Jaguar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 80, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Serpiente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 90, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Tortuga");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 80, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mariposa");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 90, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Perro");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 80, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Pájaro");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 70, 30));

        btnAnimal0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal0ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 90, 100));

        btnAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 120, 100));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Gato");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 80, 30));

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

        btnAnimal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, 100));

        btnAnimal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 70, 100));

        btnAnimal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 80, 100));

        btnAnimal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, 100));

        btnAnimal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 70, 100));

        btnAnimal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 203, 80, 100));

        btnAnimal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 80, 100));

        btnAnimal9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 313, 80, 100));

        btnAnimal10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal10ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 313, 90, 100));

        btnAnimal11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal11ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 80, 100));

        btnAnimal12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal12ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 423, 80, 100));

        btnAnimal13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal13ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal13, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 423, 80, 100));

        btnAnimal14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal14ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 423, 90, 100));

        btnAnimal15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnimal15ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnimal15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 80, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/infoAnimales.png"))); // NOI18N
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
        reproductor.cargarSonido("/sonidos/animales/"+i+".wav");
    }
    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosAnimales regresar = new JuegosAnimales(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void btnImgAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Presiona cualquier animal para escuchar su pronunciación y ver su escritura.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgAyudaActionPerformed

    private void btnAnimal0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal0ActionPerformed
        reproducirNumero(0);
        lblFruta.setText("Kaab");
    }//GEN-LAST:event_btnAnimal0ActionPerformed

    private void btnAnimal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal6ActionPerformed
        reproducirNumero(6);
        lblFruta.setText("T'u'ul");
    }//GEN-LAST:event_btnAnimal6ActionPerformed

    private void btnAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal1ActionPerformed
        reproducirNumero(1);
        lblFruta.setText("Masam");
    }//GEN-LAST:event_btnAnimal1ActionPerformed

    private void btnAnimal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal2ActionPerformed
        reproducirNumero(2);
        lblFruta.setText("Tunkuluchú");
    }//GEN-LAST:event_btnAnimal2ActionPerformed

    private void btnAnimal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal3ActionPerformed
        reproducirNumero(3);
        lblFruta.setText("Tssímin");
    }//GEN-LAST:event_btnAnimal3ActionPerformed

    private void btnAnimal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal4ActionPerformed
        reproducirNumero(4);
        lblFruta.setText("Kekén");
    }//GEN-LAST:event_btnAnimal4ActionPerformed

    private void btnAnimal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal5ActionPerformed
        reproducirNumero(5);
        lblFruta.setText("Ts'unu'un");
    }//GEN-LAST:event_btnAnimal5ActionPerformed

    private void btnAnimal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal7ActionPerformed
        reproducirNumero(7);
        lblFruta.setText("T'eel");
    }//GEN-LAST:event_btnAnimal7ActionPerformed

    private void btnAnimal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal8ActionPerformed
        reproducirNumero(8);
        lblFruta.setText("Miis");
    }//GEN-LAST:event_btnAnimal8ActionPerformed

    private void btnAnimal9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal9ActionPerformed
        reproducirNumero(9);
        lblFruta.setText("Balam");
    }//GEN-LAST:event_btnAnimal9ActionPerformed

    private void btnAnimal10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal10ActionPerformed
        reproducirNumero(10);
        lblFruta.setText("Peépem");
    }//GEN-LAST:event_btnAnimal10ActionPerformed

    private void btnAnimal11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal11ActionPerformed
        reproducirNumero(11);
        lblFruta.setText("Chi'ich");
    }//GEN-LAST:event_btnAnimal11ActionPerformed

    private void btnAnimal12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal12ActionPerformed
        reproducirNumero(12);
        lblFruta.setText("Peek'");
    }//GEN-LAST:event_btnAnimal12ActionPerformed

    private void btnAnimal13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal13ActionPerformed
        reproducirNumero(13);
        lblFruta.setText("Kai");
    }//GEN-LAST:event_btnAnimal13ActionPerformed

    private void btnAnimal14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal14ActionPerformed
        reproducirNumero(14);
        lblFruta.setText("Kan");
    }//GEN-LAST:event_btnAnimal14ActionPerformed

    private void btnAnimal15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnimal15ActionPerformed
        reproducirNumero(15);
        lblFruta.setText("Àak");
    }//GEN-LAST:event_btnAnimal15ActionPerformed

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
    private javax.swing.JButton btnAnimal0;
    private javax.swing.JButton btnAnimal1;
    private javax.swing.JButton btnAnimal10;
    private javax.swing.JButton btnAnimal11;
    private javax.swing.JButton btnAnimal12;
    private javax.swing.JButton btnAnimal13;
    private javax.swing.JButton btnAnimal14;
    private javax.swing.JButton btnAnimal15;
    private javax.swing.JButton btnAnimal2;
    private javax.swing.JButton btnAnimal3;
    private javax.swing.JButton btnAnimal4;
    private javax.swing.JButton btnAnimal5;
    private javax.swing.JButton btnAnimal6;
    private javax.swing.JButton btnAnimal7;
    private javax.swing.JButton btnAnimal8;
    private javax.swing.JButton btnAnimal9;
    private javax.swing.JButton btnImgAyuda;
    private javax.swing.JButton btnImgRegresar;
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

package JuegoMaya;
import Util.Jugador;
import Util.Botones;
import Util.ReproductorSonido;
import javax.swing.JOptionPane;

public class InformacionFrasesComunes extends javax.swing.JFrame {
    Jugador jugador;
    ReproductorSonido reproductor = new ReproductorSonido();
    public InformacionFrasesComunes(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        Botones.transparenciaButton(btnImgAyuda); 
        Botones.transparenciaButton(btnImgRegresar);
        setResizable(false);
    }
    
    private void reproducirFrase(int i){
        reproductor.cargarSonido("/sonidos/frases/"+i+".wav"); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnImgRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnImgAyuda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();

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
        jPanel1.add(btnImgRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 35, 35));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hecho por: María, Alonso y Saúl");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 640, -1, -1));

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
        jPanel1.add(btnImgAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FRASES COMUNES EN MAYA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 820, -1));

        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("De nada --- Mix ba'al");
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, -1));

        lbl17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl17.setText("Hasta mañana --- Tak sáamal");
        lbl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl17MouseClicked(evt);
            }
        });
        jPanel1.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 290, -1));

        lbl9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Me llamo --- In k'aaba'e");
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, -1));

        lbl19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl19.setText("Muchas gracias --- Jach níib óolal");
        lbl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl19MouseClicked(evt);
            }
        });
        jPanel1.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 300, -1));

        lbl11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setText("Todos los días --- Sáamsamal");
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, -1));

        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Más tarde --- Ka'akate'");
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, -1));

        lbl16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16.setText("¿Cómo te llamas? --- Biix a ka'aaba'");
        lbl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl16MouseClicked(evt);
            }
        });
        jPanel1.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 330, -1));

        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("¿Cómo estás? --- Bix a beel");
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 350, -1));

        lbl8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("¿A dónde vas? --- Tu'ux ka bin");
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 350, -1));

        lbl12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.setText("¿Qué haces? --- Ba'ax ka beetik");
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 350, -1));

        lbl6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("¿Dónde estás? - Tu'ux yanech");
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 350, -1));

        lbl18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl18.setText("¿Cómo se llama tu papá? --- Bix u k'aaba' a na'");
        lbl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl18MouseClicked(evt);
            }
        });
        jPanel1.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 400, -1));

        lbl15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15.setText("Estoy feliz --- Ki'imak in wóol");
        lbl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl15MouseClicked(evt);
            }
        });
        jPanel1.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 270, -1));

        lbl20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl20.setText("¿Cómo se llama tu mamá? --- Bix u k'aaba' a yuum");
        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });
        jPanel1.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 430, -1));

        lbl10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("Estoy triste --- Luba'an in wóol");
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 260, -1));

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Por favor --- Bet uts");
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, -1));

        lbl13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setText("Buenos días --- Ma'alob k'iin");
        lbl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl13MouseClicked(evt);
            }
        });
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 260, -1));

        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Cuídate --- Kanáantabaj");
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lbl14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl14.setText("Buenas tardes --- Ma'alob a'k'ab");
        lbl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl14MouseClicked(evt);
            }
        });
        jPanel1.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 300, -1));

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Te amo --- In yaakumech");
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Presiona cualquier frase para escuchar su pronunciación en maya.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnImgAyudaActionPerformed

    private void btnImgRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgRegresarActionPerformed
        JuegosFrasesComunes regresar = new JuegosFrasesComunes(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgRegresarActionPerformed

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        reproducirFrase(0);
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        reproducirFrase(1);
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        reproducirFrase(2);
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        reproducirFrase(3);
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        reproducirFrase(4);
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        reproducirFrase(5);
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        reproducirFrase(6);
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        reproducirFrase(7);
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        reproducirFrase(8);
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        reproducirFrase(9);
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        reproducirFrase(10);
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        reproducirFrase(11);
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl13MouseClicked
        reproducirFrase(12);
    }//GEN-LAST:event_lbl13MouseClicked

    private void lbl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl14MouseClicked
        reproducirFrase(13);
    }//GEN-LAST:event_lbl14MouseClicked

    private void lbl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl15MouseClicked
        reproducirFrase(14);
    }//GEN-LAST:event_lbl15MouseClicked

    private void lbl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl16MouseClicked
        reproducirFrase(15);
    }//GEN-LAST:event_lbl16MouseClicked

    private void lbl17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl17MouseClicked
        reproducirFrase(16);
    }//GEN-LAST:event_lbl17MouseClicked

    private void lbl18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl18MouseClicked
        reproducirFrase(17);
    }//GEN-LAST:event_lbl18MouseClicked

    private void lbl19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl19MouseClicked
        reproducirFrase(18);
    }//GEN-LAST:event_lbl19MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        reproducirFrase(19);
    }//GEN-LAST:event_lbl20MouseClicked

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
    private javax.swing.JButton btnImgAyuda;
    private javax.swing.JButton btnImgRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables
}

package JuegoMaya;

import Util.Jugador;
import Util.Botones;
import java.time.LocalTime;

public class Categorias extends javax.swing.JFrame {
    Jugador jugador;
    public Categorias(Jugador jugador) {
        this.jugador = jugador;
        initComponents();
        lblpuntuacionGlobal.setText(jugador.getPuntuacion()+"");
        if(!jugador.isOffline())
        {
            lblUsuario.setText(this.jugador.getUsuario());    
        }
        Botones.transparenciaButton(btnImgInicio);
        Botones.transparenciaButtonBorder(btnImgNumeros);
        Botones.transparenciaButtonBorder(btnImgFrutas);
        Botones.transparenciaButtonBorder(btnImgFrasesCotidianas);
        Botones.transparenciaButtonBorder(btnImgAnimales);
        setResizable(false);
        if(jugador.isOffline()){
            btnRanking.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImgNumeros = new javax.swing.JButton();
        btnImgFrutas = new javax.swing.JButton();
        btnImgInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnImgAnimales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRanking = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblpuntuacionGlobal = new javax.swing.JLabel();
        btnImgFrasesCotidianas = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        lblSaludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("+Maya");
        setBackground(new java.awt.Color(255, 237, 213));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 237, 213));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(162, 35, 29));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 65, 228, 50));

        btnImgNumeros.setBackground(new java.awt.Color(255, 237, 213));
        btnImgNumeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngNumeros.png"))); // NOI18N
        btnImgNumeros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgNumeros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgNumeros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngNumeros1.png"))); // NOI18N
        btnImgNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgNumerosActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgNumeros, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 140, 165, 158));

        btnImgFrutas.setBackground(new java.awt.Color(255, 237, 213));
        btnImgFrutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngFrutas.png"))); // NOI18N
        btnImgFrutas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgFrutas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgFrutas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngFrutas1.png"))); // NOI18N
        btnImgFrutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgFrutasActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgFrutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 140, 165, 158));

        btnImgInicio.setBackground(new java.awt.Color(255, 237, 213));
        btnImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar.png"))); // NOI18N
        btnImgInicio.setBorder(null);
        btnImgInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngRegresar1.png"))); // NOI18N
        btnImgInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 583, 34, 37));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NÚMEROS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 304, 155, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FRUTAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 304, -1, -1));

        btnImgAnimales.setBackground(new java.awt.Color(255, 237, 213));
        btnImgAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAnimales.png"))); // NOI18N
        btnImgAnimales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgAnimales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgAnimales.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngAnimales1.png"))); // NOI18N
        btnImgAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 337, 165, 158));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ANIMALES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 501, 165, -1));

        btnRanking.setBackground(new java.awt.Color(255, 237, 213));
        btnRanking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRanking.setText("Ranking");
        btnRanking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(162, 35, 29), 3));
        btnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankingActionPerformed(evt);
            }
        });
        jPanel1.add(btnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 587, 81, 33));

        lblUsuario.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 0, 168, 38));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Puntuación global:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 44, -1, -1));
        jPanel1.add(lblpuntuacionGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 44, 49, 15));

        btnImgFrasesCotidianas.setBackground(new java.awt.Color(255, 237, 213));
        btnImgFrasesCotidianas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngFrasesCotidianas.png"))); // NOI18N
        btnImgFrasesCotidianas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 168, 107), 3, true));
        btnImgFrasesCotidianas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnImgFrasesCotidianas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pngFrasesCotidianas1.png"))); // NOI18N
        btnImgFrasesCotidianas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgFrasesCotidianasActionPerformed(evt);
            }
        });
        jPanel1.add(btnImgFrasesCotidianas, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 337, 165, 158));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FRASES COMUNES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 501, 165, -1));

        jPanel2.setBackground(new java.awt.Color(255, 237, 213));

        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(731, 731, 731)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 532, 359, -1));

        lblSaludo.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lblSaludo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaludo.setText("Saludo");
        lblSaludo.setToolTipText("");
        jPanel1.add(lblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImgNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgNumerosActionPerformed
        JuegosNumeros entrar = new JuegosNumeros(jugador);
        entrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgNumerosActionPerformed

    private void btnImgFrutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgFrutasActionPerformed
        JuegosFrutas entrar = new JuegosFrutas(jugador);
        entrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgFrutasActionPerformed

    private void btnImgInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgInicioActionPerformed
        InicioJuego regresar = new InicioJuego();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgInicioActionPerformed

    private void btnImgAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgAnimalesActionPerformed
        JuegosAnimales entrar = new JuegosAnimales(jugador);
        entrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgAnimalesActionPerformed

    private void btnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankingActionPerformed
        Ranking regresar = new Ranking(jugador);
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRankingActionPerformed

    private void btnImgFrasesCotidianasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgFrasesCotidianasActionPerformed
        JuegosFrasesComunes entrar = new JuegosFrasesComunes(jugador);
        entrar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnImgFrasesCotidianasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        LocalTime horaActual = LocalTime.now();
        
        LocalTime inicioManana = LocalTime.of(5, 0);
        LocalTime finManana = LocalTime.of(11, 59);
        LocalTime inicioTarde = LocalTime.of(12, 0);
        LocalTime finTarde = LocalTime.of(18, 59);
        LocalTime inicioNoche = LocalTime.of(19, 0);
        LocalTime finNoche = LocalTime.of(23, 59);
        
        if (horaActual.isAfter(inicioManana) && horaActual.isBefore(finManana)) {
            lblSaludo.setText("Ma'alob k'iin");
        } else if (horaActual.isAfter(inicioTarde) && horaActual.isBefore(finTarde)) {
            lblSaludo.setText("Ma'alob a'k'ab");
        } else {
            lblSaludo.setText("Ma'alob chinil kiin");
        }
    }//GEN-LAST:event_formWindowActivated

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
//            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Jugador jugador = new Jugador("","");
//                new Categorias(jugador).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImgAnimales;
    private javax.swing.JButton btnImgFrasesCotidianas;
    private javax.swing.JButton btnImgFrutas;
    private javax.swing.JButton btnImgInicio;
    private javax.swing.JButton btnImgNumeros;
    private javax.swing.JButton btnRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblpuntuacionGlobal;
    // End of variables declaration//GEN-END:variables
}

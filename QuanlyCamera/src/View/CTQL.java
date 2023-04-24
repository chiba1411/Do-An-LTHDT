package View;

public class CTQL extends javax.swing.JFrame {

    public CTQL() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnqlcr = new javax.swing.JButton();
        btninstantcamera = new javax.swing.JButton();
        btndigitalcamera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHƯƠNG TRÌNH QUẢN LÝ MÁY ẢNH");

        btnqlcr.setText("QUẢN LÝ MÁY ẢNH");
        btnqlcr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnqlcrActionPerformed(evt);
            }
        });

        btninstantcamera.setText("QUẢN LÝ INSTANTCAMERA");
        btninstantcamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninstantcameraActionPerformed(evt);
            }
        });

        btndigitalcamera.setText("QUẢN LÝ DGITALCAMERA");
        btndigitalcamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndigitalcameraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btndigitalcamera, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btninstantcamera)
                                .addComponent(btnqlcr, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(btnqlcr)
                .addGap(33, 33, 33)
                .addComponent(btninstantcamera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btndigitalcamera)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnqlcrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnqlcrActionPerformed
        // TODO add your handling code here:
        dispose();
        QuanLyCR ql = new QuanLyCR();
        ql.setVisible(true);

    }//GEN-LAST:event_btnqlcrActionPerformed

    private void btninstantcameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninstantcameraActionPerformed
        // TODO add your handling code here:
        dispose();
        QLInstantCamera ql2 = new QLInstantCamera();
        ql2.setVisible(true);

    }//GEN-LAST:event_btninstantcameraActionPerformed

    private void btndigitalcameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndigitalcameraActionPerformed
        // TODO add your handling code here:
        dispose();
        QLDigitalCamera ql2 = new QLDigitalCamera();
        ql2.setVisible(true);
    }//GEN-LAST:event_btndigitalcameraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CTQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CTQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CTQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CTQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CTQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndigitalcamera;
    private javax.swing.JButton btninstantcamera;
    private javax.swing.JButton btnqlcr;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

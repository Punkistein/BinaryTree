package vista;

import controlador.ControlInputs;
import javax.swing.JOptionPane;

public class VistaPrincipal extends javax.swing.JFrame {

    public ControlInputs objControlInputs;
    JOptionPane mensajeMostrar;
    
    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblTema = new javax.swing.JLabel();
        jlblLongitud = new javax.swing.JLabel();
        jlblValor = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jtfLongitud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTema.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jlblTema.setForeground(new java.awt.Color(255, 255, 255));
        jlblTema.setText("Binary Search");
        jPanel1.add(jlblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jlblLongitud.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jlblLongitud.setForeground(new java.awt.Color(255, 255, 255));
        jlblLongitud.setText("Longitud");
        jPanel1.add(jlblLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jlblValor.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        jlblValor.setForeground(new java.awt.Color(255, 255, 255));
        jlblValor.setText("Valor");
        jPanel1.add(jlblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));
        jPanel1.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 70, -1));
        jPanel1.add(jtfLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, -1));

        jButton1.setText("Cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        objControlInputs = new ControlInputs(jtfLongitud.getText(), jtfValor.getText());
        if (objControlInputs.mensajeUsuario != null) {
            mensajeMostrar.showMessageDialog(null, objControlInputs.mensajeUsuario);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblLongitud;
    private javax.swing.JLabel jlblTema;
    private javax.swing.JLabel jlblValor;
    private javax.swing.JTextField jtfLongitud;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}

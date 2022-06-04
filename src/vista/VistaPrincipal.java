package vista;

import controlador.ControlInputs;
import controlador.ControlTabla;
import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Tabla;

public class VistaPrincipal extends javax.swing.JFrame {

    public ControlInputs objControlInputs;
    public ControlTabla objControlTabla;
    public Tabla objTabla = new Tabla();
    JOptionPane mensajeMostrar;
    int xx, xy; //variables para obtener la posicion actual de la ventana
    
    public VistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlblTema = new javax.swing.JLabel();
        jlblLongitud = new javax.swing.JLabel();
        jlblValor = new javax.swing.JLabel();
        jtfValor = new javax.swing.JTextField();
        jtfLongitud = new javax.swing.JTextField();
        jbtnMostrarArbol = new javax.swing.JButton();
        jspScrollPane = new javax.swing.JScrollPane();
        jtblTree = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblTema.setFont(new java.awt.Font("Sitka Text", 0, 48)); // NOI18N
        jlblTema.setForeground(new java.awt.Color(255, 255, 255));
        jlblTema.setText("Binary Search");
        jlblTema.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jlblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, 50));

        jlblLongitud.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jlblLongitud.setForeground(new java.awt.Color(255, 255, 255));
        jlblLongitud.setText("Longitud");
        jPanel1.add(jlblLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jlblValor.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jlblValor.setForeground(new java.awt.Color(255, 255, 255));
        jlblValor.setText("Valor");
        jPanel1.add(jlblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, -1, -1));
        jPanel1.add(jtfValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 100, -1));

        jtfLongitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfLongitudMouseClicked(evt);
            }
        });
        jPanel1.add(jtfLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 100, -1));

        jbtnMostrarArbol.setBackground(new java.awt.Color(51, 177, 0));
        jbtnMostrarArbol.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMostrarArbol.setText("Mostrar Árbol");
        jbtnMostrarArbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnMostrarArbol.setFocusPainted(false);
        jbtnMostrarArbol.setFocusable(false);
        jbtnMostrarArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnMostrarArbolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnMostrarArbolMouseExited(evt);
            }
        });
        jbtnMostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarArbolActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnMostrarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 130, 40));

        jtblTree.setBackground(new java.awt.Color(255, 255, 255));
        jtblTree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jspScrollPane.setViewportView(jtblTree);

        jPanel1.add(jspScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 1170, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarArbolActionPerformed

        objControlInputs = new ControlInputs(jtfLongitud.getText(), jtfValor.getText());
        if (objControlInputs.mensajeUsuario != null) {
            mensajeMostrar.showMessageDialog(null, objControlInputs.mensajeUsuario);
        } else {
            objControlTabla = new ControlTabla();
            jtblTree.setModel(objControlTabla.construirHeader(Integer.parseInt(jtfLongitud.getText()), 0));
            for (int i = 0; i < objControlInputs.longitudDefinitiva; i++) {
                jtblTree.setModel(objControlTabla.llenarFila(Integer.parseInt(jtfLongitud.getText()), Integer.parseInt(jtfValor.getText())));
            }
            JOptionPane.showMessageDialog(null, "El número total de preguntas fue: " + objControlInputs.validacionSuperior(Integer.parseInt(jtfLongitud.getText())));
        }
    }//GEN-LAST:event_jbtnMostrarArbolActionPerformed

    private void jbtnMostrarArbolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMostrarArbolMouseEntered
        // TODO add your handling code here:
        Color a = new Color(51, 142, 0);
        jbtnMostrarArbol.setBackground(a);
    }//GEN-LAST:event_jbtnMostrarArbolMouseEntered

    private void jbtnMostrarArbolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMostrarArbolMouseExited
        // TODO add your handling code here:
        Color a = new Color(51, 177, 0);
        jbtnMostrarArbol.setBackground(a);
    }//GEN-LAST:event_jbtnMostrarArbolMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exitHover.png")));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        this.jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png")));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked
    
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xx, y - xy);
        
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jtfLongitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfLongitudMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLongitudMouseClicked

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
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VistaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnMostrarArbol;
    private javax.swing.JLabel jlblLongitud;
    private javax.swing.JLabel jlblTema;
    private javax.swing.JLabel jlblValor;
    private javax.swing.JScrollPane jspScrollPane;
    public static javax.swing.JTable jtblTree;
    private javax.swing.JTextField jtfLongitud;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}

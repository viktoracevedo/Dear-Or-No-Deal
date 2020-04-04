package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class DlogInicio extends javax.swing.JDialog {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DlogInicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        jLabel1.setIcon(newImage("inicio_1.png"));
        btnJugar.setPressedIcon(setPresssedButton("btnJugar.png"));
        btnSalir.setPressedIcon(setPresssedButton("btnSalir.png"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deal Or No Deal");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnSalir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 233, 77));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnJugar.png"))); // NOI18N
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 230, 77));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inicio_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnJugarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private ImageIcon setPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 5, icon.getIconHeight() - 5, Image.SCALE_DEFAULT));
        return icono;
    }
    private ImageIcon newImage(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(470, icon.getIconHeight(), Image.SCALE_DEFAULT));
        return icono;
    }

}

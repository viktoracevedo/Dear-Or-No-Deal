package game;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class DlogMessenge extends javax.swing.JDialog {

    

    public DlogMessenge(JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lblTxt.setText("Te Has Llevado $" + DearOrNoDealFrame.aux +" Dollares");
        jLabel2.setIcon(setDimension("rectangulo.png"));
        btnSalir.setPressedIcon(setDimension("btnSalir.png"));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt.setText("hola");
        jPanel1.add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/titulo_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/btnSalir2.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTxt;
    // End of variables declaration//GEN-END:variables

    private ImageIcon setDimension(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() + 200, icon.getIconHeight(), Image.SCALE_DEFAULT));
        return icono;
    }
}

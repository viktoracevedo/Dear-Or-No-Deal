package game;

import static game.DearOrNoDealFrame.aux;
import static game.DearOrNoDealFrame.ronda;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

public class DlogRonda extends javax.swing.JDialog {

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DlogRonda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        Random num = new Random();
        if(num.nextInt(2) == 1){
            lblFondo.setIcon(new ImageIcon(getClass().getResource("/image/banl.png")));
        }else{
            lblFondo.setIcon(new ImageIcon(getClass().getResource("/image/bankgirl.png")));
        }
        btnDeal.setPressedIcon(setPresssedButton("deal.png"));
        btnNoDeal.setPressedIcon(setPresssedButton("nodeal.png"));
        setTitle("A Question in The Round Number " + ronda);
        lblText1.setText("El Banco Te Llama..");
        lblText2.setText("Te Hacen Una Oferta Con La Pequeña Contadiad De");
        lblText3.setText("$" + aux);
        lblText.setText("Te Preguntan DEAL.. or NO DEAL!?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNoDeal = new javax.swing.JButton();
        btnDeal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        lblText3 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNoDeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/nodeal.png"))); // NOI18N
        btnNoDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoDealActionPerformed(evt);
            }
        });
        getContentPane().add(btnNoDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 200, 60));

        btnDeal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deal.png"))); // NOI18N
        btnDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDealActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/or.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 100, -1));

        lblText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("jLabel3");
        getContentPane().add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 470, 30));

        lblText1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText1.setText("jLabel3");
        getContentPane().add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, 30));

        lblText2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText2.setText("jLabel3");
        getContentPane().add(lblText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 480, 30));

        lblText3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblText3.setForeground(new java.awt.Color(255, 255, 255));
        lblText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText3.setText("jLabel3");
        getContentPane().add(lblText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 480, 30));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/banl.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNoDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoDealActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnNoDealActionPerformed

    private void btnDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDealActionPerformed
        DlogMessenge dlogMessenge = new DlogMessenge(this, true);
        dlogMessenge.setVisible(true);
    }//GEN-LAST:event_btnDealActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeal;
    private javax.swing.JButton btnNoDeal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblText3;
    // End of variables declaration//GEN-END:variables
    
    private ImageIcon setPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 5, icon.getIconHeight() - 5, Image.SCALE_DEFAULT));
        return icono;
    }


}

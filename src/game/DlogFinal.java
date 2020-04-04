package game;

import java.awt.Image;
import javax.swing.ImageIcon;

public class DlogFinal extends javax.swing.JDialog {
    public DlogFinal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lblText.setText("Fin Del Juego..");
        lblText1.setText("Solo Que Dan Dos De Maletines");
        lblText2.setText("¿Cual Eliges?");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUno = new javax.swing.JLabel();
        lblTwo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("END THE GAME");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/maleta.png"))); // NOI18N
        lblUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUnoMouseClicked(evt);
            }
        });
        jPanel1.add(lblUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 90));

        lblTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        lblTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTwoMouseClicked(evt);
            }
        });
        jPanel1.add(lblTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/or.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, -1));

        lblText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText.setText("jLabel4");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 30));

        lblText1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText1.setText("jLabel4");
        jPanel1.add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 480, 30));

        lblText2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblText2.setForeground(new java.awt.Color(255, 255, 255));
        lblText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblText2.setText("jLabel4");
        jPanel1.add(lblText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 480, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/men.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/base.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUnoMouseClicked
        lblUno.setIcon(setPresssedButton("maleta.png"));
        System.out.println(DearOrNoDealFrame.maletinGuadardo + "hola");
        DearOrNoDealFrame.aux = Integer.valueOf(DearOrNoDealFrame.LISTA.get(DearOrNoDealFrame.maletinGuadardo));
        DlogMessenge dlogmessnege = new DlogMessenge(this, true);
        dlogmessnege.setVisible(true);
    }//GEN-LAST:event_lblUnoMouseClicked

    private void lblTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTwoMouseClicked
        lblTwo.setIcon(setPresssedButton("m.png"));
        
        DlogMessenge dlogmessnege = new DlogMessenge(this, true);
        dlogmessnege.setVisible(true);
    }//GEN-LAST:event_lblTwoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText1;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblTwo;
    private javax.swing.JLabel lblUno;
    // End of variables declaration//GEN-END:variables

    private ImageIcon setPresssedButton(String nameImage){
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/" + nameImage));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(icon.getIconWidth() - 5, icon.getIconHeight() - 5, Image.SCALE_DEFAULT));
        return icono;
    }

}

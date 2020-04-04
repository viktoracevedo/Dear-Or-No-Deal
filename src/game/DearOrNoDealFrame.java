package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class DearOrNoDealFrame extends javax.swing.JFrame {
    private DlogInicio dlogInicio;
    private DlogRonda dlogRonda;
    private Integer contador;
    private Integer rondaNum;
    public static Integer maletinGuadardo;
    public static Integer ronda;
    public static Integer aux;
    private JLabel[] arrayMaletin;
    private JLabel[] arrayValue;
    private JLabel[] arrayLbl;
    private JLabel[] rectanguloOro;
    public static final String[] NUM = {"1","2","3","4","5","6","7","8","9","10",
                                        "11","12","13","14","15","16","17","18","19",
                                        "20","21","22","23","24"};
    public static final ArrayList<String> LISTA = new ArrayList<>();
    private String[] dinero = {"1","2","10","25","50","75","100",
                               "200","300","400","500","750","1000",
                                "5000","10000","25000","50000","100000",
                                "200000","300000","400000","500000","750000","1000000"};

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DearOrNoDealFrame() {
        initComponents();
        this.setVisible(false);
        dlogInicio = new DlogInicio(this, true);
        dlogInicio.setVisible(true);
        this.setVisible(true);
        setExtendedState(6);
        setSize(new Dimension(getToolkit().getScreenSize().width, getToolkit().getScreenSize().height - 33));
        setLocationRelativeTo(null);
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/panel.jpg"));
        imgpanel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(
                getToolkit().getScreenSize().width, 
                getToolkit().getScreenSize().height, 
                Image.SCALE_DEFAULT)));
        initArrays();
        contador = 0;
        rondaNum = 9;
        DearOrNoDealFrame.maletinGuadardo = -1;
        DearOrNoDealFrame.aux = 0;
        DearOrNoDealFrame.ronda = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaletin1 = new javax.swing.JLabel();
        lblMaletin2 = new javax.swing.JLabel();
        lblMaletin3 = new javax.swing.JLabel();
        lblMaletin4 = new javax.swing.JLabel();
        lblMaletin5 = new javax.swing.JLabel();
        lblMaletin6 = new javax.swing.JLabel();
        lblMaletin7 = new javax.swing.JLabel();
        lblMaletin8 = new javax.swing.JLabel();
        lblMaletin9 = new javax.swing.JLabel();
        lblMaletin10 = new javax.swing.JLabel();
        lblMaletin11 = new javax.swing.JLabel();
        lblMaletin12 = new javax.swing.JLabel();
        lblMaletin13 = new javax.swing.JLabel();
        lblMaletin14 = new javax.swing.JLabel();
        lblMaletin15 = new javax.swing.JLabel();
        lblMaletin16 = new javax.swing.JLabel();
        lblMaletin17 = new javax.swing.JLabel();
        lblMaletin18 = new javax.swing.JLabel();
        lblMaletin19 = new javax.swing.JLabel();
        lblMaletin20 = new javax.swing.JLabel();
        lblMaletin21 = new javax.swing.JLabel();
        lblMaletin22 = new javax.swing.JLabel();
        lblMaletin23 = new javax.swing.JLabel();
        lblMaletin24 = new javax.swing.JLabel();
        lblMostrar = new javax.swing.JLabel();
        lblValue1 = new javax.swing.JLabel();
        lblValue2 = new javax.swing.JLabel();
        lblValue3 = new javax.swing.JLabel();
        lblValue4 = new javax.swing.JLabel();
        lblValue5 = new javax.swing.JLabel();
        lblValue6 = new javax.swing.JLabel();
        lblValue7 = new javax.swing.JLabel();
        lblValue8 = new javax.swing.JLabel();
        lblValue9 = new javax.swing.JLabel();
        lblValue10 = new javax.swing.JLabel();
        lblValue11 = new javax.swing.JLabel();
        lblValue12 = new javax.swing.JLabel();
        lblValue13 = new javax.swing.JLabel();
        lblValue14 = new javax.swing.JLabel();
        lblValue15 = new javax.swing.JLabel();
        lblValue16 = new javax.swing.JLabel();
        lblValue17 = new javax.swing.JLabel();
        lblValue18 = new javax.swing.JLabel();
        lblValue19 = new javax.swing.JLabel();
        lblValue20 = new javax.swing.JLabel();
        lblValue21 = new javax.swing.JLabel();
        lblValue22 = new javax.swing.JLabel();
        lblValue23 = new javax.swing.JLabel();
        lblValue24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblBoton1 = new javax.swing.JLabel();
        lblBoton2 = new javax.swing.JLabel();
        lblBoton3 = new javax.swing.JLabel();
        lblBoton4 = new javax.swing.JLabel();
        lblBoton5 = new javax.swing.JLabel();
        lblBoton6 = new javax.swing.JLabel();
        lblBoton7 = new javax.swing.JLabel();
        lblBoton8 = new javax.swing.JLabel();
        lblBoton9 = new javax.swing.JLabel();
        lblBoton10 = new javax.swing.JLabel();
        lblBoton11 = new javax.swing.JLabel();
        lblBoton12 = new javax.swing.JLabel();
        lblBoton13 = new javax.swing.JLabel();
        lblBoton14 = new javax.swing.JLabel();
        lblBoton15 = new javax.swing.JLabel();
        lblBoton16 = new javax.swing.JLabel();
        lblBoton17 = new javax.swing.JLabel();
        lblBoton18 = new javax.swing.JLabel();
        lblBoton19 = new javax.swing.JLabel();
        lblBoton20 = new javax.swing.JLabel();
        lblBoton22 = new javax.swing.JLabel();
        lblBoton21 = new javax.swing.JLabel();
        lblBoton23 = new javax.swing.JLabel();
        lblBoton24 = new javax.swing.JLabel();
        imgpanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DEAL OR NO DEAL");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaletin1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin1.setText("1");
        lblMaletin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin1MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 150, 100));

        lblMaletin2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin2.setText("2");
        lblMaletin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin2MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 150, 100));

        lblMaletin3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin3.setText("3");
        lblMaletin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin3MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 150, 100));

        lblMaletin4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin4.setText("4");
        lblMaletin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin4MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 150, 100));

        lblMaletin5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin5.setText("5");
        lblMaletin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin5MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 150, 100));

        lblMaletin6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin6.setText("6");
        lblMaletin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin6MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 150, 100));

        lblMaletin7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin7.setText("7");
        lblMaletin7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin7MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 150, 100));

        lblMaletin8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin8.setText("8");
        lblMaletin8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin8MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 150, 100));

        lblMaletin9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin9.setText("9");
        lblMaletin9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin9MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 150, 100));

        lblMaletin10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin10.setText("10");
        lblMaletin10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin10MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 150, 100));

        lblMaletin11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin11.setText("11");
        lblMaletin11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin11MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 150, 100));

        lblMaletin12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin12.setText("12");
        lblMaletin12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin12MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, 150, 100));

        lblMaletin13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin13.setText("13");
        lblMaletin13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin13MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 150, 100));

        lblMaletin14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin14.setText("14");
        lblMaletin14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin14MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 150, 100));

        lblMaletin15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin15.setText("15");
        lblMaletin15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin15MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 150, 100));

        lblMaletin16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin16.setText("16");
        lblMaletin16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin16MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 150, 100));

        lblMaletin17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin17.setText("17");
        lblMaletin17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin17MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin17, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 150, 100));

        lblMaletin18.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin18.setText("18");
        lblMaletin18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin18MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 150, 100));

        lblMaletin19.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin19.setText("19");
        lblMaletin19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin19MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 150, 100));

        lblMaletin20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin20.setText("20");
        lblMaletin20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin20MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 150, 100));

        lblMaletin21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin21.setText("21");
        lblMaletin21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin21MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, 150, 100));

        lblMaletin22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin22.setText("22");
        lblMaletin22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin22MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 150, 100));

        lblMaletin23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin23.setText("23");
        lblMaletin23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin23MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 150, 100));

        lblMaletin24.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMaletin24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaletin24.setText("24");
        lblMaletin24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaletin24MouseClicked(evt);
            }
        });
        jPanel1.add(lblMaletin24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 150, 100));

        lblMostrar.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(23, 16, 16));
        lblMostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMostrar.setText("CHOOSE YOUR CASE");
        jPanel1.add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        lblValue1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue1.setForeground(new java.awt.Color(255, 255, 255));
        lblValue1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 50));

        lblValue2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue2.setForeground(new java.awt.Color(255, 255, 255));
        lblValue2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 250, 50));

        lblValue3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue3.setForeground(new java.awt.Color(255, 255, 255));
        lblValue3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 50));

        lblValue4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue4.setForeground(new java.awt.Color(255, 255, 255));
        lblValue4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 50));

        lblValue5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue5.setForeground(new java.awt.Color(255, 255, 255));
        lblValue5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 250, 50));

        lblValue6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue6.setForeground(new java.awt.Color(255, 255, 255));
        lblValue6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 50));

        lblValue7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue7.setForeground(new java.awt.Color(255, 255, 255));
        lblValue7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 250, 50));

        lblValue8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue8.setForeground(new java.awt.Color(255, 255, 255));
        lblValue8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 50));

        lblValue9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue9.setForeground(new java.awt.Color(255, 255, 255));
        lblValue9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 250, 50));

        lblValue10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue10.setForeground(new java.awt.Color(255, 255, 255));
        lblValue10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 250, 50));

        lblValue11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue11.setForeground(new java.awt.Color(255, 255, 255));
        lblValue11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 250, 50));

        lblValue12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue12.setForeground(new java.awt.Color(255, 255, 255));
        lblValue12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 250, 50));

        lblValue13.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue13.setForeground(new java.awt.Color(255, 255, 255));
        lblValue13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, 250, 50));

        lblValue14.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue14.setForeground(new java.awt.Color(255, 255, 255));
        lblValue14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, 250, 50));

        lblValue15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue15.setForeground(new java.awt.Color(255, 255, 255));
        lblValue15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 250, 50));

        lblValue16.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue16.setForeground(new java.awt.Color(255, 255, 255));
        lblValue16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, 250, 50));

        lblValue17.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue17.setForeground(new java.awt.Color(255, 255, 255));
        lblValue17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, 250, 50));

        lblValue18.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue18.setForeground(new java.awt.Color(255, 255, 255));
        lblValue18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, 250, 50));

        lblValue19.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue19.setForeground(new java.awt.Color(255, 255, 255));
        lblValue19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, 250, 50));

        lblValue20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue20.setForeground(new java.awt.Color(255, 255, 255));
        lblValue20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 420, 250, 50));

        lblValue21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue21.setForeground(new java.awt.Color(255, 255, 255));
        lblValue21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, 250, 50));

        lblValue22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue22.setForeground(new java.awt.Color(255, 255, 255));
        lblValue22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, 250, 50));

        lblValue23.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue23.setForeground(new java.awt.Color(255, 255, 255));
        lblValue23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, 250, 50));

        lblValue24.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblValue24.setForeground(new java.awt.Color(255, 255, 255));
        lblValue24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblValue24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 620, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 70, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 270, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 320, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 370, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 420, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 470, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rectangulo.png"))); // NOI18N
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 620, -1, -1));

        lblBoton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, 100));

        lblBoton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, -1, 100));

        lblBoton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, 100));

        lblBoton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, 100));

        lblBoton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, 100));

        lblBoton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, 100));

        lblBoton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, -1, 100));

        lblBoton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, 100));

        lblBoton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, 100));

        lblBoton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, 100));

        lblBoton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, 100));

        lblBoton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 280, -1, 100));

        lblBoton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, 100));

        lblBoton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, 100));

        lblBoton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, 100));

        lblBoton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, -1, 100));

        lblBoton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 390, -1, 100));

        lblBoton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 100));

        lblBoton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, 100));

        lblBoton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, 100));

        lblBoton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, -1, 100));

        lblBoton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, 100));

        lblBoton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, 100));

        lblBoton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/m.png"))); // NOI18N
        jPanel1.add(lblBoton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, -1, 100));

        imgpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/panel.jpg"))); // NOI18N
        imgpanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.add(imgpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(739, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMaletin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin1MouseClicked
        desbloquear(0);
    }//GEN-LAST:event_lblMaletin1MouseClicked

    private void lblMaletin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin2MouseClicked
        desbloquear(1);
    }//GEN-LAST:event_lblMaletin2MouseClicked

    private void lblMaletin6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin6MouseClicked
        desbloquear(5);
    }//GEN-LAST:event_lblMaletin6MouseClicked

    private void lblMaletin7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin7MouseClicked
        desbloquear(6);
    }//GEN-LAST:event_lblMaletin7MouseClicked

    private void lblMaletin8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin8MouseClicked
        desbloquear(7);
    }//GEN-LAST:event_lblMaletin8MouseClicked

    private void lblMaletin9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin9MouseClicked
        desbloquear(8);
    }//GEN-LAST:event_lblMaletin9MouseClicked

    private void lblMaletin10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin10MouseClicked
        desbloquear(9);
    }//GEN-LAST:event_lblMaletin10MouseClicked

    private void lblMaletin11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin11MouseClicked
        desbloquear(10);
    }//GEN-LAST:event_lblMaletin11MouseClicked

    private void lblMaletin12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin12MouseClicked
        desbloquear(11);
    }//GEN-LAST:event_lblMaletin12MouseClicked

    private void lblMaletin13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin13MouseClicked
        desbloquear(12);
    }//GEN-LAST:event_lblMaletin13MouseClicked

    private void lblMaletin14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin14MouseClicked
        desbloquear(13);
    }//GEN-LAST:event_lblMaletin14MouseClicked

    private void lblMaletin15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin15MouseClicked
        desbloquear(14);
    }//GEN-LAST:event_lblMaletin15MouseClicked

    private void lblMaletin16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin16MouseClicked
        desbloquear(15);
    }//GEN-LAST:event_lblMaletin16MouseClicked

    private void lblMaletin17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin17MouseClicked
        desbloquear(16);
    }//GEN-LAST:event_lblMaletin17MouseClicked

    private void lblMaletin18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin18MouseClicked
        desbloquear(17);
    }//GEN-LAST:event_lblMaletin18MouseClicked

    private void lblMaletin19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin19MouseClicked
       desbloquear(18);
    }//GEN-LAST:event_lblMaletin19MouseClicked

    private void lblMaletin20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin20MouseClicked
        desbloquear(19);
    }//GEN-LAST:event_lblMaletin20MouseClicked

    private void lblMaletin21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin21MouseClicked
        desbloquear(20);
    }//GEN-LAST:event_lblMaletin21MouseClicked

    private void lblMaletin22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin22MouseClicked
        desbloquear(21);
    }//GEN-LAST:event_lblMaletin22MouseClicked

    private void lblMaletin23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin23MouseClicked
        desbloquear(22);
    }//GEN-LAST:event_lblMaletin23MouseClicked

    private void lblMaletin24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin24MouseClicked
        desbloquear(23);
    }//GEN-LAST:event_lblMaletin24MouseClicked

    private void lblMaletin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin5MouseClicked
        desbloquear(4);
    }//GEN-LAST:event_lblMaletin5MouseClicked

    private void lblMaletin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin4MouseClicked
        desbloquear(3);
    }//GEN-LAST:event_lblMaletin4MouseClicked

    private void lblMaletin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaletin3MouseClicked
        desbloquear(2);
    }//GEN-LAST:event_lblMaletin3MouseClicked

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
            java.util.logging.Logger.getLogger(DearOrNoDealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DearOrNoDealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DearOrNoDealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DearOrNoDealFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DearOrNoDealFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgpanel;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoton1;
    private javax.swing.JLabel lblBoton10;
    private javax.swing.JLabel lblBoton11;
    private javax.swing.JLabel lblBoton12;
    private javax.swing.JLabel lblBoton13;
    private javax.swing.JLabel lblBoton14;
    private javax.swing.JLabel lblBoton15;
    private javax.swing.JLabel lblBoton16;
    private javax.swing.JLabel lblBoton17;
    private javax.swing.JLabel lblBoton18;
    private javax.swing.JLabel lblBoton19;
    private javax.swing.JLabel lblBoton2;
    private javax.swing.JLabel lblBoton20;
    private javax.swing.JLabel lblBoton21;
    private javax.swing.JLabel lblBoton22;
    private javax.swing.JLabel lblBoton23;
    private javax.swing.JLabel lblBoton24;
    private javax.swing.JLabel lblBoton3;
    private javax.swing.JLabel lblBoton4;
    private javax.swing.JLabel lblBoton5;
    private javax.swing.JLabel lblBoton6;
    private javax.swing.JLabel lblBoton7;
    private javax.swing.JLabel lblBoton8;
    private javax.swing.JLabel lblBoton9;
    private javax.swing.JLabel lblMaletin1;
    private javax.swing.JLabel lblMaletin10;
    private javax.swing.JLabel lblMaletin11;
    private javax.swing.JLabel lblMaletin12;
    private javax.swing.JLabel lblMaletin13;
    private javax.swing.JLabel lblMaletin14;
    private javax.swing.JLabel lblMaletin15;
    private javax.swing.JLabel lblMaletin16;
    private javax.swing.JLabel lblMaletin17;
    private javax.swing.JLabel lblMaletin18;
    private javax.swing.JLabel lblMaletin19;
    private javax.swing.JLabel lblMaletin2;
    private javax.swing.JLabel lblMaletin20;
    private javax.swing.JLabel lblMaletin21;
    private javax.swing.JLabel lblMaletin22;
    private javax.swing.JLabel lblMaletin23;
    private javax.swing.JLabel lblMaletin24;
    private javax.swing.JLabel lblMaletin3;
    private javax.swing.JLabel lblMaletin4;
    private javax.swing.JLabel lblMaletin5;
    private javax.swing.JLabel lblMaletin6;
    private javax.swing.JLabel lblMaletin7;
    private javax.swing.JLabel lblMaletin8;
    private javax.swing.JLabel lblMaletin9;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblValue1;
    private javax.swing.JLabel lblValue10;
    private javax.swing.JLabel lblValue11;
    private javax.swing.JLabel lblValue12;
    private javax.swing.JLabel lblValue13;
    private javax.swing.JLabel lblValue14;
    private javax.swing.JLabel lblValue15;
    private javax.swing.JLabel lblValue16;
    private javax.swing.JLabel lblValue17;
    private javax.swing.JLabel lblValue18;
    private javax.swing.JLabel lblValue19;
    private javax.swing.JLabel lblValue2;
    private javax.swing.JLabel lblValue20;
    private javax.swing.JLabel lblValue21;
    private javax.swing.JLabel lblValue22;
    private javax.swing.JLabel lblValue23;
    private javax.swing.JLabel lblValue24;
    private javax.swing.JLabel lblValue3;
    private javax.swing.JLabel lblValue4;
    private javax.swing.JLabel lblValue5;
    private javax.swing.JLabel lblValue6;
    private javax.swing.JLabel lblValue7;
    private javax.swing.JLabel lblValue8;
    private javax.swing.JLabel lblValue9;
    // End of variables declaration//GEN-END:variables
    
    private void desbloquear(int iterador){
        if(arrayLbl[iterador].getText().equals(NUM[iterador]) && (iterador != DearOrNoDealFrame.maletinGuadardo)){
            arrayLbl[iterador].setText("$" + LISTA.get(iterador));
            arrayLbl[iterador].setForeground(Color.WHITE);
            arrayMaletin[iterador].setIcon(new ImageIcon(getClass().getResource("/image/maletin.png")));
            arrayLbl[iterador].setFont(new Font("Arial", Font.PLAIN, 36));
            if(LISTA.get(iterador).equals("1000000")){
                arrayLbl[iterador].setFont(new Font("Arial", Font.PLAIN, 30));
            }
            contador++;
            if(contador == 1){
                rectanguloOro[iterador].setIcon(new ImageIcon(getClass().getResource("/image/rectangulo.png")));
                arrayMaletin[iterador].setIcon(new ImageIcon(getClass().getResource("/image/maleta.png")));
                arrayLbl[iterador].setText("");
                DearOrNoDealFrame.maletinGuadardo = iterador;
                JOptionPane.showMessageDialog(this, "Has elegido el maletin numero " + (iterador + 1) + " como tuyo\nque comienze el juego");
                
            }
            for(int i = 0; i < arrayValue.length; i++){
                if(arrayValue[i].getText().equals("$" + LISTA.get(iterador)) && !arrayValue[i].getText().equals("$" + LISTA.get(DearOrNoDealFrame.maletinGuadardo))){
                    rectanguloOro[i].setIcon(new ImageIcon(getClass().getResource("/image/rectangulo2.png")));
                    break;
                }
            }
            if(iterador != DearOrNoDealFrame.maletinGuadardo && contador.equals(rondaNum)){
                DearOrNoDealFrame.aux = 0;
                Integer auxCounter = 0;
                for(int i = 0; i < arrayLbl.length; i++){
                    if(arrayLbl[i].getText().equals(NUM[i]) && (i != DearOrNoDealFrame.maletinGuadardo)){
                        DearOrNoDealFrame.aux += Integer.valueOf(LISTA.get(i));
                        auxCounter++;
                    }
                }
                DearOrNoDealFrame.aux /= auxCounter;
                switch(rondaNum){
                    case 9:
                        rondaNum = 17; 
                        break;
                    case 17:
                        rondaNum = 20; 
                        break;
                    case 20:
                        rondaNum = 22; 
                        break;
                    case 22:
                        rondaNum = 23; 
                        break;
                    case 23:
                        DearOrNoDealFrame.aux = Integer.valueOf(LISTA.get(iterador));
                        DlogFinal dlogFinal = new DlogFinal(this, true);
                        dlogFinal.setVisible(true);
                        break;
                }
                DearOrNoDealFrame.ronda++;
                dlogRonda = new DlogRonda(this, true);
                dlogRonda.setVisible(true);
            }
        
        }
    }
    
    
    private void initArrays(){
        for(int i = 0; i < dinero.length; i++){
        LISTA.add(dinero[i]);
        }
        Collections.shuffle(LISTA);
        arrayMaletin = new JLabel[24];
        arrayMaletin[0] = lblBoton1;
        arrayMaletin[1] = lblBoton2;
        arrayMaletin[2] = lblBoton3;
        arrayMaletin[3] = lblBoton4;
        arrayMaletin[4] = lblBoton5;
        arrayMaletin[5] = lblBoton6;
        arrayMaletin[6] = lblBoton7;
        arrayMaletin[7] = lblBoton8;
        arrayMaletin[8] = lblBoton9;
        arrayMaletin[9] = lblBoton10;
        arrayMaletin[10] = lblBoton11;
        arrayMaletin[11] = lblBoton12;
        arrayMaletin[12] = lblBoton13;
        arrayMaletin[13] = lblBoton14;
        arrayMaletin[14] = lblBoton15;
        arrayMaletin[15] = lblBoton16;
        arrayMaletin[16] = lblBoton17;
        arrayMaletin[17] = lblBoton18;
        arrayMaletin[18] = lblBoton19;
        arrayMaletin[19] = lblBoton20;
        arrayMaletin[20] = lblBoton21;
        arrayMaletin[21] = lblBoton22;
        arrayMaletin[22] = lblBoton23;
        arrayMaletin[23] = lblBoton24;
        arrayValue = new JLabel[24];
        arrayValue[0] = lblValue1;
        arrayValue[1] = lblValue2;
        arrayValue[2] = lblValue3;
        arrayValue[3] = lblValue4;
        arrayValue[4] = lblValue5;
        arrayValue[5] = lblValue6;
        arrayValue[6] = lblValue7;
        arrayValue[7] = lblValue8;
        arrayValue[8] = lblValue9;
        arrayValue[9] = lblValue10;
        arrayValue[10] = lblValue11;
        arrayValue[11] = lblValue12;
        arrayValue[12] = lblValue13;
        arrayValue[13] = lblValue14;
        arrayValue[14] = lblValue15;
        arrayValue[15] = lblValue16;
        arrayValue[16] = lblValue17;
        arrayValue[17] = lblValue18;
        arrayValue[18] = lblValue19;
        arrayValue[19] = lblValue20;
        arrayValue[20] = lblValue21;
        arrayValue[21] = lblValue22;
        arrayValue[22] = lblValue23;
        arrayValue[23] = lblValue24;
        arrayLbl = new JLabel[24];
        arrayLbl[0] = lblMaletin1;
        arrayLbl[1] = lblMaletin2;
        arrayLbl[2] = lblMaletin3;
        arrayLbl[3] = lblMaletin4;
        arrayLbl[4] = lblMaletin5;
        arrayLbl[5] = lblMaletin6;
        arrayLbl[6] = lblMaletin7;
        arrayLbl[7] = lblMaletin8;
        arrayLbl[8] = lblMaletin9;
        arrayLbl[9] = lblMaletin10;
        arrayLbl[10] = lblMaletin11;
        arrayLbl[11] = lblMaletin12;
        arrayLbl[12] = lblMaletin13;
        arrayLbl[13] = lblMaletin14;
        arrayLbl[14] = lblMaletin15;
        arrayLbl[15] = lblMaletin16;
        arrayLbl[16] = lblMaletin17;
        arrayLbl[17] = lblMaletin18;
        arrayLbl[18] = lblMaletin19;
        arrayLbl[19] = lblMaletin20;
        arrayLbl[20] = lblMaletin21;
        arrayLbl[21] = lblMaletin22;
        arrayLbl[22] = lblMaletin23;
        arrayLbl[23] = lblMaletin24;
        for(int i = 0; i < arrayValue.length; i++){
            arrayValue[i].setText("$" + dinero[i]);
            arrayValue[i].setForeground(Color.BLACK);
        }
        rectanguloOro = new JLabel[24];
        rectanguloOro[0] = jLabel1;
        rectanguloOro[1] = jLabel2;
        rectanguloOro[2] = jLabel3;
        rectanguloOro[3] = jLabel4;
        rectanguloOro[4] = jLabel5;
        rectanguloOro[5] = jLabel6;
        rectanguloOro[6] = jLabel7;
        rectanguloOro[7] = jLabel8;
        rectanguloOro[8] = jLabel9;
        rectanguloOro[9] = jLabel10;
        rectanguloOro[10] = jLabel11;
        rectanguloOro[11] = jLabel12;
        rectanguloOro[12] = jLabel13;
        rectanguloOro[13] = jLabel14;
        rectanguloOro[14] = jLabel15;
        rectanguloOro[15] = jLabel16;
        rectanguloOro[16] = jLabel17;
        rectanguloOro[17] = jLabel18;
        rectanguloOro[18] = jLabel19;
        rectanguloOro[19] = jLabel20;
        rectanguloOro[20] = jLabel21;
        rectanguloOro[21] = jLabel22;
        rectanguloOro[22] = jLabel23;
        rectanguloOro[23] = jLabel24;
            
        
                
    }
}

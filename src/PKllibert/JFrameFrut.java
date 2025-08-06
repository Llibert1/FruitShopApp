/*
Autor: Llibert
Escuela Monlau
2020-2021
 */
package PKllibert;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFrameFrut extends javax.swing.JFrame implements Runnable {

    String hour, minutes, seconds;
    Thread thread;

    float totalPrice = 0;
    float totalPriceNoVAT = 0;

    String product, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12;
    float quantity, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7, quantity8, quantity9, quantity10, quantity11, quantity12, price, price2, price3, price4,
            price5, price6, price7, price8, price9, price10, price11, price12;

    String[] products = {
        product, product2, product3, product4, product5, product6,
        product7, product8, product9, product10, product11, product12
    };
    double[] quantities = {
        quantity, quantity2, quantity3, quantity4, quantity5, quantity6,
        quantity7, quantity8, quantity9, quantity10, quantity11, quantity12
    };
    double[] prices = {
        price, price2, price3, price4, price5, price6,
        price7, price8, price9, price10, price11, price12
    };

    String[] validProducts = {
        "Pear", "Apple", "Banana", "Grape", "Orange", "Peach",
        "Lemon", "Pineapple", "Strawberry", "Avocado", "Cherry", "Watermelon"
    };

    float moneyReturned;
    float moneyDelivered;

    DecimalFormat df = new DecimalFormat(" 0.00");

    //CONSTRUCTOR
    public JFrameFrut() {
        initComponents();
        initConfig();
        lbdate.setText(date());
        thread = new Thread(this);
        thread.start();
        setVisible(true);
    }

    private void initConfig() {
        getContentPane().setBackground(new Color(0, 100, 0));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonPear = new javax.swing.JButton();
        jLabelPear = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jButtonApple = new javax.swing.JButton();
        jLabelApple = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButtonBanana = new javax.swing.JButton();
        jLabelBanana = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jButtonGrape = new javax.swing.JButton();
        jLabelGrape = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jButtonOrange = new javax.swing.JButton();
        jLabelOrange = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jButtonPeach = new javax.swing.JButton();
        jLabelPeach = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jButtonLemon = new javax.swing.JButton();
        jButtonPineapple = new javax.swing.JButton();
        jLabelLemon = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabelPineapple = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jButtonStrawberry = new javax.swing.JButton();
        jButtonAvocado = new javax.swing.JButton();
        jLabelStrawberry = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabelAvocado = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jButtonCherry = new javax.swing.JButton();
        jLabelCherry = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jButtonWatermelon = new javax.swing.JButton();
        jLabelWatermelon = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jTextFieldKg = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jButtonCharge = new javax.swing.JButton();
        jTextFieldUnitPrice = new javax.swing.JTextField();
        jTextFieldTotalPriceNoIva = new javax.swing.JTextField();
        jTextFieldMoneyDelivered = new javax.swing.JTextField();
        jTextFieldMoneyReturned = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButtonCalculatePrice = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jTextFieldTotalPrice = new javax.swing.JTextField();
        jComboBoxIVA = new javax.swing.JComboBox<>();
        jTextFieldActualPrice = new javax.swing.JTextField();
        jButtonReset = new javax.swing.JButton();
        lbdate = new javax.swing.JLabel();
        lbhour = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaList = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabelBackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButtonPear.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/pera.png"))); // NOI18N
        jButtonPear.setText("Pear");
        jButtonPear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPearActionPerformed(evt);
            }
        });

        jLabelPear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPear.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPear.setText("0.4");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText(" €/Kg");

        jButtonApple.setBackground(new java.awt.Color(255, 255, 255));
        jButtonApple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/manzana.png"))); // NOI18N
        jButtonApple.setText("Apple");
        jButtonApple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppleActionPerformed(evt);
            }
        });

        jLabelApple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelApple.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApple.setText("0.7");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText(" €/Kg");

        jButtonBanana.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBanana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/platanoo.png"))); // NOI18N
        jButtonBanana.setText("Banana");
        jButtonBanana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBananaActionPerformed(evt);
            }
        });

        jLabelBanana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBanana.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBanana.setText("0.9");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText(" €/Kg");

        jButtonGrape.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGrape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGrape.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/uva.png"))); // NOI18N
        jButtonGrape.setText("Grape");
        jButtonGrape.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGrape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGrapeActionPerformed(evt);
            }
        });

        jLabelGrape.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelGrape.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGrape.setText("0.8");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText(" €/Kg");

        jButtonOrange.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOrange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/naran.png"))); // NOI18N
        jButtonOrange.setText("Orange");
        jButtonOrange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrangeActionPerformed(evt);
            }
        });

        jLabelOrange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOrange.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOrange.setText("1.2");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText(" €/Kg");

        jButtonPeach.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPeach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPeach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/meloco.png"))); // NOI18N
        jButtonPeach.setText("Peach");
        jButtonPeach.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPeachActionPerformed(evt);
            }
        });

        jLabelPeach.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPeach.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPeach.setText("0.7");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText(" €/Kg");

        jButtonLemon.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLemon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLemon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/lim.png"))); // NOI18N
        jButtonLemon.setText("Lemon");
        jButtonLemon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonLemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLemonActionPerformed(evt);
            }
        });

        jButtonPineapple.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPineapple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPineapple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/a.png"))); // NOI18N
        jButtonPineapple.setText("Pineapple");
        jButtonPineapple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPineappleActionPerformed(evt);
            }
        });

        jLabelLemon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLemon.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLemon.setText("0.5");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText(" €/Kg");

        jLabelPineapple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPineapple.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPineapple.setText("0.8");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText(" €/Kg");

        jButtonStrawberry.setBackground(new java.awt.Color(255, 255, 255));
        jButtonStrawberry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonStrawberry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/aggg.png"))); // NOI18N
        jButtonStrawberry.setText("Strawberry");
        jButtonStrawberry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonStrawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStrawberryActionPerformed(evt);
            }
        });

        jButtonAvocado.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAvocado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAvocado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/agg.png"))); // NOI18N
        jButtonAvocado.setText("Avocado");
        jButtonAvocado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAvocado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvocadoActionPerformed(evt);
            }
        });

        jLabelStrawberry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelStrawberry.setForeground(new java.awt.Color(255, 255, 255));
        jLabelStrawberry.setText("0.5");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText(" €/Kg");

        jLabelAvocado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAvocado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvocado.setText("1.0");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText(" €/Kg");

        jButtonCherry.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCherry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCherry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/cere.png"))); // NOI18N
        jButtonCherry.setText("Cherry");
        jButtonCherry.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCherry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCherryActionPerformed(evt);
            }
        });

        jLabelCherry.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCherry.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCherry.setText("1.1");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText(" €/Kg");

        jButtonWatermelon.setBackground(new java.awt.Color(255, 255, 255));
        jButtonWatermelon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonWatermelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKllibert/IMAGES/aa.png"))); // NOI18N
        jButtonWatermelon.setText("Watermelon");
        jButtonWatermelon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonWatermelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWatermelonActionPerformed(evt);
            }
        });

        jLabelWatermelon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelWatermelon.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWatermelon.setText("2.0");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText(" €/Kg");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Kg");

        jTextFieldKg.setBackground(new java.awt.Color(0, 255, 51));
        jTextFieldKg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldKg.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58))
                    .addComponent(jButtonApple, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelApple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel61))
                    .addComponent(jButtonBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelBanana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64))
                    .addComponent(jButtonGrape, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelGrape)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67))
                    .addComponent(jButtonOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelOrange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70))
                    .addComponent(jButtonPeach, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPeach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)))
                .addGap(109, 109, 109)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelPineapple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel79))
                    .addComponent(jButtonAvocado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelAvocado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85))
                    .addComponent(jButtonWatermelon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelWatermelon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91))
                    .addComponent(jButtonLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelLemon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77))
                    .addComponent(jButtonStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelStrawberry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83))
                    .addComponent(jButtonCherry, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCherry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldKg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86)
                .addGap(206, 206, 206))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPineapple)
                            .addComponent(jLabel79))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAvocado)
                            .addComponent(jLabel85))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonAvocado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelWatermelon)
                            .addComponent(jLabel91))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonWatermelon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLemon)
                            .addComponent(jLabel77))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonLemon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelStrawberry)
                            .addComponent(jLabel83))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonStrawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCherry)
                            .addComponent(jLabel88))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonCherry, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPear)
                            .addComponent(jLabel58))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonPear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApple)
                            .addComponent(jLabel61))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonApple, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBanana)
                            .addComponent(jLabel64))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGrape)
                            .addComponent(jLabel67))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonGrape, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelOrange)
                            .addComponent(jLabel70))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPeach)
                            .addComponent(jLabel73))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonPeach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextFieldKg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(290, 230, 520, 520);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Unit price");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Actual price");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("VAT%");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Money delivered");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("RRP (excl. VAT)");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Return");

        jButtonCharge.setBackground(new java.awt.Color(255, 153, 0));
        jButtonCharge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCharge.setText("Charge");
        jButtonCharge.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButtonCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChargeActionPerformed(evt);
            }
        });

        jTextFieldUnitPrice.setEditable(false);
        jTextFieldUnitPrice.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldUnitPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldUnitPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldUnitPrice.setText("0");

        jTextFieldTotalPriceNoIva.setEditable(false);
        jTextFieldTotalPriceNoIva.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldTotalPriceNoIva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldTotalPriceNoIva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotalPriceNoIva.setText("0");
        jTextFieldTotalPriceNoIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalPriceNoIvaActionPerformed(evt);
            }
        });

        jTextFieldMoneyDelivered.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMoneyDelivered.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMoneyDelivered.setText("0");
        jTextFieldMoneyDelivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoneyDeliveredActionPerformed(evt);
            }
        });

        jTextFieldMoneyReturned.setEditable(false);
        jTextFieldMoneyReturned.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMoneyReturned.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMoneyReturned.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMoneyReturned.setText("0");
        jTextFieldMoneyReturned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMoneyReturnedActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonCalculatePrice.setBackground(new java.awt.Color(255, 153, 0));
        jButtonCalculatePrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCalculatePrice.setText("Calculate price");
        jButtonCalculatePrice.setBorder(new javax.swing.border.MatteBorder(null));
        jButtonCalculatePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalculatePriceActionPerformed(evt);
            }
        });

        jButtonReturn.setBackground(new java.awt.Color(255, 153, 0));
        jButtonReturn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonReturn.setText("Calculate return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Total price");

        jTextFieldTotalPrice.setEditable(false);
        jTextFieldTotalPrice.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldTotalPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotalPrice.setText("0");
        jTextFieldTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalPriceActionPerformed(evt);
            }
        });

        jComboBoxIVA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "4", "10", "21" }));
        jComboBoxIVA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIVAActionPerformed(evt);
            }
        });

        jTextFieldActualPrice.setEditable(false);
        jTextFieldActualPrice.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldActualPrice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldActualPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldActualPrice.setText("0");

        jButtonReset.setBackground(new java.awt.Color(255, 0, 0));
        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        lbdate.setBackground(new java.awt.Color(0, 0, 0));
        lbdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbdate.setForeground(new java.awt.Color(255, 255, 255));
        lbdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbdate.setText("DD/MM/YYYY");

        lbhour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbhour.setForeground(new java.awt.Color(255, 255, 255));
        lbhour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbhour.setText("00:00:00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonCalculatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldMoneyReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel41)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldTotalPriceNoIva, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbhour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel55)
                                    .addGap(191, 191, 191)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel52)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldMoneyDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbhour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jButtonCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextFieldUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jComboBoxIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextFieldActualPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonCalculatePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTotalPriceNoIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextFieldMoneyDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextFieldMoneyReturned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(830, 230, 430, 520);

        jTextAreaList.setEditable(false);
        jTextAreaList.setColumns(20);
        jTextAreaList.setRows(5);
        jTextAreaList.setText("\nClick \"charge\" after choosing the fruits:\n");
        jScrollPane1.setViewportView(jTextAreaList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1280, 230, 340, 520);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("List:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(1400, 200, 120, 30);

        jLabelBackgroundImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelBackgroundImage);
        jLabelBackgroundImage.setBounds(-10, 140, 1930, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChargeActionPerformed

        StringBuilder txt = new StringBuilder();

        for (int i = 0; i < products.length; i++) {
            System.out.println(validProducts[i]);
            System.out.println(products[i]);
            if (validProducts[i].equals(products[i])) {
                txt.append(String.format(
                        "\n Product: %-12s Quantity: %s   Price: %s\n",
                        products[i],
                        df.format(quantities[i]),
                        df.format(prices[i])
                ));
            }
        }

        txt.append("\n ------------------------------------------------------------ \n\n");
        txt.append(" Total price (excl. VAT):     ").append(df.format(totalPriceNoVAT)).append("\n");
        txt.append(" VAT applied:                 ").append(jComboBoxIVA.getSelectedItem().toString()).append("%\n");
        txt.append(" Total price (incl. VAT):     ").append(df.format(totalPrice)).append("\n");
        txt.append(" Amount paid:                 ").append(df.format(moneyDelivered)).append("\n");
        txt.append(" Change returned:             ").append(df.format(moneyReturned)).append("\n");

        txt.append("\n         ,;;;, ,;;;,\n")
                .append("        ;;;' ';' ';;; \n")
                .append("        ;;;       ;;; \n")
                .append("         ';;,   ,;;' \n")
                .append("           ';;,;;' \n")
                .append("             ';'\n");

        txt.append("\n Thank you for shopping at GoodFruit! :D\n");
        txt.append(" Date: ").append(date()).append("\n");
        txt.append(" Time: ").append(hour).append(":").append(minutes).append(":").append(seconds);

        jTextAreaList.setText(txt.toString());

    }//GEN-LAST:event_jButtonChargeActionPerformed

    private void jTextFieldTotalPriceNoIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalPriceNoIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalPriceNoIvaActionPerformed

    private void jTextFieldMoneyDeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoneyDeliveredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoneyDeliveredActionPerformed

    private void jTextFieldMoneyReturnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMoneyReturnedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMoneyReturnedActionPerformed

    private void addProductToCart(String productName, int index, JLabel priceLabel) {
        try {
            float kg = Float.parseFloat(jTextFieldKg.getText());
            float priceKg = Float.parseFloat(priceLabel.getText());
            float actualPrice = priceKg * kg;

            products[index] = productName;
            quantities[index] += kg;
            prices[index] += actualPrice;

            jTextFieldUnitPrice.setText(String.valueOf(priceKg));
            jTextFieldActualPrice.setText(String.valueOf(actualPrice));

            totalPrice += actualPrice;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for kilograms.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButtonPearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPearActionPerformed
        addProductToCart("Pear", 0, jLabelPear);
    }//GEN-LAST:event_jButtonPearActionPerformed


    private void jButtonAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppleActionPerformed
        addProductToCart("Apple", 1, jLabelApple);
    }//GEN-LAST:event_jButtonAppleActionPerformed

    private void jButtonBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBananaActionPerformed
        addProductToCart("Banana", 2, jLabelBanana);
    }//GEN-LAST:event_jButtonBananaActionPerformed

    private void jButtonGrapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrapeActionPerformed
        addProductToCart("Grape", 3, jLabelGrape);
    }//GEN-LAST:event_jButtonGrapeActionPerformed

    private void jButtonOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrangeActionPerformed
        addProductToCart("Orange", 4, jLabelOrange);
    }//GEN-LAST:event_jButtonOrangeActionPerformed

    private void jButtonPeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPeachActionPerformed
        addProductToCart("Peach", 5, jLabelPeach);
    }//GEN-LAST:event_jButtonPeachActionPerformed

    private void jButtonLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLemonActionPerformed
        addProductToCart("Lemon", 6, jLabelLemon);
    }//GEN-LAST:event_jButtonLemonActionPerformed

    private void jButtonPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPineappleActionPerformed
        addProductToCart("Pineapple", 7, jLabelPineapple);
    }//GEN-LAST:event_jButtonPineappleActionPerformed

    private void jButtonStrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStrawberryActionPerformed
        addProductToCart("Strawberry", 8, jLabelStrawberry);
    }//GEN-LAST:event_jButtonStrawberryActionPerformed

    private void jButtonAvocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvocadoActionPerformed
        addProductToCart("Avocado", 9, jLabelAvocado);
    }//GEN-LAST:event_jButtonAvocadoActionPerformed

    private void jButtonCherryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCherryActionPerformed
        addProductToCart("Cherry", 10, jLabelCherry);
    }//GEN-LAST:event_jButtonCherryActionPerformed

    private void jButtonWatermelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWatermelonActionPerformed
        addProductToCart("Watermelon", 11, jLabelWatermelon);
    }//GEN-LAST:event_jButtonWatermelonActionPerformed

    private void jButtonCalculatePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculatePriceActionPerformed
        float VAT = Float.parseFloat(jComboBoxIVA.getSelectedItem().toString());
        totalPriceNoVAT = totalPrice / (1 + VAT / 100);
        jTextFieldTotalPrice.setText(String.valueOf(df.format(totalPrice)));
        jTextFieldTotalPriceNoIva.setText(String.valueOf(df.format(totalPriceNoVAT)));
    }//GEN-LAST:event_jButtonCalculatePriceActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            moneyDelivered = Float.parseFloat(jTextFieldMoneyDelivered.getText());
            moneyReturned = moneyDelivered - totalPrice;

            if (moneyReturned < 0) {
                jTextFieldMoneyReturned.setText("Not enough money");
            } else {
                jTextFieldMoneyReturned.setText(df.format(moneyReturned));
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for money delivered.", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldMoneyReturned.setText("");
        }

    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jComboBoxIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIVAActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextFieldTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalPriceActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed

        // Reset text fields
        jTextFieldTotalPrice.setText("0");
        jTextFieldTotalPriceNoIva.setText("0");
        jTextFieldActualPrice.setText("0");
        jTextFieldKg.setText("0");
        jTextFieldMoneyDelivered.setText("0");
        jTextFieldMoneyReturned.setText("0");
        jTextFieldUnitPrice.setText("0");

        // Reset text area
        jTextAreaList.setText("Click \"Charge\" after choosing the fruits:");

        // Reset prices
        totalPrice = 0;
        totalPriceNoVAT = 0;

        // Reset arrays
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
            quantities[i] = 0;
            prices[i] = 0;
        }
    }//GEN-LAST:event_jButtonResetActionPerformed

    /**
     * @param args the command line arguments
     * @return
     */
    public static String date() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        return dateFormat.format(date);
    }

    public void hour() {
        Calendar calendar = new GregorianCalendar();
        Date actualHour = new Date();
        calendar.setTime(actualHour);
        hour = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" + calendar.get(Calendar.HOUR_OF_DAY);
        minutes = calendar.get(Calendar.MINUTE) > 9 ? "" + calendar.get(Calendar.MINUTE) : "0" + calendar.get(Calendar.MINUTE);
        seconds = calendar.get(Calendar.SECOND) > 9 ? "" + calendar.get(Calendar.SECOND) : "0" + calendar.get(Calendar.SECOND);
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (current == thread) {
            hour();
            lbhour.setText(hour + ":" + minutes + ":" + seconds);
        }
    }

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(JFrameFrut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFrut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFrut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFrut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameFrut().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApple;
    private javax.swing.JButton jButtonAvocado;
    private javax.swing.JButton jButtonBanana;
    private javax.swing.JButton jButtonCalculatePrice;
    private javax.swing.JButton jButtonCharge;
    private javax.swing.JButton jButtonCherry;
    private javax.swing.JButton jButtonGrape;
    private javax.swing.JButton jButtonLemon;
    private javax.swing.JButton jButtonOrange;
    private javax.swing.JButton jButtonPeach;
    private javax.swing.JButton jButtonPear;
    private javax.swing.JButton jButtonPineapple;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JButton jButtonStrawberry;
    private javax.swing.JButton jButtonWatermelon;
    private javax.swing.JComboBox<String> jComboBoxIVA;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabelApple;
    private javax.swing.JLabel jLabelAvocado;
    private javax.swing.JLabel jLabelBackgroundImage;
    private javax.swing.JLabel jLabelBanana;
    private javax.swing.JLabel jLabelCherry;
    private javax.swing.JLabel jLabelGrape;
    private javax.swing.JLabel jLabelLemon;
    private javax.swing.JLabel jLabelOrange;
    private javax.swing.JLabel jLabelPeach;
    private javax.swing.JLabel jLabelPear;
    private javax.swing.JLabel jLabelPineapple;
    private javax.swing.JLabel jLabelStrawberry;
    private javax.swing.JLabel jLabelWatermelon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaList;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldActualPrice;
    private javax.swing.JTextField jTextFieldKg;
    private javax.swing.JTextField jTextFieldMoneyDelivered;
    private javax.swing.JTextField jTextFieldMoneyReturned;
    private javax.swing.JTextField jTextFieldTotalPrice;
    private javax.swing.JTextField jTextFieldTotalPriceNoIva;
    private javax.swing.JTextField jTextFieldUnitPrice;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbhour;
    // End of variables declaration//GEN-END:variables
}

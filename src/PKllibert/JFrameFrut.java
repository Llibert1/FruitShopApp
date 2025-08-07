/*
Author: Llibert Matarredona
Project developed during the Higher National Diploma in Multiplatform Application Development
 */
package PKllibert;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class JFrameFrut extends javax.swing.JFrame {

    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    private Timer clockTimer;
    private String currentDate = "";

    private List<CartItem> cart = new ArrayList<>();

    private float totalPrice = 0;
    private float netPrice = 0;
    private float vatAmount = 0;

    private float moneyReturned;
    private float moneyDelivered;

    private DecimalFormat df = new DecimalFormat(" 0.00");

    private CartManager cartManager = new CartManager(cart);

    //CONSTRUCTOR
    public JFrameFrut() {
        initComponents();
        initConfig();
        startClockThread();
        initDate();
        startDateWatcher();
        setVisible(true);
    }

    private void initConfig() {
        getContentPane().setBackground(new Color(0, 100, 0));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        jTextAreaList.setText("Select a product to see details.");
    }

    private void startClockThread() {
        clockTimer = new Timer(1000, e -> {
            lbhour.setText(LocalDateTime.now().format(timeFormatter));
        });

        clockTimer.setInitialDelay(0);
        clockTimer.start();
    }

    public void initDate() {
        currentDate = LocalDate.now().format(dateFormatter);
        lbdate.setText(currentDate);
    }

    public void startDateWatcher() {
        Timer dateTimer = new Timer(60_000, e -> {
            String today = LocalDate.now().format(dateFormatter);
            if (!today.equals(currentDate)) {
                currentDate = today;
                initDate();
            }
        });
        currentDate = LocalDate.now().format(dateFormatter);
        dateTimer.setInitialDelay(0);
        dateTimer.start();
    }

    private void processProductSelection(String productName, JLabel priceLabel) {
        try {
            float kg = getKilogramsInput();
            float pricePerKg = getPriceFromLabel(priceLabel);
            float VAT = getSelectedVAT();

            updatePrices(kg, pricePerKg, VAT);
            cartManager.addOrUpdateItem(productName, kg, pricePerKg);

            showList();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for kilograms.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private float getKilogramsInput() {
        return Float.parseFloat(jTextFieldKg.getText());
    }

    private float getPriceFromLabel(JLabel priceLabel) {
        return Float.parseFloat(priceLabel.getText());
    }

    private float getSelectedVAT() {
        return Float.parseFloat(jComboBoxVAT.getSelectedItem().toString());
    }

    private void updatePrices(float kg, float pricePerKg, float VAT) {
        totalPrice += kg * pricePerKg;
        netPrice = totalPrice / (1 + VAT / 100);
        vatAmount = totalPrice - netPrice;
    }

    private void showList() {
        ReceiptBuilder builder = new ReceiptBuilder(
                cart,
                netPrice,
                vatAmount,
                totalPrice,
                moneyDelivered,
                moneyReturned,
                jComboBoxVAT.getSelectedItem().toString(),
                dateFormatter,
                timeFormatter
        );

        jTextAreaList.setText(builder.build());
    }

    private void processPayment() throws NumberFormatException {
        moneyDelivered = parseMoneyDelivered();
        moneyReturned = calculateChange();

        if (moneyReturned < 0) {
            jTextFieldMoneyReturned.setText("Not enough money");
        } else {
            jTextFieldMoneyReturned.setText(df.format(moneyReturned));
        }
    }

    private float parseMoneyDelivered() throws NumberFormatException {
        return Float.parseFloat(jTextFieldMoneyDelivered.getText());
    }

    private float calculateChange() {
        return moneyDelivered - totalPrice;
    }

    private void resetPrices() {
        totalPrice = 0;
        netPrice = 0;
        vatAmount = 0;
        moneyDelivered = 0;
        moneyReturned = 0;
    }

    private void resetTextFields() {
        jTextFieldKg.setText("0");
        jTextFieldMoneyDelivered.setText("0");
        jTextFieldMoneyReturned.setText("0");
        jTextAreaList.setText("Select a product to see details.");
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
        jLabel41 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextFieldMoneyDelivered = new javax.swing.JTextField();
        jTextFieldMoneyReturned = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();
        jComboBoxVAT = new javax.swing.JComboBox<>();
        jButtonReset = new javax.swing.JButton();
        lbdate = new javax.swing.JLabel();
        lbhour = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaList = new javax.swing.JTextArea();

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldKg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel86))
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                                .addComponent(jLabel64)))
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
                                .addComponent(jLabel91)))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jLabel88)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addComponent(jButtonBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                        .addComponent(jButtonPeach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jButtonWatermelon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jTextFieldKg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 70, 1000, 290);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("VAT%");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Money delivered");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Return");

        jTextFieldMoneyDelivered.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMoneyDelivered.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMoneyDelivered.setText("0");

        jTextFieldMoneyReturned.setEditable(false);
        jTextFieldMoneyReturned.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldMoneyReturned.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldMoneyReturned.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMoneyReturned.setText("0");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonReturn.setBackground(new java.awt.Color(255, 153, 0));
        jButtonReturn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonReturn.setText("Calculate return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        jComboBoxVAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "4", "10", "21" }));
        jComboBoxVAT.setSelectedIndex(3);
        jComboBoxVAT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbhour, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel52)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldMoneyDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxVAT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(37, 37, 37)
                                        .addComponent(jButtonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldMoneyReturned, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(567, 567, 567))
                            .addComponent(lbdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jComboBoxVAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbhour, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextFieldMoneyDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextFieldMoneyReturned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 440, 1000, 520);

        jTextAreaList.setEditable(false);
        jTextAreaList.setColumns(20);
        jTextAreaList.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextAreaList.setRows(5);
        jScrollPane1.setViewportView(jTextAreaList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1240, 70, 490, 890);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPearActionPerformed
        processProductSelection("Pear", jLabelPear);
    }//GEN-LAST:event_jButtonPearActionPerformed


    private void jButtonAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppleActionPerformed
        processProductSelection("Apple", jLabelApple);
    }//GEN-LAST:event_jButtonAppleActionPerformed

    private void jButtonBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBananaActionPerformed
        processProductSelection("Banana", jLabelBanana);
    }//GEN-LAST:event_jButtonBananaActionPerformed

    private void jButtonGrapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGrapeActionPerformed
        processProductSelection("Grape", jLabelGrape);
    }//GEN-LAST:event_jButtonGrapeActionPerformed

    private void jButtonOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrangeActionPerformed
        processProductSelection("Orange", jLabelOrange);
    }//GEN-LAST:event_jButtonOrangeActionPerformed

    private void jButtonPeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPeachActionPerformed
        processProductSelection("Peach", jLabelPeach);
    }//GEN-LAST:event_jButtonPeachActionPerformed

    private void jButtonLemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLemonActionPerformed
        processProductSelection("Lemon", jLabelLemon);
    }//GEN-LAST:event_jButtonLemonActionPerformed

    private void jButtonPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPineappleActionPerformed
        processProductSelection("Pineapple", jLabelPineapple);
    }//GEN-LAST:event_jButtonPineappleActionPerformed

    private void jButtonStrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStrawberryActionPerformed
        processProductSelection("Strawberry", jLabelStrawberry);
    }//GEN-LAST:event_jButtonStrawberryActionPerformed

    private void jButtonAvocadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvocadoActionPerformed
        processProductSelection("Avocado", jLabelAvocado);
    }//GEN-LAST:event_jButtonAvocadoActionPerformed

    private void jButtonCherryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCherryActionPerformed
        processProductSelection("Cherry", jLabelCherry);
    }//GEN-LAST:event_jButtonCherryActionPerformed

    private void jButtonWatermelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWatermelonActionPerformed
        processProductSelection("Watermelon", jLabelWatermelon);
    }//GEN-LAST:event_jButtonWatermelonActionPerformed

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        try {
            processPayment();
            showList();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for money delivered.", "Input Error", JOptionPane.ERROR_MESSAGE);
            jTextFieldMoneyReturned.setText("");
        }
    }//GEN-LAST:event_jButtonReturnActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        cartManager.resetCart();
        resetPrices();
        resetTextFields();
    }//GEN-LAST:event_jButtonResetActionPerformed

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
    private javax.swing.JComboBox<String> jComboBoxVAT;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JTextField jTextFieldKg;
    private javax.swing.JTextField jTextFieldMoneyDelivered;
    private javax.swing.JTextField jTextFieldMoneyReturned;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbhour;
    // End of variables declaration//GEN-END:variables
}

package frames;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lombok.Getter;

public class Main_Frame extends javax.swing.JFrame {

    public Main_Frame() {
        initComponents();

        this.setTitle("SCalculator");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.DARK_GRAY);

        this.char_list = new ArrayList<>();
    }

    @Getter
    private List<Character> char_list;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultField = new javax.swing.JTextField();
        zeroButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        clearButton = new javax.swing.JButton();
        equalsButton = new javax.swing.JButton();
        additionOPButton1 = new javax.swing.JButton();
        goBackOneButton = new javax.swing.JButton();
        subtractionOPButton = new javax.swing.JButton();
        absButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        dotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setFocusable(false);

        resultField.setEditable(false);
        resultField.setBackground(new java.awt.Color(102, 102, 102));
        resultField.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        resultField.setForeground(new java.awt.Color(255, 255, 255));
        resultField.setText("0");
        resultField.setBorder(new javax.swing.border.MatteBorder(null));

        zeroButton.setBackground(new java.awt.Color(153, 153, 153));
        zeroButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        zeroButton.setText("0");
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });

        oneButton.setBackground(new java.awt.Color(153, 153, 153));
        oneButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });

        twoButton.setBackground(new java.awt.Color(153, 153, 153));
        twoButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });

        threeButton.setBackground(new java.awt.Color(153, 153, 153));
        threeButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });

        fourButton.setBackground(new java.awt.Color(153, 153, 153));
        fourButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });

        fiveButton.setBackground(new java.awt.Color(153, 153, 153));
        fiveButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });

        sixButton.setBackground(new java.awt.Color(153, 153, 153));
        sixButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });

        sevenButton.setBackground(new java.awt.Color(153, 153, 153));
        sevenButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(153, 153, 153));
        eightButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });

        nineButton.setBackground(new java.awt.Color(153, 153, 153));
        nineButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setFocusTraversalPolicyProvider(true);

        clearButton.setBackground(new java.awt.Color(153, 153, 153));
        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        equalsButton.setBackground(new java.awt.Color(153, 153, 153));
        equalsButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        equalsButton.setText("=");
        equalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsButtonActionPerformed(evt);
            }
        });

        additionOPButton1.setBackground(new java.awt.Color(153, 153, 153));
        additionOPButton1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        additionOPButton1.setText("+");
        additionOPButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionOPButton1ActionPerformed(evt);
            }
        });

        goBackOneButton.setBackground(new java.awt.Color(153, 153, 153));
        goBackOneButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        goBackOneButton.setText("<-");
        goBackOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackOneButtonActionPerformed(evt);
            }
        });

        subtractionOPButton.setBackground(new java.awt.Color(153, 153, 153));
        subtractionOPButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        subtractionOPButton.setText("-");
        subtractionOPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionOPButtonActionPerformed(evt);
            }
        });

        absButton.setBackground(new java.awt.Color(153, 153, 153));
        absButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        absButton.setText("abs");
        absButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absButtonActionPerformed(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(153, 153, 153));
        multiplyButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(153, 153, 153));
        divideButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        dotButton.setBackground(new java.awt.Color(153, 153, 153));
        dotButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        dotButton.setText(".");
        dotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(equalsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(goBackOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(additionOPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtractionOPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackOneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(absButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additionOPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractionOPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(equalsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(threeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        this.getChar_list().add('0');
        String previous_text = this.resultField.getText();
        this.resultField.setText(previous_text + '0');
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        this.getChar_list().add('1');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('1'));
        } else {
            this.resultField.setText(previous_text + '1');
        }
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        this.getChar_list().add('2');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('2'));
        } else {
            this.resultField.setText(previous_text + '2');
        }
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        this.getChar_list().add('3');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('3'));
        } else {
            this.resultField.setText(previous_text + '3');
        }
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        this.getChar_list().add('4');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('4'));
        } else {
            this.resultField.setText(previous_text + '4');
        }
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        this.getChar_list().add('5');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('5'));
        } else {
            this.resultField.setText(previous_text + '5');
        }
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        this.getChar_list().add('6');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('6'));
        } else {
            this.resultField.setText(previous_text + '6');
        }
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        this.getChar_list().add('7');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('7'));
        } else {
            this.resultField.setText(previous_text + '7');
        }
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        this.getChar_list().add('8');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('8'));
        } else {
            this.resultField.setText(previous_text + '8');
        }
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        this.getChar_list().add('9');
        String previous_text = this.resultField.getText();

        if (previous_text.equals("0")) {
            this.resultField.setText(String.valueOf('9'));
        } else {
            this.resultField.setText(previous_text + '9');
        }
    }//GEN-LAST:event_nineButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        this.resultField.setText("0");
        this.getChar_list().clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void equalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsButtonActionPerformed
        String previous_text = this.resultField.getText();
        double result = 0.0;

        if (previous_text.contains("+")) {
            String[] split = previous_text.split("\\+");
            List<Double> nums = new ArrayList<>();

            for (String num : split) {
                if (!num.equals("")) {
                    Pattern pt = Pattern.compile("([0-9])");
                    Matcher mt = pt.matcher(num);
                    if (mt.find()) {
                        nums.add(Math.abs(Double.parseDouble(num)));
                    }
                }
            }

            for (int i = 0; i < nums.size(); i++) {
                result += nums.get(i);
            }
        }
        if (previous_text.contains("-")) {
            String[] split = previous_text.split("\\-");
            List<Double> nums = new ArrayList<>();

            for (String num : split) {
                if (!num.equals("")) {
                    Pattern pt = Pattern.compile("([0-9])");
                    Matcher mt = pt.matcher(num);
                    if (mt.find()) {
                        nums.add(Math.abs(Double.parseDouble(num)));
                    }
                }
            }

            result = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                result -= nums.get(i);
            }
        }
        if (previous_text.contains("x")) {
            String[] split = previous_text.split("x");
            List<Double> nums = new ArrayList<>();

            for (String num : split) {
                if (!num.equals("")) {
                    Pattern pt = Pattern.compile("([0-9])");
                    Matcher mt = pt.matcher(num);
                    if (mt.find()) {
                        nums.add(Math.abs(Double.parseDouble(num)));
                    }
                }
            }

            result = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                result *= nums.get(i);
            }
        }
        if (previous_text.contains("/")) {
            String[] split = previous_text.split("\\/");
            List<Double> nums = new ArrayList<>();

            for (String num : split) {
                if (!num.equals("")) {
                    Pattern pt = Pattern.compile("([0-9])");
                    Matcher mt = pt.matcher(num);
                    if (mt.find()) {
                        nums.add(Math.abs(Double.parseDouble(num)));
                    }
                }
            }

            result = nums.get(0);
            if (result != 0.0) {
                for (int i = 1; i < nums.size(); i++) {
                    if (nums.get(i) != 0.0) {
                        result /= nums.get(i);
                    } else {
                        JOptionPane.showMessageDialog(null, "Can't divide by 0!", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }
            }
        }

        String s_result = String.valueOf(result);
        String[] split_result = s_result.split("\\.");

        if (split_result[1].length() > 1) {
            this.resultField.setText(String.valueOf(Math.abs(result)));
        } else {
            int newResult = (int) result;
            this.resultField.setText(String.valueOf(Math.abs(newResult)));
        }
        this.char_list.clear();

        String toParse = String.valueOf(result);
        char[] array = toParse.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            this.getChar_list().add(c);
        }
    }//GEN-LAST:event_equalsButtonActionPerformed

    private void additionOPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionOPButton1ActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        double result = 0.0;
        if (m.find()) {
            if (!previous_text.equals("0")) {
                char previous_op = 'n';
                if (previous_text.contains("-")) {
                    previous_op = '-';
                }
                if (previous_text.contains("x")) {
                    previous_op = 'x';
                }
                if (previous_text.contains("/")) {
                    previous_op = '/';
                }

                switch (previous_op) {
                    case '-': {
                        String[] split = previous_text.split("\\-");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result -= nums.get(i);
                        }
                        break;
                    }
                    case 'x': {
                        String[] split = previous_text.split("x");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result *= nums.get(i);
                        }
                        break;
                    }
                    case '/': {
                        String[] split = previous_text.split("\\/");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        if (result != 0.0) {
                            for (int i = 1; i < nums.size(); i++) {
                                if (nums.get(i) != 0.0) {
                                    result /= nums.get(i);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Can't divide by 0!", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 'n': {
                        this.resultField.setText(previous_text + '+');
                        this.getChar_list().add('+');
                    }
                    default:
                        break;
                }

                String s_result = String.valueOf(result);
                String[] split_result = s_result.split("\\.");

                if (split_result[1].length() > 1) {
                    this.resultField.setText(String.valueOf(result) + '+');
                } else {
                    if (result != 0.0) {
                        int newResult = (int) result;
                        this.resultField.setText(String.valueOf(Math.abs(newResult)) + '+');
                    } else {
                        this.resultField.setText(previous_text + '+');
                    }
                }
                this.getChar_list().clear();

                String toParse = String.valueOf(result);
                char[] array = toParse.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    this.getChar_list().add(c);
                }
            }
        }
    }//GEN-LAST:event_additionOPButton1ActionPerformed

    private void goBackOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackOneButtonActionPerformed
        String previous_text = this.resultField.getText();
        if (!previous_text.equals("0")) {
            String newText = previous_text.substring(0, previous_text.length() - 1);
            this.getChar_list().clear();
            
            if (newText.length() > 0) {
                this.resultField.setText(newText);

                String toParse = String.valueOf(newText);
                char[] array = toParse.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    this.getChar_list().add(c);
                }
            } else {
                this.resultField.setText("0");
                this.getChar_list().add('0');
            }
        }
    }//GEN-LAST:event_goBackOneButtonActionPerformed

    private void subtractionOPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionOPButtonActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        double result = 0.0;
        if (m.find()) {
            if (!previous_text.equals("0")) {
                char previous_op = 'n';
                if (previous_text.contains("+")) {
                    previous_op = '+';
                }
                if (previous_text.contains("x")) {
                    previous_op = 'x';
                }
                if (previous_text.contains("/")) {
                    previous_op = '/';
                }

                switch (previous_op) {
                    case '+': {
                        String[] split = previous_text.split("\\+");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = 0.0;
                        for (int i = 0; i < nums.size(); i++) {
                            result += nums.get(i);
                        }
                        break;
                    }
                    case 'x': {
                        String[] split = previous_text.split("x");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result *= nums.get(i);
                        }
                        break;
                    }
                    case '/': {
                        String[] split = previous_text.split("\\/");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        if (result != 0.0) {
                            for (int i = 1; i < nums.size(); i++) {
                                if (nums.get(i) != 0.0) {
                                    result /= nums.get(i);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Can't divide by 0!", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 'n': {
                        this.resultField.setText(previous_text + '-');
                        this.getChar_list().add('-');
                    }
                    default:
                        break;
                }

                String s_result = String.valueOf(result);
                String[] split_result = s_result.split("\\.");

                if (split_result[1].length() > 1) {
                    this.resultField.setText(String.valueOf(result) + '-');
                } else {
                    if (result != 0.0) {
                        int newResult = (int) result;
                        this.resultField.setText(String.valueOf(Math.abs(newResult)) + '-');
                    } else {
                        this.resultField.setText(previous_text + '-');
                    }
                }
                this.char_list.clear();

                String toParse = String.valueOf(result);
                char[] array = toParse.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    this.getChar_list().add(c);
                }
            }
        }
    }//GEN-LAST:event_subtractionOPButtonActionPerformed

    private void absButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absButtonActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        if (m.find()) {
            if (!previous_text.equals("0")) {
                if (!(previous_text.contains("+") && previous_text.contains("-") && previous_text.contains("x"))) {
                    double toReturn = Math.abs(Double.parseDouble(previous_text));

                    this.resultField.setText(String.valueOf(toReturn));
                    this.getChar_list().clear();

                    String s_result = String.valueOf(toReturn);
                    String[] split_result = s_result.split("\\.");

                    if (split_result[1].length() > 1) {
                        this.resultField.setText(String.valueOf(toReturn));
                    } else {
                        int newResult = (int) toReturn;
                        this.resultField.setText(String.valueOf(newResult));
                    }
                    this.char_list.clear();

                    String toParse = String.valueOf(toReturn);
                    char[] array = toParse.toCharArray();

                    for (int i = 0; i < array.length; i++) {
                        char c = array[i];
                        this.getChar_list().add(c);
                    }
                }
            }
        }
    }//GEN-LAST:event_absButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        double result = 0.0;
        if (m.find()) {
            if (!previous_text.equals("0")) {
                char previous_op = 'n';
                if (previous_text.contains("+")) {
                    previous_op = '+';
                }
                if (previous_text.contains("-")) {
                    previous_op = '-';
                }
                if (previous_text.contains("/")) {
                    previous_op = '/';
                }

                switch (previous_op) {
                    case '+': {
                        String[] split = previous_text.split("\\+");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = 0.0;
                        for (int i = 0; i < nums.size(); i++) {
                            result += nums.get(i);
                        }
                        break;
                    }
                    case '-': {
                        String[] split = previous_text.split("\\-");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result -= nums.get(i);
                        }
                        break;
                    }
                    case '/': {
                        String[] split = previous_text.split("\\/");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        if (result != 0.0) {
                            for (int i = 1; i < nums.size(); i++) {
                                if (nums.get(i) != 0.0) {
                                    result /= nums.get(i);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Can't divide by 0!", "Error", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 'n': {
                        this.resultField.setText(previous_text + '-');
                        this.getChar_list().add('-');
                    }
                    default:
                        break;
                }

                String s_result = String.valueOf(result);
                String[] split_result = s_result.split("\\.");

                if (split_result[1].length() > 1) {
                    this.resultField.setText(String.valueOf(Math.abs(result)) + 'x');
                } else {
                    if (result != 0.0) {
                        int newResult = (int) result;
                        this.resultField.setText(String.valueOf(Math.abs(newResult)) + 'x');
                    } else {
                        this.resultField.setText(previous_text + 'x');
                    }
                }
                this.char_list.clear();

                String toParse = String.valueOf(result);
                char[] array = toParse.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    this.getChar_list().add(c);
                }
            }
        }
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        double result = 0.0;
        if (m.find()) {
            if (!previous_text.equals("0")) {
                char previous_op = 'n';
                if (previous_text.contains("+")) {
                    previous_op = '+';
                }
                if (previous_text.contains("-")) {
                    previous_op = '-';
                }
                if (previous_text.contains("x")) {
                    previous_op = 'x';
                }

                switch (previous_op) {
                    case '+': {
                        String[] split = previous_text.split("\\+");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = 0.0;
                        for (int i = 0; i < nums.size(); i++) {
                            result += nums.get(i);
                        }
                        break;
                    }
                    case '-': {
                        String[] split = previous_text.split("\\-");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result -= nums.get(i);
                        }
                        break;
                    }
                    case 'x': {
                        String[] split = previous_text.split("x");
                        List<Double> nums = new ArrayList<>();

                        for (String num : split) {
                            if (!num.equals("")) {
                                Pattern pt = Pattern.compile("([0-9])");
                                Matcher mt = pt.matcher(num);
                                if (mt.find()) {
                                    nums.add(Math.abs(Double.parseDouble(num)));
                                }
                            }
                        }

                        result = nums.get(0);
                        for (int i = 1; i < nums.size(); i++) {
                            result *= nums.get(i);
                        }
                        break;
                    }
                    case 'n': {
                        this.resultField.setText(previous_text + '/');
                        this.getChar_list().add('/');
                    }
                    default:
                        break;
                }

                String s_result = String.valueOf(result);
                String[] split_result = s_result.split("\\.");

                if (split_result[1].length() > 1) {
                    this.resultField.setText(String.valueOf(Math.abs(result)) + '/');
                } else {
                    if (result != 0.0) {
                        int newResult = (int) result;
                        this.resultField.setText(String.valueOf(Math.abs(newResult)) + '/');
                    } else {
                        this.resultField.setText(previous_text + '/');
                    }
                }
                this.char_list.clear();

                String toParse = String.valueOf(result);
                char[] array = toParse.toCharArray();

                for (int i = 0; i < array.length; i++) {
                    char c = array[i];
                    this.getChar_list().add(c);
                }
            }
        }
    }//GEN-LAST:event_divideButtonActionPerformed

    private void dotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotButtonActionPerformed
        String previous_text = this.resultField.getText();

        char last_char = this.resultField.getText().charAt(this.resultField.getText().length() - 1);
        String s_last_char = String.valueOf(last_char);

        Pattern p = Pattern.compile("([0-9])");
        Matcher m = p.matcher(s_last_char);

        if (m.find()) {
            if (!previous_text.contains(".")) {
                this.resultField.setText(previous_text + '.');
            } else {
                char char_op = 'n';

                if (previous_text.contains("+")) {
                    char_op = '+';
                }
                if (previous_text.contains("-")) {
                    char_op = '-';
                }
                if (previous_text.contains("x")) {
                    char_op = 'x';
                }
                if (previous_text.contains("/")) {
                    char_op = '/';
                }

                if (char_op != 'x') {
                    String[] split = previous_text.split(String.valueOf("\\" + char_op));
                    for (String s : split) {
                        if (!s.contains(".")) {
                            this.resultField.setText(previous_text + '.');
                            break;
                        }
                    }
                } else {
                    String[] split = previous_text.split(String.valueOf(char_op));
                    for (String s : split) {
                        if (!s.contains(".")) {
                            this.resultField.setText(previous_text + '.');
                            break;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_dotButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton absButton;
    private javax.swing.JButton additionOPButton1;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton dotButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalsButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton goBackOneButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JTextField resultField;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton subtractionOPButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables

}

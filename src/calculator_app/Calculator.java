/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_app;

/**
 *
 * @author Xizz3l
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    
    double num,ans;
    int calculation;
    
    
    public Calculator() {
        initComponents();
        
        on.setEnabled(false); // disables ON button
    }
    
    public void arithmetic_operation()
    {
        switch(calculation)
        {
            case 1: // Addition
                ans = num + Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
                
            case 2: // Subtraction
                ans = num - Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
                
            case 3: // Multiplication
                ans = num * Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
                
            case 4: // Division
                ans = num / Double.parseDouble(display.getText());
                display.setText(Double.toString(ans));
                break;
        }
    }
    

    public void disable()
    {
        display.setEnabled(false);
        
        on.setEnabled(true); // enables ON button
        off.setEnabled(false); // disables OFF button
        
        display.setEnabled(false);
        backspace.setEnabled(false);
        comma.setEnabled(false);
        equals.setEnabled(false);
        numberOne.setEnabled(false);
        numberTwo.setEnabled(false);
        numberThree.setEnabled(false);
        numberFour.setEnabled(false);
        numberFive.setEnabled(false);
        numberSix.setEnabled(false);
        numberSeven.setEnabled(false);
        numberEight.setEnabled(false);
        numberNine.setEnabled(false);
        numberZero.setEnabled(false);
        add.setEnabled(false);
        subtract.setEnabled(false);
        multiply.setEnabled(false);
        divide.setEnabled(false);
        reset.setEnabled(false);
    }
    
    public void enable()
    {
        on.setEnabled(false); // disables ON button
        off.setEnabled(true); // enables OFF button
        
        display.setEnabled(true);
        backspace.setEnabled(true);
        comma.setEnabled(true);
        equals.setEnabled(true);
        numberOne.setEnabled(true);
        numberTwo.setEnabled(true);
        numberThree.setEnabled(true);
        numberFour.setEnabled(true);
        numberFive.setEnabled(true);
        numberSix.setEnabled(true);
        numberSeven.setEnabled(true);
        numberEight.setEnabled(true);
        numberNine.setEnabled(true);
        numberZero.setEnabled(true);
        add.setEnabled(true);
        subtract.setEnabled(true);
        multiply.setEnabled(true);
        divide.setEnabled(true);
        reset.setEnabled(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display = new javax.swing.JTextField();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        numberZero = new javax.swing.JButton();
        numberOne = new javax.swing.JButton();
        numberTwo = new javax.swing.JButton();
        numberThree = new javax.swing.JButton();
        numberFour = new javax.swing.JButton();
        numberFive = new javax.swing.JButton();
        numberSix = new javax.swing.JButton();
        numberSeven = new javax.swing.JButton();
        numberEight = new javax.swing.JButton();
        numberNine = new javax.swing.JButton();
        add = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        comma = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        interimCalculation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        display.setEditable(false);
        display.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setToolTipText("");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        buttonGroup1.add(on);
        on.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        numberZero.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberZero.setText("0");
        numberZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberZeroActionPerformed(evt);
            }
        });

        numberOne.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberOne.setText("1");
        numberOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOneActionPerformed(evt);
            }
        });

        numberTwo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberTwo.setText("2");
        numberTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberTwoActionPerformed(evt);
            }
        });

        numberThree.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberThree.setText("3");
        numberThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberThreeActionPerformed(evt);
            }
        });

        numberFour.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberFour.setText("4");
        numberFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFourActionPerformed(evt);
            }
        });

        numberFive.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberFive.setText("5");
        numberFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFiveActionPerformed(evt);
            }
        });

        numberSix.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberSix.setText("6");
        numberSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSixActionPerformed(evt);
            }
        });

        numberSeven.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberSeven.setText("7");
        numberSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberSevenActionPerformed(evt);
            }
        });

        numberEight.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberEight.setText("8");
        numberEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberEightActionPerformed(evt);
            }
        });

        numberNine.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        numberNine.setText("9");
        numberNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberNineActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        add.setText("+");
        add.setToolTipText("");
        add.setMaximumSize(new java.awt.Dimension(45, 33));
        add.setMinimumSize(new java.awt.Dimension(45, 33));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        subtract.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        subtract.setText("-");
        subtract.setToolTipText("");
        subtract.setMaximumSize(new java.awt.Dimension(45, 33));
        subtract.setMinimumSize(new java.awt.Dimension(45, 33));
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        multiply.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        equals.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        comma.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        comma.setText(".");
        comma.setMaximumSize(new java.awt.Dimension(45, 33));
        comma.setMinimumSize(new java.awt.Dimension(45, 33));
        comma.setPreferredSize(new java.awt.Dimension(45, 33));
        comma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        reset.setText("C");
        reset.setToolTipText("");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        backspace.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        backspace.setText("<-");
        backspace.setToolTipText("");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        interimCalculation.setForeground(new java.awt.Color(102, 102, 102));
        interimCalculation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(off)
                            .addComponent(on))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numberThree, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numberFour, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberFive, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberSix, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numberSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberEight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberNine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(interimCalculation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(interimCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(off, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberSeven, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberEight, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberNine, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(subtract, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberFour, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberFive, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberSix, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOne, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(numberThree, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberZero, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(comma, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(equals, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        disable(); //call disable method
    }//GEN-LAST:event_offActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        enable(); //call enable method
    }//GEN-LAST:event_onActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        display.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        num = Double.parseDouble(display.getText());
        calculation = 1;
        display.setText("");
        interimCalculation.setText(num + "+");
    }//GEN-LAST:event_addActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void numberOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOneActionPerformed
        display.setText(display.getText() + "1");
    }//GEN-LAST:event_numberOneActionPerformed

    private void numberTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberTwoActionPerformed
        display.setText(display.getText() + "2");
    }//GEN-LAST:event_numberTwoActionPerformed

    private void numberThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberThreeActionPerformed
        display.setText(display.getText() + "3");
    }//GEN-LAST:event_numberThreeActionPerformed

    private void numberFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFourActionPerformed
        display.setText(display.getText() + "4");
    }//GEN-LAST:event_numberFourActionPerformed

    private void numberFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFiveActionPerformed
        display.setText(display.getText() + "5");
    }//GEN-LAST:event_numberFiveActionPerformed

    private void numberSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSixActionPerformed
        display.setText(display.getText() + "6");
    }//GEN-LAST:event_numberSixActionPerformed

    private void numberSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberSevenActionPerformed
        display.setText(display.getText() + "7");
    }//GEN-LAST:event_numberSevenActionPerformed

    private void numberEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberEightActionPerformed
        display.setText(display.getText() + "8");
    }//GEN-LAST:event_numberEightActionPerformed

    private void numberNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberNineActionPerformed
        display.setText(display.getText() + "9");
    }//GEN-LAST:event_numberNineActionPerformed

    private void numberZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberZeroActionPerformed
        display.setText(display.getText() + "0");
    }//GEN-LAST:event_numberZeroActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        num = Double.parseDouble(display.getText());
        calculation = 2;
        display.setText("");
        interimCalculation.setText(num + "-");
    }//GEN-LAST:event_subtractActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        num = Double.parseDouble(display.getText());
        calculation = 3;
        display.setText("");
        interimCalculation.setText(num + "*");
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        num = Double.parseDouble(display.getText());
        calculation = 4;
        display.setText("");
        interimCalculation.setText(num + "/");
    }//GEN-LAST:event_divideActionPerformed

    private void commaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaActionPerformed
        display.setText(display.getText() + ".");
    }//GEN-LAST:event_commaActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        
        int length = display.getText().length();
        int number = display.getText().length() - 1;
        String store;
        
        if (length > 0)
        {    
            StringBuilder back = new StringBuilder(display.getText());
            back.deleteCharAt(number);
            store = back.toString();
            display.setText(store);
            
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        arithmetic_operation();
        interimCalculation.setText("");
    }//GEN-LAST:event_equalsActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backspace;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton comma;
    private javax.swing.JTextField display;
    private javax.swing.JButton divide;
    private javax.swing.JButton equals;
    private javax.swing.JLabel interimCalculation;
    private javax.swing.JButton multiply;
    private javax.swing.JButton numberEight;
    private javax.swing.JButton numberFive;
    private javax.swing.JButton numberFour;
    private javax.swing.JButton numberNine;
    private javax.swing.JButton numberOne;
    private javax.swing.JButton numberSeven;
    private javax.swing.JButton numberSix;
    private javax.swing.JButton numberThree;
    private javax.swing.JButton numberTwo;
    private javax.swing.JButton numberZero;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton reset;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}

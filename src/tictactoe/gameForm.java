package tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author SHIBLI
 */
public class gameForm extends javax.swing.JFrame {

    /**
     * Creates new form gameForm
     */
    public gameForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tic Tac Toe by Shibli");
    }
    //****Check how will win****//
    public void chkwin()
    {
        if(btnOne.getText().equals("X")) {
            if(btnFour.getText().equals("X")) {
                if(btnSeven.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnOne.getText().equals("X")) {
            if(btnTwo.getText().equals("X")) {
                if(btnThree.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnTwo.getText().equals("X")) {
            if(btnFive.getText().equals("X")) {
                if(btnEight.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnThree.getText().equals("X")) {
            if(btnSix.getText().equals("X")) {
                if(btnNine.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnFour.getText().equals("X")) {
            if(btnFive.getText().equals("X")) {
                if(btnSix.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnSeven.getText().equals("X")) {
            if(btnEight.getText().equals("X")) {
                if(btnNine.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnThree.getText().equals("X")) {
            if(btnFive.getText().equals("X")) {
                if(btnSeven.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnOne.getText().equals("X")) {
            if(btnFive.getText().equals("X")) {
                if(btnNine.getText().equals("X")) {
                    JOptionPane.showMessageDialog(jf,player1+ " "+"Won!!");
                }
            }
        }
        if(btnOne.getText().equals("O")) {
            if(btnFour.getText().equals("O")) {
                if(btnSeven.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnOne.getText().equals("O")) {
            if(btnTwo.getText().equals("O")) {
                if(btnThree.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnTwo.getText().equals("O")) {
            if(btnFive.getText().equals("O")) {
                if(btnEight.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnThree.getText().equals("O")) {
            if(btnSix.getText().equals("O")) {
                if(btnNine.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnFour.getText().equals("O")) {
            if(btnFive.getText().equals("O")) {
                if(btnSix.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnSeven.getText().equals("O")) {
            if(btnEight.getText().equals("O")) {
                if(btnNine.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnThree.getText().equals("O")) {
            if(btnFive.getText().equals("O")) {
                if(btnSeven.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        if(btnOne.getText().equals("O")) {
            if(btnFive.getText().equals("O")) {
                if(btnNine.getText().equals("O")) {
                    JOptionPane.showMessageDialog(jf,player2+ " "+"Won!!");
                }
            }
        }
        else if(flag1+flag2+flag3+flag4+flag5+flag6+flag7+flag8+flag9==9) {
            JOptionPane.showMessageDialog(jf,"Bad Luck! Game Tied!!");
            flag1=0;flag2=0;flag3=0;flag4=0;flag5=0;flag6=0;flag7=0;flag8=0;flag9=0;
        }
        //flag1=0;flag2=0;flag3=0;flag4=0;flag5=0;flag6=0;flag7=0;flag8=0;flag9=0;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new javax.swing.JPanel();
        squarePanel = new javax.swing.JPanel();
        btnEight = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        p1displayLabel = new javax.swing.JLabel();
        p2displayLabel = new javax.swing.JLabel();
        btnUndo = new javax.swing.JButton();
        btnNG = new javax.swing.JButton();
        labelX = new javax.swing.JLabel();
        labelO = new javax.swing.JLabel();
        btnMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePanel.setBackground(new java.awt.Color(0, 102, 51));

        squarePanel.setBackground(new java.awt.Color(0, 102, 0));

        btnEight.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnOne.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout squarePanelLayout = new javax.swing.GroupLayout(squarePanel);
        squarePanel.setLayout(squarePanelLayout);
        squarePanelLayout.setHorizontalGroup(
            squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(squarePanelLayout.createSequentialGroup()
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btnFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
        );
        squarePanelLayout.setVerticalGroup(
            squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(squarePanelLayout.createSequentialGroup()
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addComponent(btnEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSix, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(squarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        p1displayLabel.setBackground(new java.awt.Color(51, 51, 51));
        p1displayLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p1displayLabel.setForeground(new java.awt.Color(255, 255, 255));
        p1displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1displayLabel.setText("Player 1");

        p2displayLabel.setBackground(new java.awt.Color(255, 255, 255));
        p2displayLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        p2displayLabel.setForeground(new java.awt.Color(255, 255, 255));
        p2displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2displayLabel.setText("Player 2");

        btnUndo.setText("UNDO");
        btnUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUndoActionPerformed(evt);
            }
        });

        btnNG.setText("Rematch");
        btnNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNGActionPerformed(evt);
            }
        });

        labelX.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        labelX.setForeground(new java.awt.Color(204, 0, 0));
        labelX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelX.setText("X");

        labelO.setBackground(new java.awt.Color(204, 0, 0));
        labelO.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        labelO.setForeground(new java.awt.Color(204, 0, 0));
        labelO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelO.setText("O");

        btnMain.setText("Main Menu");
        btnMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUndo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNG, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(btnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gamePanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(labelO, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(squarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(squarePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2displayLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p1displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUndo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(btnNG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMain))
                    .addComponent(labelO, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if(btnEight.getText().isEmpty()) {
            if(xturn) {
                btnEight.setText("X");
                flag8=1;
            }
            else {
                btnEight.setText("O");
                flag8=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if(btnSix.getText().isEmpty()) {
            if(xturn) {
                btnSix.setText("X");
                flag6=1;
            }
            else {
                btnSix.setText("O");
                flag6=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if(btnSeven.getText().isEmpty()) {
            if(xturn) {
                btnSeven.setText("X");
                flag7=1;
            }
            else {
                btnSeven.setText("O");
                flag7=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if(btnNine.getText().isEmpty()) {
            if(xturn) {
                btnNine.setText("X");
                flag9=1;
            }
            else {
                btnNine.setText("O");
                flag9=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if(btnFour.getText().isEmpty()) {
            if(xturn) {
                btnFour.setText("X");
                flag4=1;
            }
            else {
                btnFour.setText("O");
                flag4=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if(btnFive.getText().isEmpty()) {
            if(xturn) {
                btnFive.setText("X");
                flag5=1;
            }
            else {
                btnFive.setText("O");
                flag5=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if(btnOne.getText().isEmpty()) {
            if(xturn) {
                btnOne.setText("X");
                flag1=1;
            }
            else {
                btnOne.setText("O");
                flag1=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if(btnTwo.getText().isEmpty()) {
            if(xturn) {
                btnTwo.setText("X");
                flag2=1;
            }
            else {
                btnTwo.setText("O");
                flag2=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if(btnThree.getText().isEmpty()) {
            if(xturn) {
                btnThree.setText("X");
                flag3=1;
            }
            else {
                btnThree.setText("O");
                flag3=1;
            }
            xturn=!xturn;
        }
        chkwin();
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUndoActionPerformed
        
    }//GEN-LAST:event_btnUndoActionPerformed

    private void btnNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNGActionPerformed

        /*this.setVisible(false);
        TicTacLogin ttl=new TicTacLogin();
        ttl.setVisible(true);*/
        btnOne.setText("");
        btnTwo.setText("");
        btnThree.setText("");
        btnFour.setText("");
        btnFive.setText("");
        btnSix.setText("");
        btnSeven.setText("");
        btnEight.setText("");
        btnNine.setText("");
    }//GEN-LAST:event_btnNGActionPerformed

    private void btnMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainActionPerformed
        this.setVisible(false);
        ticMain tm=new ticMain();
        tm.setVisible(true);
    }//GEN-LAST:event_btnMainActionPerformed
    //**Variables Declarations**//
    boolean xturn=true;
    String p1=new String();
    String p2=new String();
    public String player1=new String();
    public String player2=new String();
    int flag1=0,flag2=0,flag3=0,flag4=0,flag5=0,flag6=0,flag7=0,flag8=0,flag9=0;

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
            java.util.logging.Logger.getLogger(gameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameForm().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JPanel gamePanel;
    public javax.swing.JLabel p1displayLabel;
    public javax.swing.JLabel p2displayLabel;
    private javax.swing.JPanel squarePanel;
    private javax.swing.JButton btnUndo;
    private javax.swing.JButton btnNG;
    private javax.swing.JFrame jf;
    private javax.swing.JLabel labelO;
    private javax.swing.JLabel labelX;
    private javax.swing.JButton btnMain;
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMain;
    private javax.swing.JButton btnNG;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnUndo;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel labelO;
    private javax.swing.JLabel labelX;
    private javax.swing.JLabel p1displayLabel;
    private javax.swing.JLabel p2displayLabel;
    private javax.swing.JPanel squarePanel;
    // End of variables declaration//GEN-END:variables
*/
    }


package tictactoe;

/**
 *
 * @author SHIBLI
 */
public class TicTacLogin extends javax.swing.JFrame {

    public TicTacLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tic Tac Toe by Shibli");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        lebelicon = new javax.swing.JLabel();
        lebelP1 = new javax.swing.JLabel();
        txtP1 = new javax.swing.JTextField();
        lebelP2 = new javax.swing.JLabel();
        txtP2 = new javax.swing.JTextField();
        btnPlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(204, 0, 0));

        lebelicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/logo-tictactoe.png"))); // NOI18N

        lebelP1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lebelP1.setForeground(new java.awt.Color(0, 0, 0));
        lebelP1.setText("Player 1:");

        txtP1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        lebelP2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lebelP2.setForeground(new java.awt.Color(0, 0, 0));
        lebelP2.setText("Player 2:");

        txtP2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        btnPlay.setBackground(new java.awt.Color(0, 102, 51));
        btnPlay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnPlay.setText("PLAY!");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jLabel1.setText("© Sabbir Ahmed Shibli - 2016");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtP2)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lebelP2)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtP1)
                                    .addComponent(lebelP1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lebelicon, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lebelicon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lebelP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtP1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lebelP2)
                .addGap(18, 18, 18)
                .addComponent(txtP2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        //**Submit/Play Button**//
        player1=txtP1.getText().toString();
        player2=txtP2.getText().toString();
        this.setVisible(false);
        gameForm g=new gameForm();
        g.setVisible(true);
        g.p1displayLabel.setText("1: "+player1+" [X]");
        g.p2displayLabel.setText("2: "+player2+" [O]");
        g.player1=this.player1;
        g.player2=this.player2;
        
    }//GEN-LAST:event_btnPlayActionPerformed

    //**Variables Declaration**//
    public String player1=new String();
    public String player2=new String();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacLogin().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lebelP1;
    private javax.swing.JLabel lebelP2;
    private javax.swing.JLabel lebelicon;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lebelP1;
    private javax.swing.JLabel lebelP2;
    private javax.swing.JLabel lebelicon;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField txtP1;
    private javax.swing.JTextField txtP2;
    // End of variables declaration//GEN-END:variables
*/
}

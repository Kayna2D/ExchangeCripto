/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Usuario
 */
public class TransferenciaFrame extends javax.swing.JFrame {

    /**
     * Creates new form TransferenciaFrame
     */
    public TransferenciaFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBitcoin = new javax.swing.JPanel();
        imgBitcoin = new javax.swing.JLabel();
        lblBitcoin = new javax.swing.JLabel();
        btComprarBit = new javax.swing.JButton();
        btVenderBit = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblCotacaoBit = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        pnlBitcoin1 = new javax.swing.JPanel();
        imgEthereum = new javax.swing.JLabel();
        lblEthereum = new javax.swing.JLabel();
        btComprarEth = new javax.swing.JButton();
        btVenderEth = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        lblCotacaoEth = new javax.swing.JLabel();
        pnlBitcoin2 = new javax.swing.JPanel();
        imgRipple = new javax.swing.JLabel();
        lblRipple = new javax.swing.JLabel();
        btComprarRip = new javax.swing.JButton();
        btVenderRip = new javax.swing.JButton();
        lbl3 = new javax.swing.JLabel();
        lblCotacaoRip = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBitcoin.setBackground(new java.awt.Color(255, 255, 255));
        pnlBitcoin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgBitcoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/bitcoin.png"))); // NOI18N

        lblBitcoin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBitcoin.setText("Bitcoin");

        btComprarBit.setBackground(new java.awt.Color(62, 156, 53));
        btComprarBit.setText("COMPRAR");

        btVenderBit.setBackground(new java.awt.Color(228, 58, 54));
        btVenderBit.setText("VENDER");

        lbl1.setText("Cotação:");

        lblCotacaoBit.setText("0.0");

        javax.swing.GroupLayout pnlBitcoinLayout = new javax.swing.GroupLayout(pnlBitcoin);
        pnlBitcoin.setLayout(pnlBitcoinLayout);
        pnlBitcoinLayout.setHorizontalGroup(
            pnlBitcoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoinLayout.createSequentialGroup()
                .addComponent(btComprarBit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVenderBit))
            .addGroup(pnlBitcoinLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblBitcoin))
            .addGroup(pnlBitcoinLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imgBitcoin))
            .addGroup(pnlBitcoinLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCotacaoBit))
        );
        pnlBitcoinLayout.setVerticalGroup(
            pnlBitcoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoinLayout.createSequentialGroup()
                .addComponent(lblBitcoin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgBitcoin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pnlBitcoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(lblCotacaoBit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBitcoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprarBit)
                    .addComponent(btVenderBit)))
        );

        lblTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo1.setText("ExchangeCripto");

        pnlBitcoin1.setBackground(new java.awt.Color(255, 255, 255));
        pnlBitcoin1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgEthereum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ethereum.png"))); // NOI18N

        lblEthereum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEthereum.setText("Ethereum");
        lblEthereum.setToolTipText("");

        btComprarEth.setBackground(new java.awt.Color(62, 156, 53));
        btComprarEth.setText("COMPRAR");

        btVenderEth.setBackground(new java.awt.Color(228, 58, 54));
        btVenderEth.setText("VENDER");

        lbl2.setText("Cotação:");

        lblCotacaoEth.setText("0.0");

        javax.swing.GroupLayout pnlBitcoin1Layout = new javax.swing.GroupLayout(pnlBitcoin1);
        pnlBitcoin1.setLayout(pnlBitcoin1Layout);
        pnlBitcoin1Layout.setHorizontalGroup(
            pnlBitcoin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoin1Layout.createSequentialGroup()
                .addComponent(btComprarEth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVenderEth))
            .addGroup(pnlBitcoin1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imgEthereum))
            .addGroup(pnlBitcoin1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCotacaoEth))
            .addGroup(pnlBitcoin1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblEthereum))
        );
        pnlBitcoin1Layout.setVerticalGroup(
            pnlBitcoin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoin1Layout.createSequentialGroup()
                .addComponent(lblEthereum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgEthereum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(pnlBitcoin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(lblCotacaoEth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBitcoin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprarEth)
                    .addComponent(btVenderEth)))
        );

        pnlBitcoin2.setBackground(new java.awt.Color(255, 255, 255));
        pnlBitcoin2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgRipple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/ripple.png"))); // NOI18N

        lblRipple.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRipple.setText("Ripple");

        btComprarRip.setBackground(new java.awt.Color(62, 156, 53));
        btComprarRip.setText("COMPRAR");

        btVenderRip.setBackground(new java.awt.Color(228, 58, 54));
        btVenderRip.setText("VENDER");

        lbl3.setText("Cotação:");

        lblCotacaoRip.setText("0.0");

        javax.swing.GroupLayout pnlBitcoin2Layout = new javax.swing.GroupLayout(pnlBitcoin2);
        pnlBitcoin2.setLayout(pnlBitcoin2Layout);
        pnlBitcoin2Layout.setHorizontalGroup(
            pnlBitcoin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoin2Layout.createSequentialGroup()
                .addComponent(btComprarRip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVenderRip))
            .addGroup(pnlBitcoin2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(imgRipple))
            .addGroup(pnlBitcoin2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCotacaoRip))
            .addGroup(pnlBitcoin2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblRipple))
        );
        pnlBitcoin2Layout.setVerticalGroup(
            pnlBitcoin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBitcoin2Layout.createSequentialGroup()
                .addComponent(lblRipple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgRipple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBitcoin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(lblCotacaoRip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBitcoin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComprarRip)
                    .addComponent(btVenderRip)))
        );

        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/volta.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pnlBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlBitcoin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo1)))
                .addGap(24, 24, 24)
                .addComponent(pnlBitcoin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTitulo1))
                    .addComponent(btVoltar))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBitcoin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBitcoin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TransferenciaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TransferenciaFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprarBit;
    private javax.swing.JButton btComprarEth;
    private javax.swing.JButton btComprarRip;
    private javax.swing.JButton btVenderBit;
    private javax.swing.JButton btVenderEth;
    private javax.swing.JButton btVenderRip;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel imgBitcoin;
    private javax.swing.JLabel imgEthereum;
    private javax.swing.JLabel imgRipple;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lblBitcoin;
    private javax.swing.JLabel lblCotacaoBit;
    private javax.swing.JLabel lblCotacaoEth;
    private javax.swing.JLabel lblCotacaoRip;
    private javax.swing.JLabel lblEthereum;
    private javax.swing.JLabel lblRipple;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JPanel pnlBitcoin;
    private javax.swing.JPanel pnlBitcoin1;
    private javax.swing.JPanel pnlBitcoin2;
    // End of variables declaration//GEN-END:variables
}

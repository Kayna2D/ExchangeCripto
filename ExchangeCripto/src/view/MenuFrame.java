/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Usuario
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
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

        lblBem = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        mnConsulta = new javax.swing.JMenu();
        mnSaldo = new javax.swing.JMenuItem();
        mnExtrato = new javax.swing.JMenuItem();
        mnDinheiro = new javax.swing.JMenu();
        mnDepositar = new javax.swing.JMenuItem();
        mnSacar = new javax.swing.JMenuItem();
        mnCripto = new javax.swing.JMenu();
        mnComprar = new javax.swing.JMenuItem();
        mnVender = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBem.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBem.setText("Bem Vindo");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNome.setText("nome");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Gerencie suas Criptomodedas");

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/menuImg.png"))); // NOI18N

        mnConsulta.setText("Consultas");

        mnSaldo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSaldo.setText("Saldo");
        mnSaldo.setActionCommand("Saldo");
        mnConsulta.add(mnSaldo);

        mnExtrato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnExtrato.setText("Extrato");
        mnConsulta.add(mnExtrato);

        menu.add(mnConsulta);

        mnDinheiro.setText("Dinheiro");

        mnDepositar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDepositar.setText("Depositar");
        mnDinheiro.add(mnDepositar);

        mnSacar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnSacar.setText("Sacar");
        mnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSacarActionPerformed(evt);
            }
        });
        mnDinheiro.add(mnSacar);

        menu.add(mnDinheiro);

        mnCripto.setText("Criptomoedas");

        mnComprar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnComprar.setText("Comprar");
        mnCripto.add(mnComprar);

        mnVender.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnVender.setText("Vender");
        mnCripto.add(mnVender);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Atualizar cotação");
        mnCripto.add(jMenuItem1);

        menu.add(mnCripto);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)))
                .addGap(28, 28, 28)
                .addComponent(lblImg)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBem)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblImg)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSacarActionPerformed

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
//            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblBem;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNome;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem mnComprar;
    private javax.swing.JMenu mnConsulta;
    private javax.swing.JMenu mnCripto;
    private javax.swing.JMenuItem mnDepositar;
    private javax.swing.JMenu mnDinheiro;
    private javax.swing.JMenuItem mnExtrato;
    private javax.swing.JMenuItem mnSacar;
    private javax.swing.JMenuItem mnSaldo;
    private javax.swing.JMenuItem mnVender;
    // End of variables declaration//GEN-END:variables
}

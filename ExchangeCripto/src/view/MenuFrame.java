/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerMenu;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.Investidor;

/**
 *
 * @author Usuario
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame(Investidor investidor) {
        initComponents();
        lblNome.setText(investidor.getNome());
        c = new ControllerMenu(this, investidor);
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JMenuItem getjMenuItem1() {
        return jMenuItem1;
    }

    public void setjMenuItem1(JMenuItem jMenuItem1) {
        this.jMenuItem1 = jMenuItem1;
    }

    public JLabel getLblBem() {
        return lblBem;
    }

    public void setLblBem(JLabel lblBem) {
        this.lblBem = lblBem;
    }

    public JLabel getLblImg() {
        return lblImg;
    }

    public void setLblImg(JLabel lblImg) {
        this.lblImg = lblImg;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public JMenuItem getMnComprar() {
        return mnComprar;
    }

    public void setMnComprar(JMenuItem mnComprar) {
        this.mnComprar = mnComprar;
    }

    public JMenu getMnConsulta() {
        return mnConsulta;
    }

    public void setMnConsulta(JMenu mnConsulta) {
        this.mnConsulta = mnConsulta;
    }

    public JMenu getMnCripto() {
        return mnCripto;
    }

    public void setMnCripto(JMenu mnCripto) {
        this.mnCripto = mnCripto;
    }

    public JMenuItem getMnDepositar() {
        return mnDepositar;
    }

    public void setMnDepositar(JMenuItem mnDepositar) {
        this.mnDepositar = mnDepositar;
    }

    public JMenu getMnDinheiro() {
        return mnDinheiro;
    }

    public void setMnDinheiro(JMenu mnDinheiro) {
        this.mnDinheiro = mnDinheiro;
    }

    public JMenuItem getMnExtrato() {
        return mnExtrato;
    }

    public void setMnExtrato(JMenuItem mnExtrato) {
        this.mnExtrato = mnExtrato;
    }

    public JMenuItem getMnSacar() {
        return mnSacar;
    }

    public void setMnSacar(JMenuItem mnSacar) {
        this.mnSacar = mnSacar;
    }

    public JMenuItem getMnSaldo() {
        return mnSaldo;
    }

    public void setMnSaldo(JMenuItem mnSaldo) {
        this.mnSaldo = mnSaldo;
    }

    public JMenuItem getMnVender() {
        return mnVender;
    }

    public void setMnVender(JMenuItem mnVender) {
        this.mnVender = mnVender;
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
        mnSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnSaldoMouseClicked(evt);
            }
        });
        mnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaldoActionPerformed(evt);
            }
        });
        mnConsulta.add(mnSaldo);

        mnExtrato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnExtrato.setText("Extrato");
        mnConsulta.add(mnExtrato);

        menu.add(mnConsulta);

        mnDinheiro.setText("Dinheiro");

        mnDepositar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnDepositar.setText("Depositar");
        mnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDepositarActionPerformed(evt);
            }
        });
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
        c.sacar();
    }//GEN-LAST:event_mnSacarActionPerformed

    private void mnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaldoActionPerformed
        c.exibirSaldo();
    }//GEN-LAST:event_mnSaldoActionPerformed

    private void mnSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnSaldoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnSaldoMouseClicked

    private void mnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDepositarActionPerformed
        c.depositar();
    }//GEN-LAST:event_mnDepositarActionPerformed

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

    private ControllerMenu c;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author Usuario
 */

import javax.swing.*;
import model.Investidor;

public class SenhaDialog extends JDialog {
    private JPasswordField txtSenha;
    private JButton btConfirmar;
    private Investidor investidor;
    private boolean senhaCorreta = false;

    public SenhaDialog(JFrame parent, Investidor investidor) {
        super(parent, "Confirme sua senha: ", true);
        this.investidor = investidor;
        
        txtSenha = new JPasswordField(6);
        btConfirmar = new JButton("Confirmar");
        
        btConfirmar.addActionListener(e -> {
            String senhaInserida = new String(txtSenha.getPassword());
            if (senhaInserida.equals(investidor.getSenha())) {
                senhaCorreta = true;
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Senha incorreta!", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(new JLabel("Informe sua senha:"));
        panel.add(txtSenha);
        panel.add(btConfirmar);
        
        this.setContentPane(panel);
        this.pack();
        this.setLocationRelativeTo(parent);
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JButton getBtConfirmar() {
        return btConfirmar;
    }

    public void setBtConfirmar(JButton btConfirmar) {
        this.btConfirmar = btConfirmar;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public boolean isSenhaCorreta() {
        return senhaCorreta;
    }

    public void setSenhaCorreta(boolean senhaCorreta) {
        this.senhaCorreta = senhaCorreta;
    }
    
    
 
    
}

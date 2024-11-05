/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.CotacaoDAO;
import DAO.InvestidorDAO;
import javax.swing.JOptionPane;
import model.Investidor;
import view.MenuFrame;
import view.SenhaDialog;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Random;
import model.Moeda;
import view.SaldoFrame;
import view.TransferenciaFrame;


/**
 *
 * @author Usuario
 */
public class ControllerMenu {
    private MenuFrame view;
    private Investidor investidor;

    public ControllerMenu(MenuFrame view, Investidor investidor) {
        this.view = view;
        this.investidor = investidor;
//        addActionListeners();
    }
    
//    private void addActionListeners() {
//        view.getMnSaldo().addActionListener(e -> exibirSaldo(JFrame frame));
//    }
    
    public void exibirSaldo() {
        SenhaDialog sd = new SenhaDialog(view, investidor);
        sd.setVisible(true);
        
        if (sd.isSenhaCorreta()) {
            SaldoFrame sf = new SaldoFrame(investidor);
            sf.setVisible(true);
        }
    }
    
    public void exibirTransferencia() {
        SenhaDialog sd = new SenhaDialog(view, investidor);
        sd.setVisible(true);
        
        if (sd.isSenhaCorreta()) {
            TransferenciaFrame tf = new TransferenciaFrame(investidor);
            tf.setVisible(true);
        }
    }
    
    public void exibirSaldoSemSenha() {
        SaldoFrame sf = new SaldoFrame(investidor);
        sf.setVisible(true);
        
    }
    
    public void depositar() {
        String valorStr = JOptionPane.showInputDialog(view, 
                "Informe o valor para depósito: ");
        Conexao conexao = new Conexao();
        if (valorStr != null && !valorStr.isEmpty()) {
            try {
                Connection conn = conexao.getConnection();
                InvestidorDAO dao = new InvestidorDAO(conn);
                double valor = Double.parseDouble(valorStr);
                if (valor > 0) {
                    investidor.getCarteira().getMoedas().get(0).setValor(
                            investidor.getCarteira().getMoedas().get(0).getValor() 
                                    + valor
                    );
                    dao.atualizarReais(investidor);
                    exibirSaldoSemSenha();
                } else {
                    JOptionPane.showMessageDialog(view, 
                            "O valor deve ser positivo");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(view, "Erro ao atualizar saldo.");
            }
        }
    }
    
    public void sacar() {
        String valorStr = JOptionPane.showInputDialog(view, 
                "Informe o valor para depósito: ");
        Conexao conexao = new Conexao();
        if (valorStr != null && !valorStr.isEmpty()) {
            try {
                Connection conn = conexao.getConnection();
                InvestidorDAO dao = new InvestidorDAO(conn);
                double valor = Double.parseDouble(valorStr);
                double saldoAtual = investidor.getCarteira().getMoedas().get(0).getValor();
                if (valor > 0 && valor <= saldoAtual) {
                    investidor.getCarteira().getMoedas().get(0).setValor(
                            saldoAtual - valor);
                    dao.atualizarReais(investidor);
                    exibirSaldoSemSenha();
                } else if (valor > saldoAtual) {
                    JOptionPane.showMessageDialog(view, "Saldo insuficiente.");
                } else {
                    JOptionPane.showMessageDialog(view, "O valor deve ser positivo");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(view, "Erro ao atualizar saldo.");
            }
        }
    }
    
    public void atualizarCotacao() {
        Random random = new Random();
        Conexao conexao = new Conexao();
        for (Moeda moeda : investidor.getCarteira().getMoedas()) {
            if (moeda.getNome().equalsIgnoreCase("Real")) {
                continue;
            }
            
            double variacao = (random.nextDouble() * 0.1) - 0.05;
            double novaCotacao = moeda.getCotacao() * (1 + variacao);
            moeda.setCotacao(novaCotacao);
            try {
                Connection conn = conexao.getConnection();
                CotacaoDAO dao = new CotacaoDAO(conn);
                
                dao.atualizarCotacao(moeda.getNome(), novaCotacao);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(view, "Erro ao atualizar cotação",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(view, "Cotações atualizadas com sucesso");

    }
    
}

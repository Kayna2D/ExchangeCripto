/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import model.Moeda;
import view.TransferenciaFrame;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;



/**
 *
 * @author Usuario
 */
public class ControllerTransferencia {
    private TransferenciaFrame view;
    private Investidor investidor;

    public ControllerTransferencia(TransferenciaFrame view, Investidor investidor) {
        this.view = view;
        this.investidor = investidor;
    }
    
    public void comprar(String nomeMoeda) {
        String quantStr = JOptionPane.showInputDialog(view, 
                "Informe a quantidade de " + nomeMoeda + " desejada: ");
        if (quantStr != null && !quantStr.isEmpty()) {
            try {
                double quantidade = Double.parseDouble(quantStr);
                if (quantidade > 0) {
                    comprarMoeda(nomeMoeda, quantidade);
                } else {
                    JOptionPane.showMessageDialog(view, "Informe um número positivo");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(view, "Erro ao realizar operação.");
            }
        }
    }
    
    public void comprarMoeda(String nomeMoeda, double quantidade) throws SQLException {
        Moeda moeda = investidor.getCarteira().getMoeda(nomeMoeda);
        Conexao conexao = new Conexao();
        double valorBruto = quantidade * moeda.getCotacao();
        double tarifa = moeda.calcularTarifa(quantidade);
        double valor = valorBruto + tarifa; 
        
        Moeda real = investidor.getCarteira().getMoeda("Real");
        if (real.getValor() >= valor) {
            real.setValor(real.getValor() - valor);
            moeda.setValor(moeda.getValor() + quantidade);
            
           
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
              
            dao.atualizarMoeda(investidor, "real", real.getValor());
            dao.atualizarMoeda(investidor, nomeMoeda, moeda.getValor());
                
            JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(view, "Saldo insuficiente!");
        }
    }
    
    public void vender(String nomeMoeda) {
        String quantStr = JOptionPane.showInputDialog(view, 
                "Informe a quantidade de " + nomeMoeda + " desejada: ");
        if (quantStr != null && !quantStr.isEmpty()) {
            try {
                double quantidade = Double.parseDouble(quantStr);
                if (quantidade > 0) {
                    venderMoeda(nomeMoeda, quantidade);
                } else {
                    JOptionPane.showMessageDialog(view, "Informe um número positivo");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(view, "Erro ao realizar operação.");
            }
        }
    }
    
    
    public void venderMoeda(String nomeMoeda, double quantidade) throws SQLException {
        Moeda moeda = investidor.getCarteira().getMoeda(nomeMoeda);
        Conexao conexao = new Conexao();
        double valorBruto = quantidade * moeda.getCotacao();
        double tarifa = moeda.calcularTarifa(quantidade);
        double valor = valorBruto - tarifa;
        
        Moeda real = investidor.getCarteira().getMoeda("Real");
        if(moeda.getValor() >= quantidade) {
            moeda.setValor(moeda.getValor() - quantidade);
            real.setValor(real.getValor() + valor);
            
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
              
            dao.atualizarMoeda(investidor, "real", real.getValor());
            dao.atualizarMoeda(investidor, nomeMoeda, moeda.getValor());
                
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(view, "Quantidade insuficiente!");
        }
    }
    
}

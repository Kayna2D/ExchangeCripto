/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.ExtratoDAO;
import model.Investidor;
import view.ExtratoFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControllerExtrato {
    private ExtratoFrame view;
    private Investidor investidor;

    public ControllerExtrato(ExtratoFrame view, Investidor investidor) {
        this.view = view;
        this.investidor = investidor;
    }
    
    public void consultarExtrato() {
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            ExtratoDAO dao = new ExtratoDAO(conn);
            
            List<String> extrato = dao.consultar(investidor.getCpf());
            StringBuilder extratoString = new StringBuilder();
            for (String linha : extrato) {
                extratoString.append(linha).append("\n");
            }
            view.getTxtExtrato().setText(extratoString.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro ao carregar o extrato");
        }
    }
    
}

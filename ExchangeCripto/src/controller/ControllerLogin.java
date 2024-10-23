/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.InvestidorDAO;
import DAO.Conexao;
import model.Investidor;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.MenuFrame;

/**
 *
 * @author Usuario
 */
public class ControllerLogin {
    private LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }
    
    public void login() {
        Investidor investidor = new Investidor(null ,view.getTxtCpf().getText(), 
        view.getTxtSenha().getText());
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.logar(investidor);
            if(res.next()) {
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");
                String senha = res.getString("senha");
                Investidor investidorLogado = new Investidor(nome, cpf, senha);
                MenuFrame mf = new MenuFrame(investidorLogado);
                mf.setVisible(true);
                view.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(view, "Login não efetuado!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } } catch(SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro de conexão!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
    }
}

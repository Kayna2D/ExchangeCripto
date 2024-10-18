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
                JOptionPane.showMessageDialog(view, "Login efetuado!", 
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Login não efetuado!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
            } } catch(SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro de conexão!", 
                        "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Investidor;
import java.sql.PreparedStatement;

/**
 *
 * @author Usuario
 */
public class InvestidorDAO {
    private Connection conn;

    public InvestidorDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet logar(Investidor investidor) throws SQLException {
//        String sql = "select * from investidor where cpf = '"
//                + investidor.getCpf() + "' AND senha = '"
//                + investidor.getSenha() + "'";

        String sql = "select * from investidor where cpf = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.setString(2, investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void atualizarReais(Investidor investidor) throws SQLException{
        String sql = "update investidor set real = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, 
                investidor.getCarteira().getMoedas().get(0).getValor());
        statement.setString(2, investidor.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void atualizarMoeda(Investidor investidor, 
            String nome, double novoValor) throws SQLException{
        String coluna;
        switch (nome.toLowerCase()) {
            case "real":
                coluna = "real";
                break;
            case "bitcoin":
                coluna = "bitcoin";
                break;
            case "ethereum":
                coluna = "ethereum";
                break;
            case "ripple":
                coluna = "ripple";
                break;
            default:
                throw new IllegalArgumentException("Moeda não suportada "
                + nome);
        }
        String sql = "update investidor set " + coluna + " = ? where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, novoValor);
        statement.setString(2, investidor.getCpf());
        statement.executeUpdate();
        statement.close();
    }
    
    
    
}

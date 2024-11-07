/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ExtratoDAO {
    private Connection conn;

    public ExtratoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void registrarTransacao(String cpf, char tipoTransacao, double valor,
            String moeda, double cotacao, double taxa, double saldoReal,
            double saldoBtc, double saldoEth, double saldoXrp) 
            throws SQLException {
        String sql = "insert into extrato (cpf, tipo_transacao, valor, moeda,"
                + " cotacao, taxa, saldo_real, saldo_btc, saldo_eth, saldo_xrp)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, cpf);
        statement.setString(2, String.valueOf(tipoTransacao));
        statement.setDouble(3, valor);
        statement.setString(4, moeda);
        statement.setDouble(5, cotacao);
        statement.setDouble(6, taxa);
        statement.setDouble(7, saldoReal);
        statement.setDouble(8, saldoBtc);
        statement.setDouble(9, saldoEth);
        statement.setDouble(10, saldoXrp);
        statement.execute();
        conn.close();
    }
    
    public List<String> consultar(String cpf) throws SQLException {
        List<String> extrato = new ArrayList<>();
        String sql = "select data_hora, tipo_transacao, valor, moeda, cotacao, "
                + "taxa, saldo_real, saldo_btc, saldo_eth, saldo_xrp " +
                 "from extrato where cpf = ? order by data_hora";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, cpf);
            try (ResultSet resultado = statement.executeQuery()) {
                while (resultado.next()) {
                    String dataHora = resultado.getTimestamp("data_hora").toString();
                    char tipo = resultado.getString("tipo_transacao").charAt(0);
                    double valor = resultado.getDouble("valor");
                    String moeda = resultado.getString("moeda");
                    double cotacao = resultado.getDouble("cotacao");
                    double taxa = resultado.getDouble("taxa");
                    double saldoReal = resultado.getDouble("saldo_real");
                    double saldoBtc = resultado.getDouble("saldo_btc");
                    double saldoEth = resultado.getDouble("saldo_eth");
                    double saldoXrp = resultado.getDouble("saldo_xrp");
                    
                    extrato.add(String.format("%s %c %.2f %s CT: %.2f TX: %.2f"
                            + " REAL: %.2f BTC: %.2f ETH: %.2f XRP: %.2f", 
                            dataHora, tipo, valor, moeda, cotacao, taxa, 
                            saldoReal, saldoBtc, saldoEth, saldoXrp));
                }
            }
        }
        return extrato;
    }
}

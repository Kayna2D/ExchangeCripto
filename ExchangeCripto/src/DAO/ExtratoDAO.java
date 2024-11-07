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
    
    
}

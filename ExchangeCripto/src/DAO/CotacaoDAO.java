/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class CotacaoDAO {
    private Connection conn;

    public CotacaoDAO(Connection conn) {
        this.conn = conn;
    }
    
    public double getCotacao(String moeda) throws SQLException {

        String sql = "select cotacao from cotacoes where nome_moeda = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, moeda);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getDouble("cotacao");
        }
        return 0;
    }
}
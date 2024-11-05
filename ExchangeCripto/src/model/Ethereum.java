/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Ethereum extends Moeda {

    @Override
    public double calcularTarifa(double quant) {
        return quant * getCotacao() * 0.01;
    }
    
    @Override
    public double calcularTarifaVenda(double quant) {
        return quant * getCotacao() * 0.02;
    }
    
}

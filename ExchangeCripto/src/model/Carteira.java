/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Carteira {
    private List<Moeda> moedas;

    public Carteira() {
    }
        

    public Carteira(List<Moeda> moedas) {
        this.moedas = moedas;
    }
    
    

    public List<Moeda> getMoedas() {
        return moedas;
    }

    public void setMoedas(List<Moeda> moedas) {
        this.moedas = moedas;
    }
    
    
}

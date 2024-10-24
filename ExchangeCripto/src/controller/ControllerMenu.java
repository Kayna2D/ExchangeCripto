/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import model.Investidor;
import view.MenuFrame;
import view.SenhaDialog;

/**
 *
 * @author Usuario
 */
public class ControllerMenu {
    private MenuFrame view;
    private Investidor investidor;

    public ControllerMenu(MenuFrame view, Investidor investidor) {
        this.view = view;
        this.investidor = investidor;
//        addActionListeners();
    }
    
//    private void addActionListeners() {
//        view.getMnSaldo().addActionListener(e -> exibirSaldo(JFrame frame));
//    }
    
    public void exibirSaldo(JFrame frame) {
        SenhaDialog sd = new SenhaDialog(view, investidor);
        sd.setVisible(true);
        
        if (sd.isSenhaCorreta()) {
            frame.setVisible(true);
        }
    }
    
    
}

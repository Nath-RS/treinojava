/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ninterface;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class gameTable extends JButton{
   
    
    final int JOGADOR_1 = 1;
    final int JOGADOR_2 = 2;
    
    int jogadorVez = JOGADOR_1;
    
    JLabel lInformacao = new JLabel("Jogador "+JOGADOR_1);
    
    public gameTable()
    {
    configurarJanela();
    configurarTela();
   }
    


}
    


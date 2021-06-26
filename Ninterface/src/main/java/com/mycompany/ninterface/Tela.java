/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ninterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author natha
 */
public class Tela extends JFrame{
   //tela 
   protected int eixoX=600,eixoY=600;
   //botao
   protected int largura=200,altura=40;
   //texto
   protected int txtSize=50,txtComprimento=txtSize*9;
   protected int proporcaotxt= txtComprimento/txtSize;
   
   
   
    public Tela (){
        
        super("Menu");
        
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setResizable(false);
    
    //texto Tela inicial
    JLabel texto1=new JLabel(" JOGO DA VELHA ");
    texto1.setFont(new Font("Times New Roman",Font.LAYOUT_RIGHT_TO_LEFT,txtSize));
    texto1.setBounds(eixoX/2 - (txtComprimento/2) ,eixoY/20 ,txtComprimento,txtSize);
    texto1.setOpaque(true);
    texto1.setBackground(Color.white);
    texto1.setForeground(Color.orange);
    
    //botao Tela inicial
    JButton botao=new JButton("INICIAR");
    botao.setBackground(Color.orange);
    botao.setForeground(Color.white);
    botao.setBounds(eixoX/2 -(largura/2) ,eixoY/2+altura,largura,altura+10);
    botao.setFont(new Font("Times new Roman",Font.CENTER_BASELINE,altura-5));
    
    // Painel
    JPanel painel = new JPanel();
    painel.setPreferredSize(new Dimension(eixoX,eixoY));
    painel.setBackground(Color.blue);
    painel.setLayout(null);
    
    //configurações
    painel.add(texto1);
    painel.add(botao);
    add(painel);
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
    
    // evento do botão
       botao.addActionListener((ActionEvent e) -> {
           botao.setVisible(false);
           texto1.setVisible(false);
           painel.setBackground(Color.WHITE);
           painel.setLayout(new GridLayout(3,3,20,20));
        });
    
    
    
    }
    
    
}

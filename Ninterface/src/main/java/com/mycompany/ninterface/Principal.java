/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ninterface;


/**
 *
 * @author natha
 */
public class Principal extends Tela {
   
   public int largura= getContentPane().getWidth();
   public int comprimento= getContentPane().getHeight();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    new Tela();
    
        
    }
    public void adaptacao(int with,int height){
    with = largura;
    height= comprimento;
    }
    
    
    
}

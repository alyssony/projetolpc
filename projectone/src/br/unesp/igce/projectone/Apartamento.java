/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.projectone;

/**
 *
 * @author aluno
 */
public class Apartamento {
    private String numero;
    private String contas;
  
     Apartamento (String numero){
         this.numero = numero;
         this.contas = " ";
     }
      
      public static void main(String[] args){
          Apartamento x = new Apartamento("31");
          
      }
}

  
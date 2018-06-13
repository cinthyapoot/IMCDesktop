/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class IMC {
    private double peso; 
    private double estatura; 
    public IMC(double peso, double estatura) {
        this.peso = peso; 
        this.estatura = estatura; 
    }
    
    public IMC (JLabel peso, double estatura) {
        throw new UnsupportedOperationException("Not supported yet.");
    } 
    
    public double getValor () {
        return this.peso / (this.estatura * this.estatura); 
    } 
    public String getEstadoNutricional (){ 
        double IMC = getValor();
        if (IMC < 18.5) {
       return "Peso bajo";
        }
         else if (IMC < 25.0) {             
              return "Peso normal";         
          }   
        else if (IMC < 30.0) { 
              return "Sobrepeso";        
          }        
          else if (IMC < 40.0) {            
              return "Obesidad";       
          }         
          else {           
              return "Obesidad extrema";       
          }   
    }
}

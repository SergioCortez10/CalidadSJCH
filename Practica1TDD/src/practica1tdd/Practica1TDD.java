/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1tdd;

/**
 *
 * @author Usuario
 */
public class Practica1TDD {

    public String Numero(int numero){
        if(numero < 10){
            return "Unidad";
        }else if(numero >= 10 && numero < 100){
            return "Decenas";
        }else if(numero >=100 && numero < 1000){
            return "Centenas";
        }else if(numero >=1000 && numero < 10000){
            return "Unidad de mil";
        }
        return "N";
    }
    
}

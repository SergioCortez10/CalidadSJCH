/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Usuario
 */
public class Examen {
    
    int mate = 22;
    int lite = 22;
    int quimica = 15;
    int fisica = 16;
    public boolean Sistemas(int mate,int fisica ,int quimica , int lite){
        if(mate>0 && mate<=30){
            if(fisica>0 && fisica <=30){
                if(quimica>0 && quimica<=20){
                    if(lite>0 && lite<= 20){
                        if((mate+lite+quimica+fisica) >=51){
                        return true;
                    }else{
                        return false;
                        }
                    
                }else{
                    return false;
                    }
            }else{
                return false;
                }
        }else{
            return false;
            }
        }else
            return  false;
    }
    public boolean Contaduria(int mate,int sociales,int lite){
        
        if(mate>0 && mate<=40){
            if(sociales>0 && sociales <=30){
                if(lite >0 && lite <= 30){
                    if((mate+lite+sociales) >=51){
                         return true;
                    }else
                        return  false;
                    }
                }else{
                    return false; 
                }
            }else{
                return false;
            }
        return false;
        }      
}

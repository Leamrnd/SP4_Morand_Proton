/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_morand_proton;

/**
 *
 * @author proto
 */
public class CelluleDeGrille {
    private Jeton jetonCourant;
    
    public CelluleDeGrille (Jeton jetonCourant){
        this.jetonCourant = null;
        
    }
    public boolean presenceJeton(){
        
        
        if(jetonCourant == null){
            return false;
        }
        else{ 
            return true;
        }
    
    
    }
}
    
   

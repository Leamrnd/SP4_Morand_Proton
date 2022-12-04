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
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
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

    public void affecterJeton (Jeton jetonCourant) {
        this.jetonCourant = jetonCourant;
    }
    public String lireCouleurDuJeton(){
        if(presenceJeton()==false){
            return "vide"; 
        }
        else {
            return jetonCourant.lireCouleur(); 
        }
    }

    @Override
    public String toString() {
        if (this.presenceJeton() == true) {
            if (this.lireCouleurDuJeton() == "jaune") {
                return " J ";
            }
            if (this.lireCouleurDuJeton() == "rouge") {
                return " R ";
            }
            if (this.presenceTrouNoir() == true) {
                return " @ ";
            }
            if (this.presenceDesintegrateur() == true) {
                return " D ";
            }
        }
        else {
            return " . ";
        }
        return "";
    }
    
    public void placerTrouNoir() {
        avoirTrouNoir = true;
    }
    
    public void supprimerTrouNoir() {
      avoirTrouNoir = false;
  }

    public boolean presenceTrouNoir() {
        return avoirTrouNoir;
    }
    
    
    public Jeton recupererJeton() {
        Jeton jettemp;
        if (jetonCourant != null) {
            jettemp = jetonCourant;
            jetonCourant = null;
            return jettemp;
        }
        else {
            return null;
        }
    }
  
    public void supprimerJeton() {
      jetonCourant = null;
  }
    
    
    public void placerDesintegrateur() {
        avoirDesintegrateur = true;
    }
    
    
    public void supprimerDesintegrateur() {
        avoirDesintegrateur = false;
    }
    
    public boolean presenceDesintegrateur() {
        return avoirDesintegrateur;
    }
    
    
    public void activerTrouNoir() {
        this.supprimerJeton();
        this.supprimerTrouNoir();
    }
    
    
    
    
    
}
    
   

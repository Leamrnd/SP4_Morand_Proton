package sp4_morand_proton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class Jeton {
    private String couleur;

    public Jeton(String couleur) {
        if (couleur != "jaune" && couleur != "rouge") {
            System.out.println("erreur: les couleurs possibles sont jaune ou rouge");
        }
        
        this.couleur = couleur;
          
    }
    
    
    public String lireCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        if (couleur == "jaune") {
            return "J";
        }
        else {
            return "R";
        }
   
    
}
}
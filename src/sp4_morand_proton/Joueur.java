/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_morand_proton;
import java.util.ArrayList;

/**
 *
 * @author proto
 */
public class Joueur {

    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons = new ArrayList<Jeton>();
    
    public Joueur(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
        reserveJetons = null;
    }

    public String getCouleur() {
        return couleur;
    }
     
    public void affecterCouleur(String coul) {
        couleur = coul;
    }

    
    public int nombreDeJetons() {
        return reserveJetons.size();
    }

    public void ajouterJeton(Jeton jetoncourant) {
        reserveJetons.add(jetoncourant);
    
}
    
    public Jeton jouerJeton(){
        return reserveJetons.remove(0);
    }    
    
    
}

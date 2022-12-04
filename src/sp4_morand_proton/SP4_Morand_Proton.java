/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_morand_proton;



/**
 *
 * @author leamo
 */
public class SP4_Morand_Proton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Jeton jet1 = new Jeton("jaune");
        Jeton jet2 = new Jeton("rouge");
    Joueur Johnny = new Joueur("Johnny","jaune");
        
        System.out.println(jet1);

        
        PlateauDeJeu plato = new PlateauDeJeu();
       
        plato.ajouterJetonDansColonne(jet2, 0);
        plato.ajouterJetonDansColonne(jet1, 0);
        plato.ajouterJetonDansColonne(jet2, 0);
        plato.ajouterJetonDansColonne(jet2, 0);
        plato.ajouterJetonDansColonne(jet2, 2);
        plato.ajouterJetonDansColonne(jet1, 1);
        plato.ajouterJetonDansColonne(jet2, 2);
        plato.ajouterJetonDansColonne(jet2, 3);
        plato.ajouterJetonDansColonne(jet2, 1);
        plato.ajouterJetonDansColonne(jet2, 1);
        
        
        plato.ajouterJetonDansColonne(jet2, 2);
    
        plato.afficherGrilleSurConsole();
        
        System.out.println(plato.grilleRemplie());
        
        System.out.println(plato.ligneGagnantePourCouleur("rouge"));
        
        System.out.println(plato.diagonaleDescendanteGagnantePourCouleur("rouge"));
        System.out.println(plato.colonneGagnantePourCouleur("rouge")); 
        
        System.out.println(plato.etreGagnantePourCouleur("rouge"));
        
        Johnny.ajouterJeton(jet1);
        
        
        
        System.out.println(Johnny.jouerJeton());
        
        plato.viderGrille(Johnny, Johnny);
        
        plato.afficherGrilleSurConsole();
        
        /*
        Joueur Joueur1 = new Joueur("Léa", "rouge");
        Joueur Joueur2 = new Joueur("Papa", "jaune");
        Partie p1 = new Partie(Joueur1, Joueur2);
        p1.initialiserPartie();
        p1.lancerPartie();
        
        */
        
        
    }
    
    
}

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
    
        
        System.out.println(jet1);

        
        PlateauDeJeu plato = new PlateauDeJeu();
       
        plato.ajouterJetonDansColonne(jet2, 2);
        plato.ajouterJetonDansColonne(jet2, 3);
        plato.ajouterJetonDansColonne(jet2, 3);
        plato.ajouterJetonDansColonne(jet2, 4);
        plato.ajouterJetonDansColonne(jet2, 4);
        plato.ajouterJetonDansColonne(jet2, 3);
        plato.ajouterJetonDansColonne(jet2, 5);
        plato.ajouterJetonDansColonne(jet2, 4);
        plato.ajouterJetonDansColonne(jet2, 2);
        plato.ajouterJetonDansColonne(jet2, 2);
        
        
        plato.ajouterJetonDansColonne(jet2, 2);
    
        plato.afficherGrilleSurConsole();
        
        System.out.println(plato.grilleRemplie());
        
        //System.out.println(plato.ligneGagnantePourCouleur("jaune"));
        
        System.out.println(plato.diagonaleDescendanteGagnantePourCouleur("rouge"));
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_morand_proton;
import javax.swing.JButton;
/**
 *
 * @author proto
 */
public class CelluleGraphique extends jButton {
    Cellule CelluleAssociee;
    //probleme avec le dossier image
    
    
    
    public CelluleGraphique (Cellule uneCellule){
        CelluleAssociee= uneCellule;
    }
    
    @Override
    public void paintComponent(Graphics G){
        super.paintcomponent(G);
        if (CelluleAssociee.presenceTrouNoir()=true){
            setIcon();
        }
        else if (CelluleAssociee.presenceTrouNoir(=true)){
       
            setIcon();   
        
        }
        else {
            String couleur=CelluleAssociee.lireCouleur();
            switch (couleur){
                case "vide":
                    break;
                case"Rouge":
                    setIcon();
                    break;
                case"Jaune":
                    setIcon();
                    break;
                    
            }
        }
        setIcon();
        
    }*/
}

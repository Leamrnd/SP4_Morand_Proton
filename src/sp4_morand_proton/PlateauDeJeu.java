package sp4_morand_proton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leamo
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];

    public PlateauDeJeu() {
        for (int i = 0; i < 6; i++) {
           for (int j= 0; j < 7; j++) {
               grille[i][j] = new CelluleDeGrille(null);
           }
        } 
    }
    
     
    public int ajouterJetonDansColonne(Jeton jet, int indcol) {
    int indlign = 0;
    for (int i = 0; i < 6; i ++) {
        if (grille[5-i][indcol].presenceJeton() == false){
            grille[5-i][indcol].affecterJeton(jet);
            int indligne = 6-i;
            return indligne;
        }
    }
    return indlign;  
}
  
    
   public boolean grilleRemplie() {
       boolean rempli = true;
       for (int i = 0; i < 6; i++) {
           for (int j = 0; j < 7; j++) {
               if (grille[i][j].presenceJeton() == false)
                   rempli = false;
           }
       }
       return rempli;
   }
    
    public boolean colonneRemplie(int indcol) {
        boolean rempli = true;
        for (int i = 0; i < 6;i++) {
        if (grille[i][indcol].presenceJeton() == false) {
            rempli = false;
         }
       }
        return rempli;
    }
   
   
   
   
   
   
   
   /*public viderGrille(Joueur j1 ;Joueur j2) {
   
   
   }
   
   
   */ 
   
   
   
    public void afficherGrilleSurConsole() {
        for (int i = 0; i < 6; i++) {
            System.out.print("\n");
            for (int j = 0; j < 7; j++) {
                System.out.print(grille[i][j]);
            }
        }
    }
       
       
       
   
   
  public boolean presenceJeton(int ligne, int colonne) {
      return grille[ligne][colonne].presenceJeton(); 
      
  } 
   
   
  public String lireCouleurDuJeton(int ligne, int colonne) {
     return grille[ligne][colonne].lireCouleurDuJeton();
  }
   
  
  
  
  
  
  
  
  
  
}

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
   
  
  
  
  public boolean ligneGagnantePourCouleur(String couleur) {
    boolean gagne = false;
    for (int i = 1; i < 4; i++) {
        for (int j = 1; j < 6; j++) {
            if (grille[j][i].lireCouleurDuJeton() == couleur) {
                if (grille[j][i].lireCouleurDuJeton() == grille[j][i+1].lireCouleurDuJeton() &&  grille[j][i].lireCouleurDuJeton() == grille[j][i+2].lireCouleurDuJeton() && grille[j][i].lireCouleurDuJeton() == grille[j][i+3].lireCouleurDuJeton()) {
                  gagne =true;
                }
            }
              
        }
    }
      return gagne;
  }
  
  
  
  
  public boolean colonneGagnantePourCouleur(String couleur) {
    boolean gagne= false;
    for (int j = 3; j < 6; j++) {
        for (int i = 0; i < 7; i++) {
            if (grille[j][i].lireCouleurDuJeton() == couleur) {
                if (grille[j][i].lireCouleurDuJeton() == grille[j-1][i].lireCouleurDuJeton() &&  grille[j][i].lireCouleurDuJeton() == grille[j-2][i].lireCouleurDuJeton() && grille[j][i].lireCouleurDuJeton() == grille[j-3][i].lireCouleurDuJeton()) {
                  gagne =true;
                }
            }
              
        }
    }
      return gagne;
  }
      
      
 
  
  public boolean diagonaleMontanteGagnantePourCouleur(String couleur) {
   boolean gagne = false;
    for (int j = 3; j < 6; j++) {
        for (int i = 0; i < 3; i++) {
            if (grille[j][i].lireCouleurDuJeton() == couleur) {
                if (grille[j][i].lireCouleurDuJeton() == grille[j-1][i+1].lireCouleurDuJeton() &&  grille[j][i].lireCouleurDuJeton() == grille[j-2][i+2].lireCouleurDuJeton() && grille[j][i].lireCouleurDuJeton() == grille[j-3][i+3].lireCouleurDuJeton()) {
                  gagne = true;
                }
            }
              
        }
    }
      return gagne;   
  }
  
  
    
  
  public boolean diagonaleDescendanteGagnantePourCouleur(String couleur) {
   boolean gagne = false;
    for (int j = 0; j < 3; j++) {
        for (int i = 0; i < 4; i++) {
            if (grille[j][i].lireCouleurDuJeton() == couleur) {
                if (grille[j][i].lireCouleurDuJeton() == grille[j+1][i+1].lireCouleurDuJeton() &&  grille[j][i].lireCouleurDuJeton() == grille[j+2][i+2].lireCouleurDuJeton() && grille[j][i].lireCouleurDuJeton() == grille[j+3][i+3].lireCouleurDuJeton()) {
                  gagne = true;
                }
            }
              
        }
    }
      return gagne;   
  }
  
  
  
  
  
  
  
  
  
  
  public boolean etreGagnantePourCouleur(String a) {
      boolean victoire=false;
        if (ligneGagnantePourCouleur(a)==true){
            victoire=true; 
        }
        if (colonneGagnantePourCouleur(a)==true){
            victoire=true;
        }
        if (diagonaleMontanteGagnantePourCouleur(a)==true){
            victoire=true;
        }  
        if (diagonaleDescendanteGagnantePourCouleur(a)==true){
            victoire=true;
        }
      return victoire;
  }
     
  
}
  
 
  


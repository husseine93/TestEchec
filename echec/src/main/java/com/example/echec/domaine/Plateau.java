package com.example.echec.domaine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Plateau {
	
	private Plateau plateau;
	
	@BeforeEach
    public void setUp() {
        plateau = new Plateau();
        plateau.initialiserPlateau();
    }
	
	
	
	@Test
	public void VerifPionPlateau() {
	    for (int j = 0; j < 8; j++) { 
	        Case currentCase = plateau.getCases()[1][j]; // si on essaie avec [4][j] => faux
	        assertTrue(currentCase.getPiece() instanceof Pion);
	    }
	}
	
	@Test
	public void testDeplacementVersAvantAvecObstacle() {
		Plateau plateau = new Plateau();
	    plateau.initialiserPlateau();
	    Pion pion = new Pion(new Position(1, 0), Couleur.BLANC, 0);
	    plateau.getCases()[4][0].setPiece(pion); //le pion que je veux tester

	    // Définir la nouvelle position
	    Position nouvellePosition = new Position(2, 0); // Avance tout droit de 1 (x + 1) 
	    
	    Position PositionObstacle = new Position(2, 0); // Avance tout droit de 1 (x + 1) 


	    // Préparer les variables pour le test
	    boolean deplacementValide = true;
	    Position positionInitiale = pion.getPosition();
	    

	    if (nouvellePosition==PositionObstacle) {
	        deplacementValide = false;
	    }

	    assertTrue(deplacementValide, "Le déplacement du pion est invalide.");
	}
	
	@Test
	public void VerifPionBlancBonneEndroit() {
	    for (int j = 0; j < 8; j++) { 
	        Case currentCase = plateau.getCases()[1][j];
	        Piece piece = currentCase.getPiece();
	        if (piece != null) {
	            cases[0][0].setPiece(new Tour(new Position(0, 0), Couleur.BLANC, 18));
	        }

	    }
	}

	
	@Test
	public void VerifPionNoirBonneEndroit() {
	    for (int j = 0; j < 8; j++) { 
	        Case currentCase = plateau.getCases()[1][j]; // si on essaie avec [4][j] => faux
	        assertTrue(currentCase.getPiece() instanceof Pion);
	    }
	}
	
	@Test
    public void positionDansPlateau() {
		
		Plateau plateau = new Plateau();
	    plateau.initialiserPlateau();
	    Pion pion = new Pion(new Position(1, 0), Couleur.BLANC, 0);
	    plateau.getCases()[1][0].setPiece(pion); //le pion que je veux tester

	    Position nouvellePosition = new Position(7, 0); // Avance tout droit de 1 (x + 1) 
	    boolean deplacementValide = true;

	    if (nouvellePosition.getX() < 0 || nouvellePosition.getX() >= 8 ||
	        nouvellePosition.getY() < 0 || nouvellePosition.getY() >= 8) {
	        deplacementValide = false;
	    }
	    
	    assertTrue(deplacementValide, "Le déplacement du pion est invalide.");
	    
        
    }
	@Test
	public void deplacementPossiblePion() {
	    
	    Plateau plateau = new Plateau();
	    plateau.initialiserPlateau();
	    Pion pion = new Pion(new Position(1, 0), Couleur.BLANC, 0);
	    plateau.getCases()[4][0].setPiece(pion); //le pion que je veux tester

	    // Définir la nouvelle position
	    Position nouvellePosition = new Position(2, 0); // Avance tout droit de 1 (x + 1) 

	    // Préparer les variables pour le test
	    boolean deplacementValide = true;
	    Position positionInitiale = pion.getPosition();
	    

	    if (Math.abs(nouvellePosition.getX() - positionInitiale.getX()) != 1 ||
	        nouvellePosition.getY() != positionInitiale.getY()) {
	        deplacementValide = false;
	    }

	    assertTrue(deplacementValide, "Le déplacement du pion est invalide.");
	}

	
	
    private Case[][] cases = new Case[8][8];

    public Plateau() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cases[i][j] = new Case(new Position(i, j));
            }
        }
    }
    public Case[][] getCases() {
        return this.cases;
    }

    public void initialiserPlateau() {
        //Pions blancs
        for (int i = 0; i < 8; i++) {
            cases[1][i].setPiece(new Pion(new Position(1, i), Couleur.BLANC, i));
        }
        cases[0][0].setPiece(new Tour(new Position(0, 0), Couleur.BLANC, 18));
        cases[0][7].setPiece(new Tour(new Position(0, 7), Couleur.BLANC, 19));
        cases[0][1].setPiece(new Cavalier(new Position(0, 1), Couleur.BLANC, 20));
        cases[0][6].setPiece(new Cavalier(new Position(0, 6), Couleur.BLANC, 21));
        cases[0][2].setPiece(new Fou(new Position(0, 2), Couleur.BLANC, 20));
        cases[0][5].setPiece(new Fou(new Position(0, 5), Couleur.BLANC, 21));
        cases[0][3].setPiece(new Roi(new Position(0, 3), Couleur.BLANC, 21));
        cases[0][4].setPiece(new Reine(new Position(0, 4), Couleur.BLANC, 21));
               
        //Pièce noirs
        for (int i = 0; i < 8; i++) {
            cases[6][i].setPiece(new Pion(new Position(6, i), Couleur.NOIR, i));
        }
        cases[7][0].setPiece(new Tour(new Position(7, 0), Couleur.NOIR, 16));
        cases[7][7].setPiece(new Tour(new Position(7, 7), Couleur.NOIR, 17));
        cases[7][1].setPiece(new Cavalier(new Position(7, 1), Couleur.NOIR, 18));
        cases[7][6].setPiece(new Cavalier(new Position(7, 6), Couleur.NOIR, 19));
        cases[7][2].setPiece(new Fou(new Position(7, 2), Couleur.NOIR, 20));
        cases[7][5].setPiece(new Fou(new Position(7, 5), Couleur.NOIR, 21));
        cases[7][3].setPiece(new Roi(new Position(7, 3), Couleur.NOIR, 21));
        cases[7][4].setPiece(new Reine(new Position(7, 4), Couleur.NOIR, 21));
        
        
        
    }

    public void afficherPlateau() {
        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 8; j++) { 
                Case currentCase = cases[i][j];
                if (currentCase.getPiece() != null) { 
                    
                    if (currentCase.getPiece() instanceof Pion) {
                        System.out.print("P ");
                    }
                    else if (currentCase.getPiece() instanceof Tour) {
                        System.out.print("T ");
                    }
                    else if (currentCase.getPiece() instanceof Cavalier) {
                        System.out.print("C ");
                    }
                    else if (currentCase.getPiece() instanceof Fou) {
                        System.out.print("F ");
                    }
                    else if (currentCase.getPiece() instanceof Roi) {
                        System.out.print("R ");
                    }
                    else if (currentCase.getPiece() instanceof Reine) {
                        System.out.print("r ");
                    }
                    else {
                        System.out.print("* "); 
                    }
                } else {
                    System.out.print(". "); 
                }
            }
            System.out.println(); 
        }
    }
    
    

}


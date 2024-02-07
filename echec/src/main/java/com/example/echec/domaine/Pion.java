package com.example.echec.domaine;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;



public class Pion extends Piece {
	
    public Pion(Position position, Couleur couleur, int numero) {
        super(position, couleur,numero);
    }
    
    public Position getPosition() {
        return this.position;
    }
    
    

    @Override
    public void deplacer(Position nouvellePosition) {
    	int direction = (this.couleur == Couleur.BLANC) ? 1 : -1;
    	int nouvelleY = this.position.getY() + direction;
    	this.position.setY(nouvelleY);
    }



	@Override
	public List<Position> mouvementsPossibles() {
		return null;
	}

    
}


package com.example.echec.domaine;

import org.springframework.stereotype.Component;



public class Case {
    private Position position;
    private Piece piece;

    public Case(Position position) {
        this.position = position;
        this.piece = null; // Initialement, pas de pièce sur la case
    }

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

}


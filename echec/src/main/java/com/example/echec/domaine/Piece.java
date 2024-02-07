package com.example.echec.domaine;

import java.util.List;

import org.springframework.stereotype.Component;


public abstract class Piece {
    protected Position position;
    protected Couleur couleur;
    protected static int numero; 

    public Piece(Position position, Couleur couleur, int numero) {
        this.position = position;
        this.couleur = couleur;
        this.numero = numero;
        
    }

    public abstract void deplacer(Position nouvellePosition);
    public abstract List<Position> mouvementsPossibles();

}


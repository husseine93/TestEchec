package com.example.echec.domaine;

import java.util.ArrayList;
import java.util.List;



public class Tour extends Piece {
    public Tour(Position position, Couleur couleur, int numero) {
        super(position, couleur,numero);
    }

    @Override
    public void deplacer(Position nouvellePosition) {
    }

    @Override
    public List<Position> mouvementsPossibles() {
        List<Position> positions = new ArrayList<>();
        return positions;
    }
}


package com.example.echec.domaine;

import java.util.ArrayList;
import java.util.List;



public class Fou extends Piece {
    public Fou(Position position, Couleur couleur, int numero) {
        super(position, couleur,numero);
    }

    @Override
    public void deplacer(Position nouvellePosition) {
        // Logique spécifique du déplacement d'un pion
    }

    @Override
    public List<Position> mouvementsPossibles() {
        List<Position> positions = new ArrayList<>();
        // Ajoutez la logique pour déterminer les mouvements possibles d'un pion
        return positions;
    }
}


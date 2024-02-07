package com.example.echec.domaine;

import org.springframework.stereotype.Component;

@Component

public class JeuEchecs {
    private Plateau plateau;
    private Joueur joueurActuel;

    public JeuEchecs() {
        this.plateau = new Plateau();
    }

    public void demarrerJeu() {
        plateau.initialiserPlateau();
        plateau.afficherPlateau();
    }

}


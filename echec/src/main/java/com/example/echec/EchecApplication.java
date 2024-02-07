package com.example.echec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.echec.domaine.Pion;
import com.example.echec.domaine.Plateau;

@SpringBootApplication
public class EchecApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EchecApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Plateau plateau = new Plateau();
        
        plateau.initialiserPlateau();
        plateau.afficherPlateau();
       
    }
}


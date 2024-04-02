package Clinique;

import java.util.ArrayList;
import java.util.List;

public class Recherche {
    private List<GestionPatient> patients;  // Creation des listes de patients et de medecins
    private List<GestionMedecin> medecins;

    public Recherche(List<GestionPatient> patients, List<GestionMedecin> medecins) {
        this.patients = patients;
        this.medecins = medecins;
    }   // Constructeurs de la classe Recherche

    public GestionPatient rechercherPatientParNom(String nom) {
        for (GestionPatient patient : patients) { // ":" est un opérateur de parcours de liste la boucle que nous utilisons et une boucle for each qui parcourt la liste des patients elle est aussi appeler boucle for amelioreé
            if (patient.getNomPatient().equals(nom)) { // https://www.data-transitionnumerique.com/foreach-java/
                return patient;
            }
        }
        return null;
    } // Methode pour rechercher un patient par son nom

    public GestionMedecin rechercherMedecinParNom(String nom) {
        for (GestionMedecin medecin : medecins) {
            if (medecin.getNom().equals(nom)) { // .equals() est une methode qui compare deux objets String
                return medecin;                 // https://www.w3schools.com/java/ref_string_equals.asp
            }
        }
        return null;
    }

    public List<GestionMedecin> rechercherMedecinParSpecialite(String specialite) {
        List<GestionMedecin> resultats = new ArrayList<>(); // arraylist est une classe qui implémente l'interface List il utilise un tableau qui est dynamique pour stocker les éléments le but ici est de creer une liste de medecin qui ont la meme specialite
        for (GestionMedecin medecin : medecins) {
            if (medecin.getSpecialisation().equals(specialite)) {
                resultats.add(medecin); // add() est une methode qui ajoute un element a la liste
            }
        }
        return resultats;
    }
}
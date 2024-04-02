package Clinique;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private int choix;
    private int nbPatient = 0;
    private int RPPS = 0;
    public void afficherMenu() {
        System.out.println("1. Ajouter un patient");
        System.out.println("2. Ajouter un médecin");
        System.out.println("3. Ajouter un rendez-vous");
        System.out.println("4. Ajouter un médicament");
        System.out.println("5. Lire les feedbacks");
        System.out.println("6. Quitter");
        System.out.println();
    }

    public void menu()  {
        do {
            afficherMenu();
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Ajouter un patient");
                    action();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ajouter un médecin");
                    action();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ajouter un rendez-vous");
                    action();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Ajouter un médicament");
                    action();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Lire les feedbacks");
                    action();
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Quitter");
                    action();
                    System.out.println();
                    break;
                default:
                    System.out.println("Choix invalide");
                    System.out.println();
            }
        } while (choix != 6);
    }

    public void ajouterPatient() {
        System.out.println();
        System.out.println();
        System.out.println();
        String nom = null;
        String prenom = null;
        sc.nextLine();
        System.out.println("Entrez le nom du patient");
        nom = sc.nextLine();
        System.out.println("Entrez le prénom du patient");
        prenom = sc.nextLine();
        System.out.println("Entrez l'âge du patient");
        int age = sc.nextInt();
        GestionPatient[] gestionPatients = {new GestionPatient(nbPatient, nom, prenom, age),};
        nbPatient++;
    }
    public void action()  {

        if(choix == 1){
            ajouterPatient();
        } else if (choix == 2) {
            sc.nextLine();

            System.out.println("Entrez le nom du Medecin");
            String nom = sc.nextLine();
            System.out.println("Entrez le prénom du Medecin");
            String prenom = sc.nextLine();
            System.out.println("Entrez la specialisation du Medecin");
            String specialisation = sc.nextLine();
            System.out.println("Entrez le prix de la consultation");
            int prixConsult = sc.nextInt();
            GestionMedecin[] gestionMedecin = {new GestionMedecin(RPPS,nom, prenom, specialisation,prixConsult),};
            RPPS++;
        } else if (choix == 3) {
            sc.nextLine();

            System.out.println("Entrez l'id du medecin");
            int idMed = sc.nextInt();
            System.out.println("Entreze l'id du patient");
            int idPat = sc.nextInt();
            System.out.println("Rendez-vous pris ? true/false");
            Boolean rdvPris = sc.nextBoolean();
            GestionRdv[] gestionRdvs = {new GestionRdv(idMed,idPat,rdvPris),};
            RPPS++;
        } else if (choix == 4) {
            sc.nextLine();

            System.out.println("Entrez l'id du médicament");
            int idMed = sc.nextInt();
            sc.nextLine();
            System.out.println("Entrez le nom du médicament");
            String nomMed = sc.nextLine();
            System.out.println("Entrez la quantité du médicament");
            int quantite = sc.nextInt();
            System.out.println("Entrez le prix du médicament");
            int prix = sc.nextInt();
            Medicament[] medicaments = {new Medicament(idMed,nomMed,quantite,prix),};
        } else if (choix == 5) {

        } else if (choix == 6) {

        }
    }
}

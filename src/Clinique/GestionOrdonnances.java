package Clinique;

import java.util.Arrays;

//Gestion des ordonnances : permettre aux m´edecins de cr´eer des ordonnances pour les patients, retenir
//les informations sur les m´edicaments prescrits, la posologie et la dur´ee du traitement.
public class GestionOrdonnances extends GestionRdv{

    private int idOrdonnance;
    private int nbListe = 1;
    private Prise prise;
    private Medicament medicament;
    private String[] listMedicament = new String[nbListe];
    private String posologie;
    private int dureeTraitement;

    public GestionOrdonnances(int idOrdonnance,int idMedecin, int idPatient, String posologie, int dureeTraitement,Prise prise,boolean rdvPris ) {
        super(idMedecin, idPatient, rdvPris);
        this.posologie = posologie;
        this.dureeTraitement = dureeTraitement;
        this.prise = prise;
    }

    public String getPosologie() {
        return posologie;
    }

    public int getDureeTraitement() {
        return dureeTraitement;
    }

    public String[] getListMedicament() {
        for (int i = 0; i < listMedicament.length; i++) {
            System.out.print(listMedicament[i]+",");
        }
        return listMedicament;
    }

    public String[] getMedicament(int medicament) {
        System.out.print(listMedicament[medicament]);
        return listMedicament;
    }

    public void addMedicament(Medicament medicament) {
        listMedicament[nbListe - 1] = medicament.getNomMed();
        nbListe++;
        listMedicament = Arrays.copyOf(listMedicament, nbListe); // On augmente la taille du tableau source:https://codegym.cc/fr/groups/posts/fr.574.methode-arrays-copyof-en-java
    }

    @Override
    public String toString() {
        return "GestionOrdonnances{" +
                "idMedecin=" + getIdMedecin() +
                ", idPatient=" + getIdPatient() +
                ", Rdv pris=" + getRdvPris() +
                ", listMedicament=" + Arrays.toString(listMedicament) +
                ", posologie='" + posologie + '\'' +
                ", dureeTraitement=" + dureeTraitement +
                ", Prise=" + prise +
                '}';
    }
}
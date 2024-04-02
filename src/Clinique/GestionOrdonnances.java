package Clinique;

//Gestion des ordonnances : permettre aux m´edecins de cr´eer des ordonnances pour les patients, retenir
//les informations sur les m´edicaments prescrits, la posologie et la dur´ee du traitement.
public class GestionOrdonnances {
    private int idMedecin;
    private int idPatient;
    private int nbListe = 1;
    private Medicament medicament;
    private String [] listMedicament = new String[nbListe];
    private String posologie;
    private int dureeTraitement;

    public GestionOrdonnances(int idMedecin, int idPatient, String posologie, int dureeTraitement) {
        this.idMedecin = idMedecin;
        this.idPatient = idPatient;
        this.posologie = posologie;
        this.dureeTraitement = dureeTraitement;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public Medicament getMedicament() {
        return medicament;
    }

    public String getPosologie() {
        return posologie;
    }

    public int getDureeTraitement() {
        return dureeTraitement;
    }

    public void addMedicament(Medicament medicament) {
        for (int i = 0; i < listMedicament.length; i++) {
            if (listMedicament[i] == null) {
                listMedicament[i] = String.valueOf(medicament);
                nbListe++;
            }
        }
    }

    @Override
    public String toString() {
        return "GestionOrdonnances{" +
                "idMedecin=" + idMedecin +
                ", idPatient=" + idPatient +
                ", medicament='" + medicament + '\'' +
                ", posologie='" + posologie + '\'' +
                ", dureeTraitement = " + dureeTraitement + " Jours" +
                '}';
    }
}
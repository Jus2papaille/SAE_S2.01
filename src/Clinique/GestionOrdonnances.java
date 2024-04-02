package Clinique;
//Gestion des ordonnances : permettre aux m´edecins de cr´eer des ordonnances pour les patients, retenir
//les informations sur les m´edicaments prescrits, la posologie et la dur´ee du traitement.
public class GestionOrdonnances {
    private GestionPatient patient ;
    private GestionMedecin medecin ;
    private String date ;
    private Medicament [] listeMed ;



    private GestionOrdonnances(GestionPatient patient, GestionMedecin medecin, String date,Medicament [] listeMed) {
        super();
        this.patient = patient;
        this.medecin = medecin;
        this.date = date;
        this.listeMed = listeMed;
    }


    public GestionPatient getPatient() {
        return patient;
    }


    public GestionMedecin getMedecin() {
        return medecin;
    }


    public String getDate() {
        return date;
    }


    public Medicament[] getListeMed() {
        return listeMed;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public void setListeMed(Medicament[] listeMed) {
        this.listeMed = listeMed;
    }

    public class Medicament {
        private String nomMed;
        private int posologie; // nombre de medicaments par prise
        private enum Prise {MATIN , MIDI, SOIR }
        /**
         * @param nomMed
         * @param posologie
         */
        private Medicament(String nomMed, int posologie, Prise prise) {
            super();
            this.nomMed = nomMed;
            this.posologie = posologie;
            this.Prise = prise;
        }
        public String getNomMed() {
            return nomMed;
        }
        public int getPosologie() {
            return posologie;
        };



    }

}
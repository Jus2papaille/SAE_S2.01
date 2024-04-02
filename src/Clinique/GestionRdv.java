package Clinique;
public class GestionRdv {

    private int idMedecin;
    private int idPatient;
    private boolean rdvPris;

    public GestionRdv(int idMedecin, int idPatient, boolean rdvPris) {
        this.idMedecin = idMedecin;
        this.idPatient = idPatient;
        this.rdvPris = rdvPris;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public boolean getRdvPris() {
        return rdvPris;
    }

    public void setRdvPris(boolean rdvPris) {
        this.rdvPris = rdvPris;
    }

    @Override
    public String toString() {
        return "GestionRdv{" +
                "idMedecin=" + idMedecin +
                ", idPatient=" + idPatient +
                ", rdvPris=" + rdvPris +
                '}';
    }
}

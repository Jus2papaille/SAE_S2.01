package Clinique;

import java.util.List;

public class HistoriquePatient {
    private GestionPatient patient;
    private List<GestionOrdonnances> ordonnances;
    private List<GestionRdv> rendezVous;

    public HistoriquePatient(GestionPatient patient, List<GestionOrdonnances> ordonnances, List<GestionRdv> rendezVous) {
        this.patient = patient;
        this.ordonnances = ordonnances;
        this.rendezVous = rendezVous;
    }

    public GestionPatient getPatient() {
        return patient;
    }

    public List<GestionOrdonnances> getOrdonnances() {
        return ordonnances;
    }

    public List<GestionRdv> getRendezVous() {
        return rendezVous;
    }

    public void addOrdonnances(){

    }

    public void setRendezVous(List<GestionRdv> rendezVous) {
        this.rendezVous = rendezVous;
    }

    @Override
    public String toString() {
        return "HistoriquePatient{" +
                "patient=" + patient +
                ", ordonnances=" + ordonnances +
                ", rendezVous=" + rendezVous +
                '}';
    }
}
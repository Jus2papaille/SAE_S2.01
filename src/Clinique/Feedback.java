package Clinique;

public class Feedback extends GestionRdv{
    private int idPatient;
    private int idMedecin;
    private String commentaire;
    private int note;

    public Feedback(int idPatient, int idMedecin, String commentaire, int note) {
        this.idPatient = idPatient;
        this.idMedecin = idMedecin;
        this.commentaire = commentaire;
        this.note = note;
    }

    // Getters and setters
    public int getIdPatient() {
        return idPatient;
    }

    public int getIdMedecin() {
        return idMedecin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "idPatient=" + idPatient +
                ", idMedecin=" + idMedecin +
                ", commentaire='" + commentaire + '\'' +
                ", note=" + note +
                '}';
    }
}
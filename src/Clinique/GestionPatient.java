package Clinique;

import java.util.ArrayList;
import java.util.List;

public class GestionPatient {
	private int idPatient;
	private String nomPatient;
	private String prenomPatient;
	private int agePatient;
	private List<Feedback> feedbacks;


	public GestionPatient (int idPatient,String nomPatient,String prenomPatient, int agePatient){
		this.idPatient=idPatient;
		this.nomPatient=nomPatient;
		this.prenomPatient=prenomPatient;
		this.agePatient=agePatient;
		this.feedbacks = new ArrayList<>();
	}

	public GestionPatient() {

	}

	public int getIdPatient() {
		return idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public int getAgePatient() {
		return agePatient;
	}

	public void laisserFeedback(int idMedecin, String commentaire, int note) {
		Feedback feedback = new Feedback(this.idPatient, idMedecin, commentaire, note);
		this.feedbacks.add(feedback);
	}
	public void lireFeedback() {
		for (Feedback feedback : feedbacks) {
			System.out.println(feedback);
		}
	}
	@Override
	public String toString() {
		return "Patients [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", agePatient=" + agePatient + "]";
	}


}

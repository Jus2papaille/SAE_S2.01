package Clinique;

public class GestionPatient {
	private int idPatient;
	private String nomPatient;
	private String prenomPatient;
	private int agePatient;
	
	public GestionPatient (int idPatient,String nomPatient,String prenomPatient, int agePatient){
		this.idPatient=idPatient;
		this.nomPatient=nomPatient;
		this.prenomPatient=prenomPatient;
		this.agePatient=agePatient;
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

	@Override
	public String toString() {
		return "Patients [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", agePatient=" + agePatient + "]";
	}
}

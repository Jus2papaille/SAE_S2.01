package Clinique;

public class GestionPatient {
	private int idClient;
	private String nomClient;
	private String prenomClient;
	private int ageClient;
	
	public GestionPatient (int idClient,String nomClient,String prenomClient, int ageClient){
		this.idClient=idClient;
		this.nomClient=nomClient;
		this.prenomClient=prenomClient;
		this.ageClient=ageClient;
	}

	public int getIdClient() {
		return idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public int getAgeClient() {
		return ageClient;
	}

	@Override
	public String toString() {
		return "Patients [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", ageClient=" + ageClient + "]";
	}
}

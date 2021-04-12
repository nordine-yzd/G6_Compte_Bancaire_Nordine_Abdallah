package projet.compte.bancaire.model;

public class Agence {

	private static int cptAgence = 0;
	private int codeAgence;
	private String nomAgence;
	private String adresse;
	
	
	
	public Agence() {
		super();
		this.codeAgence = ++cptAgence;
		
	}
	
	public Agence(String nomAgence, String adresse) {
		this();
		this.nomAgence = nomAgence;
		this.adresse = adresse;
	}
	
	public int getCodeAgence() {
		return codeAgence;
	}
	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


}
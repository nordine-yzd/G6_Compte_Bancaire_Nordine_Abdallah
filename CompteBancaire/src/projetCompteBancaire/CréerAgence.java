package projetCompteBancaire;

public class Cr�erAgence {
	private int codeAgence;
	private String nomAgence;
	private String adresse;
	
	
	public Cr�erAgence() {
		
	}
	
	public Cr�erAgence (int codeAgence, String nomAgence, String adresse) {
		this.setCodeAgence(codeAgence);
		this.setNomAgence(nomAgence);
		this.setAdresse(adresse);
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

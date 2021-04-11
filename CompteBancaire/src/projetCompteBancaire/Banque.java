package projetCompteBancaire;


public class Banque {
	
	Agence nomAgence;
	Client nomClient;
	Client prenomClient;
	Client dateDeNaissance;
	
	
	public Banque(Agence nomAgence, Client nomClient, Client prenomClient, Client dateDeNaissance) {
		super();
		this.nomAgence = nomAgence;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateDeNaissance = dateDeNaissance;
	}


	public Agence getNomAgence() {
		return nomAgence;
	}


	public void setNomAgence(Agence nomAgence) {
		this.nomAgence = nomAgence;
	}


	public Client getNomClient() {
		return nomClient;
	}


	public void setNomClient(Client nomClient) {
		this.nomClient = nomClient;
	}


	public Client getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(Client prenomClient) {
		this.prenomClient = prenomClient;
	}


	public Client getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Client dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	
	
	
	
	













}

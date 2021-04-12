package projet.compte.bancaire.model;

//import java.util.Scanner;

public class CompteBancaire {
	
	
	
	
	public final static  int TYPE_COMPTE_COURANT = 1;
	public final static  int TYPE_COMPTE_LIVRET_A = 2;
	public final static  int TYPE_COMPTE_PLAN_EPARGNE = 3;
	

	private static long cptCompteBancaire;
	private long numeroCompte;
	private float solde;
	private boolean decouvert;
	private int type;
	private Client client;
	private Agence agence;

	public CompteBancaire() {
		this.numeroCompte = (++cptCompteBancaire);
	}

	public CompteBancaire(float solde, boolean decouvert, int type, Client client, Agence agence) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
		this.type = type;
		this.client = client;
		this.agence = agence;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public boolean isDecouvert() {
		return decouvert;
	}

	public void setDecouvert(boolean decouvert) {
		this.decouvert = decouvert;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
package projetCompteBancaire;

import java.util.Scanner;

public class CompteBancaire extends Client {
	private int numeroCompte ;
	private int codeAgence ;
	private float solde ;
	private boolean decouvert ;

	public CompteBancaire () {}

	public CompteBancaire(int numeroCompte, int codeAgence, float solde, boolean decouvert) {
		super();
		this.numeroCompte = numeroCompte;
		this.codeAgence = codeAgence;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public int getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
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
	
	
	
	
	
}
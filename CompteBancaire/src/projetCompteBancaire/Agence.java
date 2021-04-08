package projetCompteBancaire;

import java.util.Scanner;


public class Agence {
	
	private int id;
	private int codeAgence;
	private String nomAgence;
	private String adresse;
	
	public Agence() {
		
	}
	
	
	public Agence (int id,int codeAgence, String nomAgence, String adresse) {
		this.id = id;
		this.codeAgence = codeAgence;
		this.nomAgence = nomAgence;
		this.adresse = adresse;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
	
	public static void toString(Agence listeAgences[]) {
		for(int i=0; i <= listeAgences.length-1; i++) {
			System.out.println("[Agence "+ listeAgences[i].id + "]:" + "\n***********" +"\nCode d'Agence: " + listeAgences[i].getCodeAgence()+ "\nNom du Agence: " + listeAgences[i].getNomAgence()  +"\nAdresse d'Agence: " + listeAgences[i].getAdresse() + "\n");
		}
	}


	public static Agence[] listeAgences() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Combien d'Agence Vous Voulez Ajouter? : ");
			int nbAgence = sc.nextInt();
			
			Agence listeAgences[] = new Agence[nbAgence];
			
			for(int i = 0 ; i <= nbAgence-1 ; i++) {
				
				int id = i+1;
				
				System.out.println("Donner le Code d'Agence Numero " + id + " :");
				int codeAgence = sc.nextInt();
					
				System.out.println("Donner le Nom d'Agence Numero " + id + " :");
				String nomAgence = sc.next();
					
				System.out.println("Donner l'Adresse d'Agence Numero " + id + " :");
				String adresse = sc.next();
					
				listeAgences[i] = new Agence( id, codeAgence,  nomAgence, adresse);

			}

			return listeAgences;
		}
	}
}

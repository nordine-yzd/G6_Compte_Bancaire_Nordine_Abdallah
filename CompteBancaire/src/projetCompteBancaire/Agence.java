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
			System.out.println("\n[Agence "+ listeAgences[i].getId() + "]:" 
					+"\nCode d'Agence: " + listeAgences[i].getCodeAgence()
					+ "\nNom du Agence: " + listeAgences[i].getNomAgence()  
					+"\nAdresse d'Agence: " + listeAgences[i].getAdresse() 
					+ "\n");
		}
	}


	public static Agence[] listeAgences() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Combien d'Agence Vous Voulez Ajouter? : ");
			int nbAgences = sc.nextInt();
			
			Agence listeAgences[] = new Agence[nbAgences];
			
			for(int i = 0 ; i <= nbAgences-1 ; i++) {
				listeAgences[i] = new Agence();
				listeAgences[i].setId(i);
				
				System.out.println("Donner le Code d'Agence: ");
				listeAgences[i].setCodeAgence(sc.nextInt()); 
				
				if (listeAgences[i].getCodeAgence() > 99 && listeAgences[i].getCodeAgence() < 1000) {
					
					System.out.println("Donner le Nom d'Agence: ");
					listeAgences[i].setNomAgence(sc.next());
						
					System.out.println("Donner l'Adresse d'Agence: ");
					listeAgences[i].setAdresse(sc.next());
					
				} else {
					System.out.println("Le Code D'Agence Doit Contenir 3 chiffres");
					return listeAgences();
				}
			}

			return listeAgences;
		}
	}
}
package projetCompteBancaire;

import java.util.Scanner;

public class Client {
	private int id;
	private int numeroClient;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	
	public Client( ) {
		
	}
	
	public Client (int id, int numeroClient, String nom, String prenom, String dateDeNaissance) {
		this.numeroClient = numeroClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(int numeroClient) {
		this.numeroClient = numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public static void toString(Client listeClients[]) {
		for(int i=0; i <= listeClients.length-1; i++) {
			System.out.println("\n\t\t\tFiche Client"
					+ "\n[Client "+ listeClients[i].id + "]:" 
					+"\nNuméro Client:  " + listeClients[i].getNumeroClient()
					+ "\nNom Du Client: " + listeClients[i].getNom()
					+"\nPrénom Du Client: " + listeClients[i].getPrenom()
					+"\nDate De Naissance: " + listeClients[i].getDateDeNaissance()
					+ "\n");
		}
	}


	public static Client[] listeClients() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Combien d'Client Vous Voulez Ajouter? : ");
			int nbClient = sc.nextInt();
			
			Client listeClients[] = new Client[nbClient];
			
			for(int i = 0 ; i <= nbClient-1 ; i++) {
				
				int id = i+1;
				
				System.out.println("Donner le Numéro Client No. " + id + " :");
				int numeroClient = sc.nextInt();
				
					
				System.out.println("Donner le Nom Du Client No. " + id + " :");
				String nom = sc.next();
					
				System.out.println("Donner le Prénom Du Client No. " + id + " :");
				String prenom = sc.next();
				
				System.out.println("Donner le Date De Naissance Du Client No. " + id + " :");
				String dateDeNaissance = sc.next();
					
				listeClients[i] = new Client(id, numeroClient, nom, prenom, dateDeNaissance);
			}

			return listeClients;
		}
	
	}
	
}

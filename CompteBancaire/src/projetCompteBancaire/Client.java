package projetCompteBancaire;

import java.util.Scanner;

public class Client {
	private int id;
	private int numeroClient;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String email;
	
	public Client( ) {
		
	}
	
	public Client (int id, int numeroClient, String nom, String prenom, String dateDeNaissance, String email) {
		this.numeroClient = numeroClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.email = email;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void toString(Client listeClients[]) {
		for(int i=0; i <= listeClients.length-1; i++) {
			System.out.println("\n\t\t\tFiche Client"
					+ "\n[Client "+ listeClients[i].getId() + "]:" 
					+"\nNuméro Client: FR-" + listeClients[i].getNumeroClient()
					+ "\nNom Du Client: " + listeClients[i].getNom()
					+"\nPrénom Du Client: " + listeClients[i].getPrenom()
					+"\nDate De Naissance: " + listeClients[i].getDateDeNaissance()
					+"\nEmail: " + listeClients[i].getEmail()
					+ "\n");
		}
	}


	public static Client[] listeClients() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Combien d'Client Vous Voulez Ajouter? : ");
			int nbClients = sc.nextInt();
			
			Client listeClients[] = new Client[nbClients];
			
			for(int i = 0 ; i <= nbClients-1 ; i++) {
				
				listeClients[i] = new Client();
				listeClients[i].setId(i);
				
				System.out.println("Donner le Numéro Client: ");
				listeClients[i].setNumeroClient(sc.nextInt()); 
				
				if (listeClients[i].getNumeroClient() > 100000) {
				
					System.out.println("Donner Le Nom Du Client: ");
					listeClients[i].setNom(sc.next());
						
					System.out.println("Donner Le Prénom Du Client: ");
					listeClients[i].setPrenom(sc.next());
					
					System.out.println("Donner Le Date De Naissance Du Client: ");
					listeClients[i].setDateDeNaissance(sc.next());
					
					System.out.println("Donner L'Email Du Client: ");
					listeClients[i].setEmail(sc.next());
					
				}else {
					System.out.println("Le Numéro Client Doit Contenir Au Minimum 6 Chiffres !!!");
					return listeClients();
				}
			}
			return listeClients;
		}
	}
}
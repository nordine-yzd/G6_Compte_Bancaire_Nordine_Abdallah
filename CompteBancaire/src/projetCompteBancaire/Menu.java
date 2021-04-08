package projetCompteBancaire;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	
    	String choix;
    	
    	do {
			System.out.println("*********************************MENU CDA BANQUE*********************************\n");
	        System.out.println("1- Créer Une Agence"); 
	        System.out.println("2- Créer Un Client");
	        System.out.println("3- Créer Un Compte Bancaire");
	        System.out.println("4- Recherche De Compte (No. Compte)");
	        System.out.println("5- Recherche De Client (Nom, Numéro De Compte, Identifiant De Client)");
	        System.out.println("6- Afficher La Liste Des Comptes D’Un Client (Identifiant Client)");
	        System.out.println("7- Imprimer Les Infos Client (Identifiant Client)");
	        System.out.println("8- Quitter Le Programme");
	        System.out.println("\n*******************************************************************************");
	        System.out.print("\nVotre Choix: ");
	        choix = sc.next(); 
    	
    		

	    	switch(choix.trim()) {
	        
		        case "1" :
		        	Agence agence[]= Agence.listeAgences();
		        	Agence.toString(agence);
	
		        case "2" :
		        	Client client[] = Client.listeClients();
		        	Client.toString(client);
		        	
		        	
		        case "3" :
		        	//créerCompteBancaire
		            break;
		            
		        case "4" :
		    		//rechercheCompte(
		            break;
		            
		        case "5" :
		        	//rechercheClient;
		            break;
		            
		        case "6" :
		    		//afficherListe;
		            break;
		            
		        case "7" :
		    		//imprimerInfosClient;
		            break;
		            
		        case "8" :
		                System.exit(0);
		                
		        default: 
		               System.out.println("\n---> ERROR!!! Veuillez Saisir Un Des Choix Proposés.\n");
	               
	       } 
    	} while(choix.equals("[1-7]"));
	
     sc.close();
    	
	}
}
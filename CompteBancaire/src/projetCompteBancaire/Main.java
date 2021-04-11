package projetCompteBancaire;

import java.util.*;


public class Main {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		startApp();
		printMenu();
		boolean quit = false;
		
		   
        do {
	        System.out.print("\nVotre Choix: \n");
	        int choix = sc.nextInt(); 
    	
	        
	    	switch(choix) {
	    	
		    	case 0 :
		    		printMenu();
		        	break;
	        
		        case 1 :
		        	Agence agence[] = Agence.listeAgences();
		        	Agence.toString(agence);
		        	break;
		        	
	
		        case 2 :
		        	Client client[] = Client.listeClients();
		        	Client.toString(client);
		        	break;
		        	
		        case 3 :
		        	CompteBancaire.printMenu2();
		        	CompteBancaire compte[] =  CompteBancaire.listeComptes();
		        	CompteBancaire.toString(compte);
		            break;
		            
		        case 4 :
		    		//rechercheCompte(
		            break;
		            
		        case 5 :
		        	//rechercheClient;
		            break;
		            
		        case 6 :
		    		//afficherListe;
		            break;
		            
		        case 7 :
		    		//imprimerInfosClient;
		            break;
		            
		        case 8 :
		            quitApp();
		        	quit = true;
		        	break;
		                
		        default: 
		               System.out.println("\n---> ERROR!!! Veuillez Saisir Un Des Choix Proposés.\n");
	               
	       } 
	    	
    	} while (! quit);
        
        

	}
	
	
	
	public static void startApp() throws InterruptedException {
		System.out.println("Starting System...");
        Thread.sleep(500);
        System.out.println("System Starting Up...");
        Thread.sleep(1000);
        System.out.println("System Starting Up...");
        Thread.sleep(1500);
        System.out.println("System Starting Up...");
        Thread.sleep(2000);
        System.out.println("\n~[H][E][L][L][O]~");
	}
	
	public static void quitApp() throws InterruptedException {
		System.out.println("\nShutting Down System...");
        Thread.sleep(500);
        System.out.println("System Shutting Down...");
        Thread.sleep(1000);
        System.out.println("System Shutting Down...");
        Thread.sleep(1500);
        System.out.println("System Shutting Down...");
        Thread.sleep(2000);
        System.out.println("~[G][O][O][D][B][Y][E]~");
	}
	
	public static void printMenu() {
		System.out.println("*********************************MENU CDA BANQUE*********************************\n");
		System.out.println("0- Retourner Au Menu");
		System.out.println("1- Créer Une Agence"); 
        System.out.println("2- Créer Un Client");
        System.out.println("3- Créer Un Compte Bancaire");
        System.out.println("4- Recherche De Compte (No. Compte)");
        System.out.println("5- Recherche De Client (Nom, Numéro De Compte, Identifiant De Client)");
        System.out.println("6- Afficher La Liste Des Comptes D’Un Client (Identifiant Client)");
        System.out.println("7- Imprimer Les Infos Client (Identifiant Client)");
        System.out.println("8- Quitter Le Programme");
        System.out.println("\n*******************************************************************************");
	}
	
	
	
}
	

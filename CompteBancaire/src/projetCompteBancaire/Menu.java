package projetCompteBancaire;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	
    	int choix;
    	
    	do {
			System.out.println("*********************************MENU CDA BANQUE*********************************\n");
	        System.out.println("\t1- Créer Une Agence"); 
	        System.out.println("\t2- Créer Un Client");
	        System.out.println("\t3- Créer Un Compte Bancaire");
	        System.out.println("\t4- Recherche De Compte (No. Compte)");
	        System.out.println("\t5- Recherche De Client (Nom, Numéro De Compte, Identifiant De Client)");
	        System.out.println("\t6- Afficher La Liste Des Comptes D’Un Client (Identifiant Client)");
	        System.out.println("\t7- Imprimer Les Infos Client (Identifiant Client)");
	        System.out.println("\t8- Quitter Le Programme");
	        System.out.println("\n*******************************************************************************");
	        System.out.print("\nVotre Choix: ");
	        choix = sc.nextInt(); 
    	} while(choix > 8);
    		

    	switch(choix) {
        
	        case 1 :
	        	Agence agence[]= Agence.listeAgences();
	        	Agence.toString(agence);
	        	break;

	        case 2 :
	        	//CréerClient
	        	break;
	        	
	        case 3 :
	        	//créerCompteBancaire
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
	                System.exit(0);
	                
	        default: 
	               System.out.println("\n---> ERROR!!! Veuillez saisir un des choix proposés.\n");
               
       } 
	
        sc.close();
    	
	}
}
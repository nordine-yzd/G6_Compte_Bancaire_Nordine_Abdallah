package projetCompteBancaire;

import java.util.Scanner;

public class Menu { 
    public static void main(String[] miniprojethotel) {
    
            int tab[][] = creationMenu(); 
            menuBanque(tab);

    }
    
    public static void menuBanque(int tab[][]) {

            Scanner sc = new Scanner(System.in);
            
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
            System.out.print("\nVotre choix: ");
            String choix = sc.next(); 

            switch(choix) {
                    case "1":
                    		créerAgence(tab);
                            menuBanque(tab);
                    case "2":
                    		créerClient(tab);
                            menuBanque(tab);
                    case "3":
                    		créerCompteBancaire(tab);
                            menuBanque(tab);
                    case "4":
                    		rechercheCompte(tab);
                            menuBanque(tab);
                    case "5":
                    		rechercheClient(tab);
                            menuBanque(tab);
                    case "6":
                    		afficherListe(tab);
                            menuBanque(tab);
                    case "7":
                    		imprimerInfosClient(tab);
                            menuBanque(tab);
                    case "8":
                            System.exit(0);
                    default: 
                           System.out.println("\n---> ERROR!!! Veuillez saisir un des choix proposés.\n");
                           menuHotel(tab);
            }
    }
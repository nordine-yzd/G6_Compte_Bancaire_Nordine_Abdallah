package projet.compte.bancaire.main;

import java.util.Scanner;

import projet.compte.bancaire.dao.ClientDao;
import projet.compte.bancaire.dao.CompteBancaireDao;
import projet.compte.bancaire.traitement.AgenceTraitement;
import projet.compte.bancaire.traitement.ClientTraitement;
import projet.compte.bancaire.traitement.CompteBancaireTraitement;

public class Application {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Application.sc.useDelimiter("(\r|\n)+");
		startApp();
		printMenu();
		boolean quit = false;

		do {
			System.out.print("\nVotre Choix:");
			int choix = Application.sc.nextInt();

			switch (choix) {

			case 0:
				printMenu();
				break;

			case 1:
				AgenceTraitement.creationAgence();
				break;

			case 2:
				ClientTraitement.creationClient();
				break;

			case 3:
				CompteBancaireTraitement.creationCompteBancaire();
				break;

			case 4:
				CompteBancaireDao.findByNumeroClient(null);
				break;

			case 5:
				ClientDao.findByNumeroClient(null);
				break;

			case 6:
				CompteBancaireTraitement.afficherListeCompte();
				break;

			case 7:
				ClientTraitement.afficherListeClient();
				break;

			case 8:
				quitApp();
				quit = true;
				break;
			case 9:
				AgenceTraitement.afficherListeAgence();
				break;
			case 10:
				ClientTraitement.afficherListeClient();
				break;
			case 11:
				CompteBancaireTraitement.afficherListeCompte();
				break;
			default:
				System.out.println("\n---> ERROR!!! Veuillez Saisir Un Des Choix Proposés.\n");

			}

		} while (!quit);
		sc.close();
	}

	public static void startApp() {
		System.out.println("Starting System...");

		System.out.println("System Starting Up...");

		System.out.println("System Starting Up...");

		System.out.println("System Starting Up...");

		System.out.println("\n~[H][E][L][L][O]~");
	}

	public static void quitApp() {
		System.out.println("\nShutting Down System...");

		System.out.println("System Shutting Down...");

		System.out.println("System Shutting Down...");

		System.out.println("System Shutting Down...");

		System.out.println("~[G][O][O][D][B][Y][E]~");
	}

	public static void printMenu() {
		System.out.println("*********************************MENU CDA BANQUE*********************************\n");
		System.out.println(" 0- Retourner Au Menu");
		System.out.println(" 1- Créer Une Agence");
		System.out.println(" 2- Créer Un Client");
		System.out.println(" 3- Créer Un Compte Bancaire");
		System.out.println(" 4- Recherche De Compte (No. Compte)");
		System.out.println(" 5- Recherche De Client (Nom, Numéro De Compte, Identifiant De Client)");
		System.out.println(" 6- Afficher La Liste Des Comptes D’Un Client (Identifiant Client)");
		System.out.println(" 7- Imprimer Les Infos Client (Identifiant Client)");
		System.out.println(" 8- Quitter Le Programme");
		System.out.println(" 9- [DEBUG] Liste Agences");
		System.out.println("10- [DEBUG] Liste Clients");
		System.out.println("11- [DEBUG] Liste Comptes");
		System.out.println("\n*******************************************************************************");
	}

}

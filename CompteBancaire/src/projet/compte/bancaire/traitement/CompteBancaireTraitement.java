package projet.compte.bancaire.traitement;

import projet.compte.bancaire.dao.AgenceDao;
import projet.compte.bancaire.dao.ClientDao;
import projet.compte.bancaire.dao.CompteBancaireDao;
import projet.compte.bancaire.main.Application;
import projet.compte.bancaire.model.Agence;
import projet.compte.bancaire.model.Client;
import projet.compte.bancaire.model.CompteBancaire;

public class CompteBancaireTraitement {


	public static void creationCompteBancaire() {
		System.out.print("Combien de compte bancaire vous voulez ajouter? : ");
		int nbComptes = Application.sc.nextInt();
		CompteBancaire currentCompteBancaire = null;

		for (int i = 0; i <= nbComptes - 1; i++) {
			currentCompteBancaire = new CompteBancaire();
			System.out.print("Quel Type Voulez-Vous Choisir? ");
			int choice = choixTypeCompteBancaire();

			if (choice == 0) {
				System.err.print("Le type n'existe pas");
				return;
			}

			// client
			System.out.print("Entrer le numero client: ");
			String numeroClient = Application.sc.next();
			Client client = ClientDao.findByNumeroClient(numeroClient);
			if (client == null) {
				System.err.print("Le client n'existe pas ");
				return;
			}

			if (CompteBancaireDao.hasCompte(numeroClient, choice)) {
				AfficherMessageErreurTypeCompte(choice);
				return;
			}
			currentCompteBancaire.setClient(client);
			
			// agence
			System.out.print("Entrer le code agence: ");
			int codeAgence = Application.sc.nextInt();
			Agence agence = AgenceDao.findByCodeAgence(codeAgence);
			if (agence == null) {
				System.err.print("L'agence n'existe pas ");
				return;
			}
			currentCompteBancaire.setAgence(agence);
			
			currentCompteBancaire.setType(choice);
			System.out.print("Entrer Solde: ");
			currentCompteBancaire.setSolde(Application.sc.nextFloat());

			System.out.print("Découvert Autorisé (true/false): ");
			currentCompteBancaire.setDecouvert(Application.sc.nextBoolean());
			
			CompteBancaireDao.ajouter(currentCompteBancaire);
		}
	}

	private static void AfficherMessageErreurTypeCompte(int choice) {
		String message = "Le client possede déjà un compte ";
		switch (choice) {
		case CompteBancaire.TYPE_COMPTE_COURANT:
			System.err.println(message+ "Courant.");
			break;
		case CompteBancaire.TYPE_COMPTE_LIVRET_A:
			System.err.println(message+ "Livret A.");
			break;
		case CompteBancaire.TYPE_COMPTE_PLAN_EPARGNE:
			System.err.println(message+ "plan d'épargne.");
			break;
		}
	}

	private static int choixTypeCompteBancaire() {
		System.out.println("On Vous Propose 3 Differents Types De Comptes:");
		System.out.println("1- Compte Courant (Frais de tenue de compte = 25 euros / an)");
		System.out
				.println("2- Livret A  ( Frais de tenue de compte = Frais de tenue de compte + 10% de l’épargne / an)");
		System.out.println(
				"3- Plan Epargne Logement ( Frais de tenue de compte = Frais de tenue de compte + 2,5% de l’épargne / an)\n");
		System.out.print("		Choix type compte : ");
		int choice = Application.sc.nextInt();
		if (choice < 0 || choice > 3)
			return 0;
		return choice;
	}

	public static void afficherListeCompte() {
		// TODO Auto-generated method stub
		CompteBancaire[] compteBancaires = CompteBancaireDao.getAll();
		System.out.println("numeroCompte,"+ "solde,"+" decouvert,"+"type");
		for (CompteBancaire compteBancaire : compteBancaires) {
			System.out.println(String.format("%11d", compteBancaire.getNumeroCompte())+", "+String.format("%"+(20-compteBancaire.getSolde())+"s",  compteBancaire.isDecouvert())+", "+compteBancaire.getType());
		}
	}
}

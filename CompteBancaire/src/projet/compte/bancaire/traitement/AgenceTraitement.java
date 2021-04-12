package projet.compte.bancaire.traitement;

import projet.compte.bancaire.dao.AgenceDao;
import projet.compte.bancaire.main.Application;
import projet.compte.bancaire.model.Agence;

public class AgenceTraitement {
	public static void creationAgence() {

		System.out.print("Combien d'Agence Vous Voulez Ajouter? : ");
		int nbAgences = Application.sc.nextInt();

		Agence currentAgence;

		for (int i = 0; i <= nbAgences - 1; i++) {
			currentAgence = new Agence();
			System.out.print("Donner le Nom d'Agence: ");
			currentAgence.setNomAgence(Application.sc.next());
			System.out.print("Donner l'Adresse d'Agence: ");
			currentAgence.setAdresse(Application.sc.next());
			AgenceDao.ajouter(currentAgence);
		}

	}

	public static void afficherListeAgence() {
		Agence[] agences = AgenceDao.getAll();
		System.out.println("numeroClien,"+ String.format("%-17s", "nom")+","+" Adresse");
		for (Agence agence : agences) {
			System.out.println(String.format("%11d", agence.getCodeAgence())+", "+String.format("%"+(20-agence.getNomAgence().length())+"s",  agence.getNomAgence())+", "+agence.getAdresse());
		}
		
	}
	

	
	
	
	
	
}

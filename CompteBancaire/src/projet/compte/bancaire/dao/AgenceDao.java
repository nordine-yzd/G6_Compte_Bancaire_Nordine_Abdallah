package projet.compte.bancaire.dao;

import projet.compte.bancaire.helpers.TableauUtilitaire;
import projet.compte.bancaire.model.Agence;

public class AgenceDao {

	private static Agence[] agences = new Agence[0];

	public AgenceDao() {

	}

	
	public static Agence[] getAll () {
		
		return agences;
	}
	
	public static void ajouter(Agence agence) {
		agences = TableauUtilitaire.redimTabl(agences, 1); 
		agences[agences.length-1]=agence;
	}
	
	public static Agence findByCodeAgence (int codeAgence) {
		for (Agence currentAgence : agences) {
			if(currentAgence.getCodeAgence()==codeAgence) {
				return currentAgence;
			}
		}
		return null;
	}
	
	
/*
	public static void toString(AgenceDao listeAgences[]) {
		for (int i = 0; i <= listeAgences.length - 1; i++) {
			System.out.println("\n[Agence " + listeAgences[i].getId() + "]:" + "\nCode d'Agence: "
					+ listeAgences[i].getCodeAgence() + "\nNom du Agence: " + listeAgences[i].getNomAgence()
					+ "\nAdresse d'Agence: " + listeAgences[i].getAdresse() + "\n");
		}
	}

	*/
}
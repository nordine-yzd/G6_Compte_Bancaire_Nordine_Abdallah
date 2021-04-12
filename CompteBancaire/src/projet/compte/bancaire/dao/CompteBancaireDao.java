package projet.compte.bancaire.dao;

import projet.compte.bancaire.helpers.TableauUtilitaire;
import projet.compte.bancaire.model.CompteBancaire;

public class CompteBancaireDao {

	private static CompteBancaire[] compteBancaires = new CompteBancaire[0];

	public CompteBancaireDao() {

	}

	public static CompteBancaire[] getAll () {
		
		return compteBancaires;
	}
	public static void ajouter(CompteBancaire compteBancaire) {
		compteBancaires = TableauUtilitaire.redimTabl(compteBancaires, 1); 
		compteBancaires[compteBancaires.length-1]=compteBancaire;
	}
	
	public static CompteBancaire findByNumeroCompte (int numero) {
		for (CompteBancaire currentCompteBancaire : compteBancaires) {
			if(currentCompteBancaire.getNumeroCompte()==numero) {
				return currentCompteBancaire;
			}
		}
		return null;
	}
	
	public static CompteBancaire[] findByNumeroClient (String numeroClient) {
		CompteBancaire[] sesCompteBancaires = new CompteBancaire[0];
		
		for (CompteBancaire currentCompteBancaire : compteBancaires) {
			if(currentCompteBancaire.getClient().getNumeroClient().equals(numeroClient)) {
				sesCompteBancaires = TableauUtilitaire.redimTabl(sesCompteBancaires, 1); 
				sesCompteBancaires[sesCompteBancaires.length-1]=currentCompteBancaire;
			}
		}
		return sesCompteBancaires;
	}
	
	
	public static boolean hasCompte (String numeroClient,int typeCompte) {
		CompteBancaire[] sesCompteClient = findByNumeroClient(numeroClient);
		for (CompteBancaire compteBancaire : sesCompteClient) {
			if(compteBancaire.getType()==typeCompte)
				return true;
		}
		return false;
	}
}
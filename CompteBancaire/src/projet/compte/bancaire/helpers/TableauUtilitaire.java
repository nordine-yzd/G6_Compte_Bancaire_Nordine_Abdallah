package projet.compte.bancaire.helpers;

import projet.compte.bancaire.model.Agence;
import projet.compte.bancaire.model.Client;
import projet.compte.bancaire.model.CompteBancaire;

public class TableauUtilitaire {

	public static int[] redimTablInt(int[] tabA, int nbrElements) {
		int tailleNouveauTableau = (tabA.length + nbrElements) < 0 ? 0 : (tabA.length + nbrElements);

		int tmp[] = new int[tailleNouveauTableau];
		int tailleRecopie = (nbrElements < 0) ? (tabA.length + nbrElements) : (tabA.length);

		if (tailleRecopie < 0) {
			tailleRecopie = 0;
		}

		for (int i = 0; i < tailleRecopie; i++) {
			tmp[i] = tabA[i];
		}

		tabA = tmp;
		tmp = null;
		return tabA;
	}

	public static Agence[] redimTabl(Agence[] tabA, int nbrElements) {
		int tailleNouveauTableau = (tabA.length + nbrElements) < 0 ? 0 : (tabA.length + nbrElements);

		Agence tmp[] = new Agence[tailleNouveauTableau];
		int tailleRecopie = (nbrElements < 0) ? (tabA.length + nbrElements) : (tabA.length);

		if (tailleRecopie < 0) {
			tailleRecopie = 0;
		}

		for (int i = 0; i < tailleRecopie; i++) {
			tmp[i] = tabA[i];
		}

		tabA = tmp;
		tmp = null;
		return tabA;
	}
	
	public static Client[] redimTabl(Client[] tabA, int nbrElements) {
		int tailleNouveauTableau = (tabA.length + nbrElements) < 0 ? 0 : (tabA.length + nbrElements);

		Client tmp[] = new Client[tailleNouveauTableau];
		int tailleRecopie = (nbrElements < 0) ? (tabA.length + nbrElements) : (tabA.length);

		if (tailleRecopie < 0) {
			tailleRecopie = 0;
		}

		for (int i = 0; i < tailleRecopie; i++) {
			tmp[i] = tabA[i];
		}

		tabA = tmp;
		tmp = null;
		return tabA;
	}
	
	public static CompteBancaire[] redimTabl(CompteBancaire[] tabA, int nbrElements) {
		int tailleNouveauTableau = (tabA.length + nbrElements) < 0 ? 0 : (tabA.length + nbrElements);

		CompteBancaire tmp[] = new CompteBancaire[tailleNouveauTableau];
		int tailleRecopie = (nbrElements < 0) ? (tabA.length + nbrElements) : (tabA.length);

		if (tailleRecopie < 0) {
			tailleRecopie = 0;
		}

		for (int i = 0; i < tailleRecopie; i++) {
			tmp[i] = tabA[i];
		}

		tabA = tmp;
		tmp = null;
		return tabA;
	}

}

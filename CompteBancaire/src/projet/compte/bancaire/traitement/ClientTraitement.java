package projet.compte.bancaire.traitement;

import projet.compte.bancaire.dao.ClientDao;
import projet.compte.bancaire.main.Application;
import projet.compte.bancaire.model.Client;

public class ClientTraitement {


	public static void creationClient() {

		System.out.print("Combien d'Client Vous Voulez Ajouter? : ");
		int nbClients = Application.sc.nextInt();

		Client currentClient = null;

		for (int i = 0; i <= nbClients - 1; i++) {

			currentClient = new Client();

			System.out.print("Donner Le Nom Du Client: ");
			currentClient.setNom(Application.sc.next());

			System.out.print("Donner Le Prénom Du Client: ");
			currentClient.setPrenom(Application.sc.next());

			System.out.print("Donner Le Date De Naissance Du Client: ");
			currentClient.setDateDeNaissance(Application.sc.next());

			System.out.print("Donner L'Email Du Client: ");
			currentClient.setEmail(Application.sc.next());

			ClientDao.ajouter(currentClient);
		}
	}	
		
	public static void afficherListeClient() {
			Client[] clients = ClientDao.getAll();
			System.out.println("Numero Client,"+ String.format("%-17s", "nom")+","+ String.format("%-17s", "prenom")+","+" Adresse"+"Date De Naissance"+"Email");
			for (Client client : clients) {
				System.out.println(String.format("%11d", client.getNumeroClient()) + ", " + String.format("%"+(20-client.getNom().length()) + "s" + ", " + String.format("%"+(20-client.getPrenom().length())) + "s" + ", " + client.getDateDeNaissance()) + ", " + client.getEmail());
			
			}
		}

	
}

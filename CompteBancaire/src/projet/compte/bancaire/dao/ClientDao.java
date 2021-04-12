package projet.compte.bancaire.dao;

import projet.compte.bancaire.helpers.TableauUtilitaire;
import projet.compte.bancaire.model.Client;

public class ClientDao {

	private static Client[] clients = new Client[0];

	public ClientDao() {

	}
	public static Client[] getAll () {
		return clients;
	}

	

	public static void ajouter(Client Client) {
		clients = TableauUtilitaire.redimTabl(clients, 1); 
		clients[clients.length-1]=Client;
	}
	
	public static Client findByNumeroClient (String numeroClient) {
		for (Client currentClient : clients) {
			if(currentClient.getNumeroClient().equalsIgnoreCase(numeroClient)) {
				return currentClient;
			}
		}
		return null;
	}
	
	
}
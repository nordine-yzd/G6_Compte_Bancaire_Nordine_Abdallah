package projet.compte.bancaire.model;

public class Client {
	private static int cptClient = 0;
	private String  numeroClient;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String email;
	
	public Client( ) {
		this.numeroClient = "FR"+String.format("%06d", (++cptClient));
	}
	
	public Client (String nom, String prenom, String dateDeNaissance, String email) {
		this();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.email = email;
	}

	public String getNumeroClient() {
		return numeroClient;
	}

	public void setNumeroClient(String numeroClient) {
		this.numeroClient = numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
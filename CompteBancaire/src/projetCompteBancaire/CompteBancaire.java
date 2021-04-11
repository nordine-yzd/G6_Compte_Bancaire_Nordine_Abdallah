package projetCompteBancaire;

import java.util.Scanner;

//import java.util.Scanner;

public class CompteBancaire {
	private int id;
	private long numeroCompte ;
	
	private float solde ;
	private boolean decouvert ;

	public CompteBancaire () {
		
	}

	public CompteBancaire(int id, long numeroCompte, float solde, boolean decouvert) {
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public boolean isDecouvert() {
		return decouvert;
	}

	public void setDecouvert(boolean decouvert) {
		this.decouvert = decouvert;
	}
	
	
	public static void toString(CompteBancaire listeComptes[]) {
		for(int i=0; i <= listeComptes.length-1; i++) {
			System.out.println("\n\t\t\tListe De Compte"
					+ "\n[Client "+ listeComptes[i].getId() + "]:" 
					+"\nSolde: " + listeComptes[i].getSolde()
					+ "\nNumero De Compte: " + listeComptes[i].getNumeroCompte()
					+ "\n");
		}
	}
	
	public static CompteBancaire[] listeComptes() {
		try(Scanner sc = new Scanner(System.in)){

			int nbComptes = 1;
			CompteBancaire listeComptes[] = new CompteBancaire[nbComptes];
			
			for(int i = 0 ; i <= nbComptes-1; i++) {
				listeComptes[i] = new CompteBancaire();
				listeComptes[i].setId(i);
				System.out.println("Quel Type Voulez-Vous Choisir? ");
				int choice = sc.nextInt();
				
				switch(choice) {
					
					case 1:
						if(choice==1) {
							System.out.println("Donner Le Numéro De Compte Bancaire: ");
							listeComptes[i].setNumeroCompte(sc.nextLong());
							
							if(listeComptes[i].getNumeroCompte() > 9999999999L && listeComptes[i].getNumeroCompte() < 100000000000L) {
								
								System.out.println("Entrer Solde: ");
								listeComptes[i].setSolde(sc.nextFloat());
								
								System.out.println("Découvert Autorisé (true/false): ");
								listeComptes[i].setDecouvert(sc.nextBoolean());
								
								if(listeComptes[i].isDecouvert() == true) {
									System.out.println("Découvert Autorisé");
								}else {
									System.out.println("Découvert Non-Autorisé");
								}
								break;
							}else {
								System.out.println("Numéro De Compte Bancaire Doit Contenir 11 Chiffres  !!!");
							}
						}
						
						
					case 2:	
						if(choice == 2) {	
							System.out.println("Donner Le Numéro De Compte Bancaire: ");
							listeComptes[i].setNumeroCompte(sc.nextLong());
							
							if(listeComptes[i].getNumeroCompte() > 9999999999L && listeComptes[i].getNumeroCompte() < 100000000000L) {
								
								System.out.println("Entrer Solde: ");
								listeComptes[i].setSolde(sc.nextFloat());
								
								System.out.println("Découvert Autorisé (true/false): ");
								listeComptes[i].setDecouvert(sc.nextBoolean());
								
								if(listeComptes[i].isDecouvert() == true) {
									System.out.println("Découvert Autorisé");
								}else {
									System.out.println("Découvert Non-Autorisé");
								}
								break;
							}else {
								System.out.println("Numéro De Compte Bancaire Doit Contenir 11 Chiffres  !!!");
							}
						}
						 
						
				
					case 3:
						if(choice == 3) {
							System.out.println("Donner Le Numéro De Compte Bancaire: ");
							listeComptes[i].setNumeroCompte(sc.nextLong());
							
							if(listeComptes[i].getNumeroCompte() > 9999999999L && listeComptes[i].getNumeroCompte() < 100000000000L) {
								
								System.out.println("Entrer Solde: ");
								listeComptes[i].setSolde(sc.nextFloat());
								
								System.out.println("Découvert Autorisé (true/false): ");
								listeComptes[i].setDecouvert(sc.nextBoolean());
								
								if(listeComptes[i].isDecouvert() == true) {
									System.out.println("Découvert Autorisé");
								}else {
									System.out.println("Découvert Non-Autorisé");
								}
								break;
							}else {
								System.out.println("Numéro De Compte Bancaire Doit Contenir 11 Chiffres  !!!");
							}
						}
						break;
				}

				}	
	    }
		return listeComptes();
	}
		
			
			
			
		
	
	
	public static void printMenu2() {
		System.out.println("On Vous Propose 3 Differents Types De Comptes:");
		System.out.println("\n\t1- Compte Courant (Frais de tenue de compte = 25 euros / an)");
		System.out.println("\n\t2- Livret A  ( Frais de tenue de compte = Frais de tenue de compte + 10% de l’épargne / an)");
		System.out.println("\n\t3- Plan Epargne Logement ( Frais de tenue de compte = Frais de tenue de compte + 2,5% de l’épargne / an)\n");
	}
	
	
}
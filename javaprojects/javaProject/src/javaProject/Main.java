package javaProject;

public class Main {

	public static void main(String[] args) {
	
		TableauDesAppareils ap=new TableauDesAppareils();
		ap.afficher(); // correct
		System.out.println(ap.nbElement()); // correct
		Appareil A1=new Appareil("222ac", "Pc", 2000);

		System.out.println(ap.SupprimerAppareil(A1));
		ap.afficher();
		
	}

}

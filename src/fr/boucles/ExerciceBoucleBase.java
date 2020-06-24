package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		// Affiche de nombre de 1 à 10
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		// Affiche Nom Prénom
		
		for(int i = 0; i <= 20; i++) {
			String NomPrenom = "Bourahim iyan";
			String chaine = "Mon nom et prénom est \t" + NomPrenom;
			System.out.println(chaine);
		}
		
		// Affiche les éléments pairs de 2 à 100
		for(int i = 2 ; i <= 100 ; i = i + 2) {
			int pairs = i * 1;
			System.out.println(i);
		}
		
		//Affiche les éléments impaires de 1 à 99
		for(int i = 1 ; i <= 101 ; i = i + 3) {
			int impairs = i * 1;
			System.out.println(i);
		}
	}
}

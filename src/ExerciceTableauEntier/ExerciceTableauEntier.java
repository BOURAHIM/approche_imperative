package ExerciceTableauEntier;

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		// Affiche le premier �l�ment du tableau
		int[] tab = {1,2,3,4,5,6,7,8,9,10};

		//Affiche le premier �l�ment du tableau
		System.out.println(tab[0]);
		
		//Affiche la longueur du tableau 
		System.out.println(tab.length);
		
		//Affiche le dernier �l�ment du tableau 
		System.out.println(tab.length - 1);
		
		//Modifie valeur �l�ment
		tab[4] = 8;
		System.out.println(tab[4]);
		}
}
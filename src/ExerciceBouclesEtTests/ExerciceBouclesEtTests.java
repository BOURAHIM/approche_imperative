package ExerciceBouclesEtTests;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

	//Affiche ensemble élément tab
		for(int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
		
	//Affiche ensemble élément tab inverse
		for(int i = 0; i <= array.length - 1; i--) {
			System.out.println(array[i]);
		}
		
	//Affiche entier sup à 3
		for(int i = 0; i <= array.length - 1; i++) {
			if(array[i] >= 3) {
				System.out.println(array[i]);
				
			}
		}
		
	}
}

package InversionContenu;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
	/****Cr�er un tableau arrayCopy et copier tous les �l�ments de array dans arrayCopy mais dans l�ordre inverse.**/
		int[] arrayCopy = new int[array.length];
		for(int i = array.length -1; i >= 0; i--) {
			 arrayCopy[i] = array[i];
			System.out.println(array[i]);
			System.out.println(arrayCopy[i]);
		}

	}

}

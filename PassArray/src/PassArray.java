
public class PassArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5}; //initialiser list array
		
		System.out.printf("Effects of passing reference to an "
				+ "entire array:%n"
				+ "The values of the original array are: %n");

		// output original array elements
		for(int value : array) {
			System.out.printf("     %d", value);
		}
		
		modifyArray(array); //passing array reference
		System.out.printf("%n%n The values of the modified array are: %n");
		
		
		//output modified array elements
		for(int value: array) {
			System.out.printf("     %d", value);
		}
		System.out.printf("%nEffects of array element value "
				+ "%narray[3] before modifyElement: %d%n", array[3]);
		
		modifyElement(array[3]); //attempt to modify array[3]
		System.out.printf("%narray [3] after modifyElement: %d%n", array[3]);
	} //end of main
	
	public static void modifyArray(int[] array) {
		for(int counter = 0; counter < array.length; counter++) {
			array[counter] *= 2;
		}
	}
		
	public static void modifyElement(int element) {
		element *=2;
		System.out.printf("%nValue of element in modifyElement: %d", element);
		
	}

}

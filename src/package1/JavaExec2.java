package package1;

/**
 * @author gagan_000
 * This is second Java assignment.
 *Write a Java program which should replace (all) “John” with “Adam” in below array. Array values are:
Element 1 = Sam
Element 2 = John
Element 3= Greg
Element 4 = Chris
Element 5 = John

 */
public class JavaExec2 {

	public static void main(String[] args) {
		
		//Declaring and initializing a String array with values.
		String[] array = {"Sam","John","Greg","Chris","John"};
		
		//Printing the old array
		System.out.println("Old array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//For loop on array length
		for (int i = 0; i < array.length; i++) {
			
			//If condition to check if (i)th array element is equal to String "John"
			if (array[i].equalsIgnoreCase("John")) {
				
				//Replacing "John" with "Adam"
				array[i]="Adam";
			}
		}
		
		//Printing the new array
		System.out.println("New array elements are: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}

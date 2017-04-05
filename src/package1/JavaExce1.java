package package1;

/**
 * @author gagan_000
 * This is first Java assignment.
 * Write a Java program which should perform addition, subtraction, multiplication and division of two variables namely A=50 and B = 40.
 *
 */
public class JavaExce1 {

	public static void main(String[] args) {
		
		//Declaring two variables
		int A = 50;
		int B = 40;
		
		//Declaring the result variable and assigning initial value as 0
		int result=0;
		
		result = addition(A, B);
		System.out.println("Addition result is: "+result);
		
		result = subtraction(A, B);
		System.out.println("Subtraction result is: "+result);
		
		result = multiplication(A, B);
		System.out.println("Multiplication result is: "+result);
		
		result = division(A, B);
		System.out.println("Division result is: "+result);
		
	}
	
	// Addition method. Takes input of 2 variables and return the sum.
	public static int addition(int A, int B){
		int c = A+B;
		return c;
	}
	
	// Subtraction method. Takes input of 2 variables and return the difference.
	public static int subtraction(int A, int B){
		int c = A-B;
		return c;
	}
	
	// Multiplication method. Takes input of 2 variables and return the multiplication result.
	public static int multiplication(int A, int B){
		int c = A*B;
		return c;
	}
	
	// Division method. Takes input of 2 variables and return the division (remainder) results.
	public static int division(int A, int B){
		int c = A%B;
		return c;
	}

}

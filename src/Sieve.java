import java.util.Scanner;

//Implement the sieve of Eratosthenes
public class Sieve {
	public static void main(String[] args) {
		//Prompt for input, create scanner, accept input as an int.
		System.out.println("Please enter a number to calculate the primes up to.");
		Scanner scanner = new Scanner(System.in);
		//Set the desired number to acquire primes up to based on the users input..
		int target = scanner.nextInt();
		scanner.close();
		//Create an array of boolean values up to the desired number 
		boolean[] primes = new boolean[target];
		//Iterate through for each number up to the square root of the target number.
		for(int i = 2; i * i <= target; i++) {
			//Iterate through each number multiplied with the base number until reaching a value greater than the target 
			for(int x = 2; x * i < target; x++) {
				//Set the relevant element of the array to true if it is not a prime number.
				primes[x * i] = true;
			}
		}
		//Iterate through each number in the array of primes, listing the position of the element if it is false(prime) E.G. the seventh position will output seven.
		for(int i = 1; i < target; i++) {
			if(primes[i] == false) {
				System.out.println(i);
			}
		}
	}
}


import java.util.Random;
//random create numbers, and get the maximal, minimal, sum, and average
public class numbers4 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(50);// create random numbers between 0-50
		}
		System.out.println("10 random numbers are:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// get the maximal number
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (temp < a[i + 1]) {
				temp = a[i + 1];
			}
		}
		System.out.println("The maximal number is " + temp);
		
		//get the minimal number
		temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (temp > a[i + 1]) {
				temp = a[i + 1];
			}
		}
		System.out.println("The minimal number is " + temp);
		
		//get the sum of those numbers
		for(int i = 0; i < a.length; i++){
			sum = sum + a[i];
		}
		System.out.println("The sum of numbers are " + sum);
		System.out.println("The average of numbers are " + sum/a.length);
	}
}

//input 0 1 2 3, find the point that sum from left = sum from right
//such as 0+1+2=3, the point is 2
import java.util.Random;

public class numbers7 {
	public static void main(String[] args) {
		int temp = -1;
		Random random = new Random();
		while (temp == -1) {
			int[] array = new int[10];
			for (int i = 0; i < array.length; i++) {
				array[i] = random.nextInt(20);
				System.out.print(array[i] + " ");
			}
			System.out.println("");
			temp = getPoint(array);
		}
		System.out.println("The balance point is: " + temp);
	}

	public static int getPoint(int[] array) {
		int getPoint = -1;
		int[] sumLeft = new int[array.length - 1];
		int[] sumRight = new int[array.length - 1];

		sumLeft[0] = array[0];
		sumRight[array.length - 2] = array[array.length - 1];

		for (int i = sumRight.length - 2; i >= 0; i--) {
			sumRight[i] = sumRight[i + 1] + array[i + 1];
		}
		for (int i = 1; i < sumLeft.length - 1; i++) {
			sumLeft[i] = sumLeft[i - 1] + array[i];
		}
		for (int i = 0; i < sumLeft.length - 1; i++) {
			if (sumLeft[i] == sumRight[i]) {
				getPoint = i;
			}
		}
		return getPoint;
	}
}

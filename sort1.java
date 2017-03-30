import java.util.Random;

public class sort1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		Random data = new Random();

		for (int i = 0; i < 10; i++) {
			a[i] = data.nextInt(20);
		}

		System.out.println("input:");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int temp = a[i];
				if (a[i] > a[j]) {
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("output:");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

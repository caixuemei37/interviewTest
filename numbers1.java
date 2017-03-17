public class numbers1 {
	public static void main(String[] args) {
		// int[] list1 = new int[]{1,4,7,10,13,16,19,22,25,28};
		int[] list = new int[10];
		list[0] = 1;
		int index = 2;
		int length = 7;
		for (int i = 1; i < 10; i++) {
			list[i] = 3 + list[i - 1];

		}

		for (int i = index - 1; i < length + index - 1; i++) {
			System.out.print(list[i] + " ");
		}
	}
}

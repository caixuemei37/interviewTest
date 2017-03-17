public class string2 {
	public static void main(String[] args) {
		// input "I love you", output "you love I"
		String a = "I love you";
		String[] b = a.split(" ");// split words by blank space " "
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.print(b[i] + " ");
		}
	}
}

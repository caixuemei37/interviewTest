//input 12345, output 54321
public class numbers5 {
	public static void main(String[] args){
		int a = 223355;
		String b = String.valueOf(a);
		String temp = "";
		int output;
		for(int i = b.length(); i>0; i--){
			temp = temp + b.substring(i-1, i);
		}
		output = Integer.valueOf(temp);
		System.out.println("The input is: "+ a + ";" + "The output is: " + output);
	}
}

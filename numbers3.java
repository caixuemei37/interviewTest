//1+3+5+7+9...+99=?
public class numbers3 {
	public static void main(String[] args){
		int sum = 0;
		int[] a = new int[50];
		a[0] = 1;
		for(int i = 1; i < 50; i++){
			a[i] = a[i-1] + 2;
			sum = sum + a[i] + 1;
		}
		System.out.println("1 + 3 + 5 + ... + 99: "+sum);
	}
}

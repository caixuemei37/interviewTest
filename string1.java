public class string1 {
	public static void main(String[] args) {
		String a = "bcabcafg";//find the first appeared letter only has one in this string
		String word = "";
		int count = 0;
		for (int i = 0; i <= a.length() - 1; i++) {
			String temp = a.substring(i, i + 1);
			// System.out.println(temp);
			count = 0;
			for (int j = 0; j <= a.length() - 1; j++) {
				if(temp.equals(a.substring(j,j+1))){
					count++;
				}
									
			}
			if(count == 1){
				word = temp;
				break;
			}
		}
		System.out.println(word);
	}

}

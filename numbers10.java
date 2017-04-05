public class numbers10 {
	public static void main(String[] args){
	String a ="12345";
	String b = "992345";
	boolean over = false;
	int takeOver=0;
	
	StringBuffer result = new StringBuffer();
	
	a = new StringBuffer(a).reverse().toString();
	b = new StringBuffer(b).reverse().toString();
	
	if(a.length()>b.length()){
		for(int i = b.length(); i < a.length(); i++){
			b+="0";
		}
		} else if (a.length() < b.length()) {
			for(int i = a.length(); i < b.length(); i++){
				a+="0";
		}
		}
	System.out.println(Integer.valueOf(a.charAt(0)+""));
	for(int i = 0; i < a.length(); i++){
		int sum = Integer.valueOf(a.charAt(i)+"") + Integer.valueOf(b.charAt(i)+"");
		if(sum + takeOver >= 10){
			if(i == a.length()-1){
				over = true;
				
			}
			result.append(sum + takeOver - 10);
			takeOver = 1;
		}else{
			result.append(sum+takeOver);
			takeOver = 0;
		}
	}
	
	if(over){
		result.append(1);
	}
	System.out.println(result.reverse().toString());
	
	}
	
}

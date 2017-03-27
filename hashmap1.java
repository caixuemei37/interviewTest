public class hashMap1 {
	public static void main(String[] args){
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("f", 3);
	map.put("b", 2);
	map.put("a", 1);
	map.put("e", 6);
	
	List<Map.Entry<String, Integer>> list =
		    new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
	//before sort
	for(int i = 0; i < list.size(); i++){
		String id = list.get(i).toString();
		System.out.print(id + " ");
	}
	System.out.println();
	
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {   
	    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {      
	        //return (o2.getValue() - o1.getValue()); 
	        return (o1.getKey()).toString().compareTo(o2.getKey());
	    }
	});
		
		for(int i = 0; i < list.size(); i++){
			String id = list.get(i).toString();
			System.out.print(id + " ");
		}
	}
}

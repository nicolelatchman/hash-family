public class HashTable {
	private Family[] table = null; 
	private int size; 
	
	public HashTable(int x){
		table = new Family[x]; 
		size = x; 
	}
	
	public void addFamily(int birthday, Family x){
		if (table[birthday] == null){
			table[birthday] = x;
		}
		else if (birthday == size){
			birthday = 0; 
			addFamily(birthday, x); 
		}
		else addFamily(birthday+1, x); 
	}
	
	public void printTable(){ 
		for (int i = 0; i<size; i++){
			if (table[i] != null){
				System.out.println((table[i].toString())+" ");
			}
		}
	}
	
	public void findFamily(int birthday, String name){
		if (table[birthday].getName().equalsIgnoreCase(name)){
			System.out.println(table[birthday].toString()+" ");
		}
		else findFamily(birthday+1, name); 
	}
}

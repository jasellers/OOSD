package Database;
import java.util.*;
//Jacob Sellers
//00595842
//Utilizes a hashmap with key value pairs to make storage and search easier

public class Databasemain {

	//Assumes that it is being sent the Key as String A and Value as String B
	//HashMap storage = new HashMap();//Creates a new hashmap
	public static void main(String A, String B){
		HashMap<String,Object> storage = new HashMap<String,Object>();//Creates a new hashmap
		storage.put(A,B);				//creates new key,value pair with strings A,B
		// putting in random entries to test 
		storage.put("key1", 1);
		storage.put("key2", 2);
		storage.put("key3", 3);
		//a way to recursively print what is in the database
		Set set = storage.entrySet();
		
		Iterator i = set.iterator();
		
		while (i.hasNext()){
			Map.Entry test = (Map.Entry)i.next();
			System.out.print(test.getKey() + ": ");
			System.out.println(test.getValue());
		}
		
		
		
		
	}
}

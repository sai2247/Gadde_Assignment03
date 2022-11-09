package Question15;

import java.util.HashMap;
import java.util.Hashtable;

public class Question15 {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();//not synchronized
		hashMap.put(null, null);//allow null key for one time
		
		Hashtable<String, String> hashtable = new Hashtable<>();//synchromized
		hashtable.put(null, null);//not allow null key/value
	}

}

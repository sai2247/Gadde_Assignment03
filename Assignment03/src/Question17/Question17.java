package Question17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class Question17 {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, Movie> movies = new ConcurrentHashMap<>();
		movies.put(1, new Movie("RRR", 2022));
		movies.put(2, new Movie("Bahubali", 2019));
		//fail safe
		Iterator<Integer> keys = movies.keySet().iterator();
				
		while(keys.hasNext()) {
			System.out.println(movies.get(keys.next()));
			movies.put(3, new Movie("Yamadonga", 2007));
		}
		System.out.println("---------------------------------------------");
		
		Map<Integer, Movie> movies1 = new HashMap<>();
		movies1.put(1, new Movie("RRR", 2022));
		movies1.put(2, new Movie("Bahubali", 2019));
		//fail fast
		Iterator<Integer> keys1 = movies1.keySet().iterator();
				
		while(keys1.hasNext()) {
			System.out.println(movies.get(keys1.next()));
			movies1.put(3, new Movie("Yamadonga", 2007));//java.util.ConcurrentModificationException
		}
	}
}




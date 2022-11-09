package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Question14 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("RRR");
		names.add("Bahubali");
		List<String> synNames = Collections.synchronizedList(names);//synchronizing list using collections  
		System.out.println(synNames);
		
      
		
		// second way of making array list synchronized using copyOnwriteArrayList
		
		CopyOnWriteArrayList<String> al  = new CopyOnWriteArrayList<String>();
        al.add("NTR");
        al.add("prabhas");
        Iterator<String> it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        
       

		
	}


}

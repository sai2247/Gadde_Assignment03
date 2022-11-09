package Package1;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("RRR");
//		names.add(123);//generics will allow hybrid data
		
		String s = names.get(0);//generics no need any type conversion
		System.out.println(s);
		
		//any type of data can be inserted to collections without generics
		//And we need convert while fetching data, need to know type of data 
		List list = new ArrayList();
		list.add(123);
		list.add("name");
		
		int i = (int) list.get(0);
		System.out.println(i);
	}

}



package Question6;

public class Question6 {
	public static void main(String[] args) {
		String s= "hello string";
		s.concat(" hi");
		StringBuffer sf = new StringBuffer("hello stringbuffer");
		sf.append(" hi");
		
		System.out.println(s);//hello string
		System.out.println(sf);//hello stringbuffer hi
		//hence string is not changed
		//stringbuffer is changable
		
		
		
	}

}

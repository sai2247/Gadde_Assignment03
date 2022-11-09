package Question13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Question13 {public static void main(String[] args) {
	Vector<String> vector = new Vector<String>();//syncronized
	Enumeration<String> enumeration = vector.elements();//uses enumeration to iterate
	
	
	List<String> list = new ArrayList<String>();//not synchronized
	Iterator<String> iterator = list.iterator();//uses iterator to to iterate
}
}

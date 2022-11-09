package Question5;

public class Question5 {
	public static void main(String[] args) {
		// all methods in StringBuffer are synchronized
		// all methods in StringBuilder are not synchronized

		//stringBuilder is more faster  than compared to stringBuffer

		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Buffer ");
		for (int i = 0; i < 100000; i++) {
			sb.append("hello");
		}
		//11ms
		System.out.println("StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("Builder");
		for (int i = 0; i < 100000; i++) {
			sb2.append("Hello");
		}
		//04ms
		System.out.println("StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}



}

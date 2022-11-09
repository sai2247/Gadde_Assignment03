package question26;

public class Question26 {

	
	private static volatile Question26 obj = null;
	
	
	
	private Question26() {
	}
	
	
	
	
	
	
	public static Question26 getInstance() {
		if (obj == null) {
			synchronized (Question26.class) {
				if (obj == null) {
					obj = new Question26();
				}
			}
		}
		return obj;
	}
}

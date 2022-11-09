package Question29;

public class Question27 {
	private static volatile Question27 obj = null;

	// private constructor to not allow create objects outside of this class
	private Question27() {
	}

	public static Question27 getInstance() {
		if (obj == null) {
			//this block will make sure at time only one thread execute below to create object of this class
			synchronized (Question27.class) {
				if (obj == null) {
					obj = new Question27();
				}
			}
		}
		return obj;
	}

}

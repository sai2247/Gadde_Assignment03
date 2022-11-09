package Question24;

public class Question24 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called, hence garbage collector triggered");
	}
	
	
	public static void main(String[] args) {
		Question24 question24 = new Question24();
		System.out.println("calling garbage collector before making null");
		System.gc();
		question24=null;
		System.out.println("calling garbage collector after making null");
		System.gc();
	}

	

	}

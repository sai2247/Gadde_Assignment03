package Question25;

public class Question25A {
	public static void main(String[] args) {
		
		
	Runnable r = ()->{
			System.out.println("runnable interface with lambda expression");
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}

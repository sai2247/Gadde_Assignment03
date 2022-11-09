package Question23;

public class Question23 {
	public static void main(String[] args) {
		//Immutable, we cant modify once the value is assigned to it
		
		//String is immutbale and thread safe, no matter how many threads accessing the object at time, cant modify
		String name = "Bahubali";
		name.concat("-The Begining");
		System.out.println("Main : "+name);
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				name.concat("t1");
				System.out.println("Thread1 : "+name);
			}
		});
		
Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				name.concat("t2");
				System.out.println("Thread2 : "+name);
			}
		});
		t1.start();
		t2.start();
	}

}




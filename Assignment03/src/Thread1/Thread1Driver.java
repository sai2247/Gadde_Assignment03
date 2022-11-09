package Thread1;

public class Thread1Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread1 t1 = new Thread1 ();
		// There is no Start method in runnable interface.
		Thread t1  = new Thread (new Thread1());
		t1.start();
		// 18) example fotr creating a Thread Twice 
		t1.start();
	}

}

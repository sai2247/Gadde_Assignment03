package Question20;

public class Question20 {
	public static void main(String[] args) throws InterruptedException {
		// A thread can be in one of the following states:
//		NEW
//		A thread that has not yet started is in this state.
//		RUNNABLE
//		A thread executing in the Java virtual machine is in this state.
//		BLOCKED
//		A thread that is blocked waiting for a monitor lock is in this state.
//		WAITING
//		A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
//		TIMED_WAITING
//		A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
//		TERMINATED
//		A thread that has exited is in this state.

		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		System.out.println("t1 state: " + t1.getState());// NEW
		t1.start();
		// RUNNABLE
		System.out.println("t1 state before main sleep : " + t1.getState());
		Thread.sleep(3000);
		System.out.println("t1 state after main sleep : " + t1.getState());// TIMED_WAITING
		Thread.sleep(2000);
		System.out.println("t1 state after 2 main sleep : " + t1.getState());// TERMINATED

	}
}

class MyThread implements Runnable {
	public void run() {

		// try-catch block
		try {
			// moving thread t2 to the state timed waiting
			Thread.sleep(5000);
			// RUNNABLE
			System.out.println("t1 in run(), state: " + Thread.currentThread().getState());

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}
}


	
	
	
	
	
	
	
	
	

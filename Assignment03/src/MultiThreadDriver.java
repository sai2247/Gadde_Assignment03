
public class MultiThreadDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MultiThreadDemo t1= new MultiThreadDemo();
		
		for (int i =1;i<15;i++) {
			System.out.println("inside thread");
			Thread.sleep(1000);
		}
		t1.sayhi();
t1.sayhello();
t1.start();
//t1.run();
	}

}

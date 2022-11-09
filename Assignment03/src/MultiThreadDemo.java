
public class MultiThreadDemo extends Thread{
	
	public void sayhi() throws InterruptedException {
		for (int i=0;i<15;i++) {
		System.out.println("hii");
		Thread.sleep(1000);
		}
	}
	public void sayhello() {
		for (int i=0;i<15;i++) {
		System.out.println("hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			for (int i=0;i<15;i++) {
				System.out.println("byeeee");
				}
			
		}
		

}

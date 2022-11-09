package Question10;

import java.io.InterruptedIOException;

public class Question10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Below is allowed
	@Override
	public void printHello(){
		System.out.println("Hello Child");
	}
	
	//Below is not allowed
//	@Override
//	public void printHello() throws Exception {
//		System.out.println("Hello Child");
//	}
	
	// Below not allowed, subclass can modify throws but it should be same level or child of parent menthod exception 
	@Override
	public void printHello() throws InterruptedIOException {
		System.out.println("Hello Child");
	}

}




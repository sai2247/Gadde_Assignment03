package KeyWord;

public class Employee  extends StudentEmployee {
	
	// here we are  getting an error due to declaring  StudentEmployee class as final.
	// So we are unable to extend the StudentEmployee class 
	
//	public  int calcSalary () {
//		  ;
//	}
		
	public static void main(String[] args) {
		StudentEmployee se1 = new StudentEmployee();
	

	try {
		
	}finally {
		// block of code will execute at any cost 
	}
}
	
	@Override
	protected void finalize() throws Throwable {
		//will called by GC before clearing object
		//it may lead to deadlocks and hangs
	}

}
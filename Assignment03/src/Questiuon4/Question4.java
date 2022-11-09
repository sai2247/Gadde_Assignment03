package Questiuon4;

public class Question4 {
	public static void main(String[] args) {
		Question4 question4 = new Question4();
		question4.printPrivate();//private child
		question4.printStatic();//static child
		
		question4.printNotStatic();//not static child
		
		
		// We can't override private, private scope is limited to class only
		// We can't override static, those are at class level
		}
	
//	@Override // not allowed
	public static void printStatic() {
		System.out.println("static child");
	}
	
//	@Override // not allowed
	private void printPrivate() {
		System.out.println("private child");
	}
	
//	@Override
	public void printNotStatic() {
		System.out.println("not static child");
	}

}

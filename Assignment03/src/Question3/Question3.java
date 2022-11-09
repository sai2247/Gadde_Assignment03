package Question3;

public class Question3 extends Question3Super {
	
	
	
	//While overrding , we can change the return type of method to its child types, not for parent types
		@Override
		public  B covariantType() {
			return new B ();
		}

		
		//not allowed, The return type is incompatible with Question3Super.covariantType()
		
//		@Override
//		public A covariantType() {
//			return new A();
//		}
	}



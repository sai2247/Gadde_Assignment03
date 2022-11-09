package Question2;

public class Question2 extends Question2Super {
	//private we cannt override
	
		//Cannot reduce the visibility of the inherited method from Question2Super
		//public - we cannt change the scope
		void methodPublic() {

		}
		
		//default scope can be changed to protected and public
		@Override
		protected void methodDefault() {

		}
		
		//protected scope can be changes to public
		@Override
		public 	void methodProtected() {

		}

}

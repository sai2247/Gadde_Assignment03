package KeyWord;

public  class StudentEmployee  {
	
	// Declaring  StudentEmployee class as final 
	
	private String name;
	private String id;
	private int  hours;
	
	private final  int Salary = 12;
	// if we declare the varible as final we cannot able to change its value and we are unable
	//to write setter method for salary
	
	public StudentEmployee() {
		
	}
	public StudentEmployee(String name, String id,int hours) {
		
		this.name = name;
		this.id = id;
		this.hours=hours;
	}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return Salary;
	}
	public  int calcSalary () {
		return hours*Salary  ;
	}
	
	
	@Override
	public String toString() {
		return "StudentEmployee [name=" + name + ", id=" + id + ", Salary=" + Salary + hours+"]";
	}
	
	public static void main(String[] args) {
		StudentEmployee se1 = new StudentEmployee();
		System.out.println(se1.getName());
		
	}

}

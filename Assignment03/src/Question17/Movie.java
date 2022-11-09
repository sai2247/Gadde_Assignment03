package Question17;

public class Movie {
	private String name;
	private long year;
	
	
	public Movie(String name, long year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}
	
	public Long getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + "]";
	}
	
	
	

}

package Question21;
import java.io.Serializable;

public class MovieSer {
private static final long serialVersionUID = 2674717793940637704L;
	
	private String name;
	private long year;
	
	
	public MovieSer(String name, long year) {
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





public class Movie extends Entertainment {
	
	private String Duration;

	public Movie(String duration) {
		super();
		Duration = duration;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}
	
	public void Movie_spec() {
		System.out.println("Duration: "+ Duration);
	}
	

}

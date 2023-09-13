
public class Series extends Entertainment {
private int Seasons;
private String Platform ;


public Series() {
	super();
}
public Series(String title, String language, String genre, int ratings) {
	super(title, language, genre, ratings);
}
public Series(int seasons, String platform) {
	super();
	Seasons = seasons;
	Platform = platform;
}
public int getSeasons() {
	return Seasons;
}
public void setSeasons(int seasons) {
	Seasons = seasons;
}
public String getPlatform() {
	return Platform;
}
public void setPlatform(String platform) {
	Platform = platform;
}

public void Series_specs() {
	System.out.println("Seasons:"+ Seasons);
	System.out.println("Platform: "+ Platform);
	
}
}


public class Entertainment {
	
	public String Title;
	public String Language;
	public String Genre;
	public int Ratings;
	
	
	public Entertainment() {
		super();
		
	}
	public Entertainment(String title, String language, String genre, int ratings) {
		super();
		Title = title;
		Language = language;
		Genre = genre;
		Ratings = ratings;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public int getRatings() {
		return Ratings;
	}
	public void setRatings(int ratings) {
		Ratings = ratings;
	}
	
	public void Specs() {
		System.out.println("Title: " + Title);
		System.out.println("Language: "+ Language);
		System.out.println("Genre: "+ Genre);
		System.out.println("Rating"+ Ratings);
		
}
	

}

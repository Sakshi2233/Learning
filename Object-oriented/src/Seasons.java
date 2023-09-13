
public class Seasons extends Series {
	
	private int Episodes;
	private int Releasing_date;
	public Seasons(int episodes, int releasing_date) {
		super();
		Episodes = episodes;
		Releasing_date = releasing_date;
	}
	public int getEpisodes() {
		return Episodes;
	}
	public void setEpisodes(int episodes) {
		Episodes = episodes;
	}
	public int getReleasing_date() {
		return Releasing_date;
	}
	public void setReleasing_date(int releasing_date) {
		Releasing_date = releasing_date;
	}
	
	public void Seasons_specs() {
		System.out.println("Episodes"+ Episodes);
		System.out.println("Releasing_date: "+ Releasing_date);
	}

}

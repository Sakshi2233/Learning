
public class TestEntertainment {

	public static void main(String[] args) {
		Entertainment e=new Entertainment("ZNMD", "Hindi", " Comedy", 9);
		e.Specs();
		
		Movie m=new Movie("2.5 hrs");
		m.Movie_spec();
		
		Entertainment e1 =new Entertainment("NHIE", "English", " Comedy", 9);
		e1 .Specs();
		
		Series s = new Series(8,"Netflix");
		s.Series_specs();
		
		
		Seasons s1= new Seasons(9,23/5/23);
		s1.Seasons_specs();
		
		
		
		

	}

}

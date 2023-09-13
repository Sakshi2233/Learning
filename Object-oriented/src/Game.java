
public class Game {
	String Name;
	String Type;
	String Genre;
	
	public Game(String name, String type, String genre) {
		super();
		Name = name;
		Type = type;
		Genre = genre;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}
	
	public void specs() {                                //function
		System.out.println("Name: " + Name );
		System.out.println("Type: " + Type );
		System.out.println("Genre: " + Genre );
	}
	
	public static void main(String[] args) {
		Game G= new Game("ABC", "Single Player","Action");              //object
		G.specs();
	}
	
	

}

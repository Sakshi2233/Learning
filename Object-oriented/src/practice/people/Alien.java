package practice.people;
public class Alien extends People {
	
	public int Visa;

	public Alien(int visa) {
		super();
		Visa = visa;
	}

	public int getVisa() {
		return Visa;
	}

	public void setVisa(int visa) {
		Visa = visa;
	}
	
	public void Alien_spec() {
		System.out.println("Visa No: "+ Visa);
	}

}

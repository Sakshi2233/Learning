package practice.people;
public class Citizen extends People {
	
	public int Passport_No;

	public Citizen(int passport_No) {
		super();
		Passport_No = passport_No;
	}

	public int getPassport_No() {
		return Passport_No;
	}

	public void setPassport_No(int passport_No) {
		Passport_No = passport_No;
	}
	
	
	public void Citizen_info() {
		System.out.println("Passport No: " + Passport_No);
	}
	

}

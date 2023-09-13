package practice.people;

public class People {
	public String Name;
	public String Country;
	
	
	
	public People() {
		super();
		
	}

	public People(String name, String country) {
		Name = name;
		Country = country;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	public void Info() {
		System.out.println("Name :" + Name);
		System.out.println("Country :" + Country);
//		if(Country=="India") {
//			System.out.println();
//			
//		}
	}
	
	
	
	
	
}

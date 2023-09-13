import practice.people.Alien;
import practice.people.Citizen;
import practice.people.People;

public class TestPeople {

	public static void main(String[] args) {
		
		People p= new People("Sakshi","India");
		p.Info();
		
		Citizen c=new Citizen(1234);
     	c.Citizen_info();
     	
     	People p1= new People("Oliver","Paris");
		p1.Info();
		Alien a=new Alien(789);
		a.Alien_spec();
		
     	
     	
		
//		if(p.Country=="India") {
//			Citizen c=new Citizen(1234);
//			c.Citizen_info();
//			}
//		else {
//		
//				Alien a=new Alien(789);
//		a.Alien_spec();
//		}
		
	} }

import com.ey.emp.Clerk;
import com.ey.emp.Employee;
import com.ey.emp.Manager;

public class TestEmployee {
	
	public static void main(String[] args) {
//		Employee e1= new Employee("polo",4000);
//		e1.paysslip();
//		System.out.println(e1.getSalary());
		
//		Employee e2=new Employee("lili",3000);
//		e2.paysslip();
		
		Manager m1=new Manager("Mike",5000,2000);
		//m1.paysslip();
		//System.out.println("manager salary: "+ m1.getSalary());
		
		Clerk c1=new Clerk("ben",3000,1000);
		//c1.paysslip();
		//System.out.println("clerk salary: "+ c1.getSalary());
		
		showSalary(m1);
		showSalary(c1);               
		
	}//polymorphism
	private static void showSalary(Employee e) {
		if(e instanceof Manager) //instanceof operator is used to test whether the object is an
                       			//instance of the specified type (class or subclass or interface).
		{ 
			System.out.println("manager salary: "+ e.getSalary());
		}
		else
			System.out.println("clerk salary: "+ e.getSalary());
	}
//function overloading
//	private static void showSalary(Clerk c1) {
//		
//		System.out.println("clerk salary: "+ c1.getSalary());
//		
//	}
//
//	private static void showsalary(Manager m1) {
//		System.out.println("manager salary: "+ m1.getSalary());
//		
//	}
	
	

}

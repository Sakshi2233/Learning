
public class Customer {
	private int id;
	private String name;
	private double creditlimit;
	
	public Customer() {
		
	}

	public Customer(String name, int creditlimit) {
		super();
		this.id = id;
		this.name = name;
		this.creditlimit = creditlimit;
	}
	
	public void getCreditLimit() {
		System.out.println("ID: "+ id);
		System.out.println("Name: "+name);
		System.out.println("Creditlimit"+creditlimit);
	}

	public double getCreditlimit() {
		return creditlimit;
	}

	
}

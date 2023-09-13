
public class Robot {
	
	private String Type;
	private  String energy;
	private  String function;
	public Robot(String type, String energy, String function) {
		super();
		Type = type;
		this.energy = energy;
		this.function = function;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getEnergy() {
		return energy;
	}
	public void setEnergy(String energy) {
		this.energy = energy;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	
	
	
	
	public void Robot_specs() {
		
		System.out.println("Type: " + Type );
		System.out.println("Energy: " + energy );
		System.out.println("Function: " + function );
	}
	public static void main(String[] args) {
		Robot r=new Robot("Industrial","21,915 kWh","Manufacturing");
		r.Robot_specs();
	}
	
	}


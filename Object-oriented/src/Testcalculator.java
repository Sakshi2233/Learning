
public class Testcalculator {

	public static void main(String[] args) {
		Calculator c1= new Calculator(10);
		
		c1.add(8);
		c1.result();
		
		c1.sub(9);
		c1.result();
		
		c1.multiply(6);
		c1.result();
		
		c1.divide(6);
		c1.result();
	}

}

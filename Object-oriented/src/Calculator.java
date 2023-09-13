
public class Calculator {
	private double total;

	
	

public Calculator() {
	
}
public Calculator(double total) {
		super();
		this.total = total;
		
		}

public void result() {
	System.out.println("Total:" +total);
}

public void add(int num) {
	total+=num;
}

public void sub(int num) {
	total-=num;
}

public void multiply(int num) {
	total*=num;
}

public void divide(int num) {
	total/=num;
}










}
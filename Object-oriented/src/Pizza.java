
public class Pizza {
	
	String Pizza;
	String topping;
	String Category;
	String Crust;
	String Size;
	int Price;
	
	public Pizza(String pizza, String topping, String category, String crust, String size, int price) {
		super();
		Pizza = pizza;
		this.topping = topping;
		Category = category;
		Crust = crust;
		Size = size;
		Price = price;
	}
	
	public String getPizza() {
		return Pizza;
	}
	public void setPizza(String pizza) {
		Pizza = pizza;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getCrust() {
		return Crust;
	}
	public void setCrust(String crust) {
		Crust = crust;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	public void Pizza_type() {
		System.out.println("Pizza Name:" + Pizza);
		System.out.println("Toppings: "+ topping);
		System.out.println("Category: " + Category);
		System.out.println("Crust: "+ Crust);
		System.out.println("Size: "+Size);
		System.out.println("Price:"+Price);
		
		
	}
	
	public static void main(String[] args) {
		
		Pizza p= new Pizza("Margrita","Cheese","Veg","Normal","Regular",109);
		p.Pizza_type();
		
	}
	

}

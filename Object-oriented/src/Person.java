import java.util.Objects;

public class Person {

	private String name;
	private int age;
	public Person() {
		
//		name="anonymous";
//		age= -1;
		
		this("anonymous",-1); //calling another constructor with matching signature

	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;     //this keyword in java represents the object in context
		this.age = age;
	}
	public void print() {
		System.out.println("name: "+ name + "\tAge: "+age);
	}
	
	
//	@Override
//	public String toString() {
//		return "name: "+ name + "\tAge: "+age;
//	}


	//calling the toString()
//		Person p2= new Person();
//		p2.print();
	


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person p) {                 //p2 
		//	Person p=(Person) obj;
			if(this.age==p.age && name.equals(p.name))
				return true;
		}
		return false;
	}


	public static void main(String[] args) {
		//Declaration= Instantiation
		Person p1=new Person("Polo", 21);				
		p1.print();		
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());  //calling the tostring()
		
		Person p2=new Person("MIli",20);
		System.out.println(p2);
		
		System.out.println(p1.equals(p2));
	}}

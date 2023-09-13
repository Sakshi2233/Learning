

class OuterEventImpl implements Event{                             //only one public class with same file name
	public void doSomething() {
		System.out.println("Outer Event implementation");
	}
	
}

public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("Simple Event implementation");
	}
	
	public class InnerEventImpl implements Event{
		
		public void doSomething() {
			System.out.println("Inner Event implementation");
		}
	}
	
	public static class StaticEventImpl implements Event{
		public void doSomething() {
			System.out.println("Static Event implementation");
			}
	}
	public void oneMoreEvent() {
		class NestedEventImpl implements Event{
			
			public void doSomething() {
				System.out.println("Nested Event implementation");
			}
		};                                              
		new NestedEventImpl().doSomething();
	}
	
	public void oneLastEvent() {
		new Event() {                                    //no class name
			public void doSomething() {
				System.out.println("Anonymous Event implementation");
			}
			
		}.doSomething();
	}
	
	public void pakkaLastEvent() {
		
		Event e=()-> System.out.println("Lambda Event implementation");
		e.doSomething();
				
				
		
	}
	
	
	public static void main(String[] args) {
		EventDemo ed = new EventDemo();
		ed.doSomething();
		
		OuterEventImpl oe= new OuterEventImpl();
		oe.doSomething();
		
		InnerEventImpl ie=ed.new InnerEventImpl();                //innereventimpl- class inside class --> ed.new
		ie.doSomething();
		
		EventDemo.StaticEventImpl se = new EventDemo.StaticEventImpl();
		se.doSomething();
		
		ed.oneMoreEvent();
		ed.oneLastEvent();
		ed.pakkaLastEvent();
		
	}

}


public class ChildDemo<S, R> extends Demo<S> {
	
	private R dummy;
	
	public ChildDemo(S data, R dummy) {
		super(data);
		this.dummy=dummy;
	}

	public R getDummy() {
		return dummy;
	}

	public void setDummy(R dummy) {
		this.dummy = dummy;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> cd1= new ChildDemo<String, Integer>("jack",33);
		System.out.println(cd1.getData()+ "\t" + cd1.getDummy());
		
		
	}
}

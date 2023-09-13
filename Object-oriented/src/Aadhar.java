
public class Aadhar {
	private final long uid;
	private final String retina;
	                                                          //immutable -state cannot be changed
	public Aadhar(long uid, String retina) {
		super();
		this.uid = uid;
		this.retina = retina;
	}
	public long getUid() {
		return uid;
	}
	public String getRetina() {
		return retina;
	}
	public String toString(){
		return "Aadhar[uid="+uid+" Retina: "+retina+"]";
	}
	
	
	public static void main(String[] args) {
		Aadhar a= new Aadhar(1233421123,"abc");
		
		System.out.println(a);
	}
}


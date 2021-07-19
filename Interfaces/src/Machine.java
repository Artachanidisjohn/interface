
public class Machine implements Info {

	private int id=7;
	
	public void start() {
		System.out.println("machine started");
	}

	
	public void showInfo() {
		System.out.println("machine's id is: "+id);
	}
	
}

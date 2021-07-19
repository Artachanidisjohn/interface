
public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		machine1.start();
		
		Person person1= new Person("john");
		person1.greet();
		
		Info info1=new Machine();
		info1.showInfo();
		
		Info info2=person1;
		info2.showInfo();
		
		System.out.println();
		
		outputinfo(machine1);
		outputinfo(person1);
		
	}
	
	private static void outputinfo(Info info) {
		info.showInfo();
	}

}

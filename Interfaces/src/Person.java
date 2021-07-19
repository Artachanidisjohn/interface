
public class Person implements Info {

	private String name;
	
	
	 //deksi klik source->generate constructor(to kanei gia emena)
	public Person(String name) {
		              
		this.name = name;
	}

	public void greet() {
		System.out.println("hello there");
	}

	
	public void showInfo() {
		System.out.println("Person's name is: "+name);
		
	}
}

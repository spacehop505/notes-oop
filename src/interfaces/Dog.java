package interfaces;

public class Dog implements Animal {
	private String name;

	public Dog(String name) {
		
		this.name = name;
	}

	@Override
	public void sound() {
		System.out.println("woof" + ", Name: " + name);

	}
}

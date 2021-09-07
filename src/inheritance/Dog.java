package inheritance;

public class Dog extends Animal {

	private String name;

	public Dog(int age, String name) {
		super(age);
		this.name = name;
	}
	
	public void sound() {
		System.out.println("woof" + ", Name: " + name + ", Age: " + super.getAge());

	}

}

package abstraction;

public class Dog extends Animal {
	private String name;

	public Dog(int age, String name) {
		super(age);
		this.name = name;
	}

	@Override
	public void sound() {
		System.out.println("woof" + ", Name: " + name + ", Age: " + super.getAge());

	}
}

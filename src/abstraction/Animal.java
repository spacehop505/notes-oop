package abstraction;

public abstract class Animal {

	private int age;

	public int getAge() {
		return age;
	}

	public Animal(int age) {

		this.age = age;
	}

	public String message() {
		return "Animal";
	}
	
	public abstract void sound();

}

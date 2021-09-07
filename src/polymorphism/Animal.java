package polymorphism;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String message() {
		return "Animal";
	}
}

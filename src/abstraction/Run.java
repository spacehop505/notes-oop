package abstraction;

public class Run {

	public static void main(String[] args) {
		Dog dog = new Dog(2, "Rex");
		dog.sound();
		System.out.println(dog.message());

	}

}

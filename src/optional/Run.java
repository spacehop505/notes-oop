package optional;

import java.util.Optional;

public class Run {

	public static void main(String[] args) {
		Animal dog = new Animal(6,"yellow");

	if(dog.getAge().isPresent()){
		Optional<Integer> optionalInteger = dog.getAge();
		int age = dog.getAge().get();
		System.out.println(optionalInteger);
		System.out.println(age);
	}


	if(dog.getName().isPresent()){
		Optional<String> optionalString = dog.getName();
		String name = dog.getName().get();
		System.out.println(optionalString);
		System.out.println(name);
	}


	}

}

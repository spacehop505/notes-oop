package optional;

import java.util.Optional;

public class Animal {
	private Integer age;
	private String name;


	public Animal(Integer age, String name) {
		this.age = age;
		this.name = name;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Optional<Integer> getAge() {
		return Optional.ofNullable(age);
	}

	public void setAge(int age) {
		this.age = age;
	}


}

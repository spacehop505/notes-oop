package static1;

public class Animal {
	private int age;
	private String name;
	private static String sleep;

	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getSleep() {
		return sleep;
	}

	public static void setSleep(String sleep) {
		Animal.sleep = sleep;
	}



}

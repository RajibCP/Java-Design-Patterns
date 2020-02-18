package Singleton;

public class Person {
	private String name;
	private int age;
	
	private volatile static Person instance = null;
	
	public static Person getInstance() {
		if(instance == null) {
			synchronized (Person.class) {
				instance = new Person();
			}
		}
		return instance;
	}
	
	private Person() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

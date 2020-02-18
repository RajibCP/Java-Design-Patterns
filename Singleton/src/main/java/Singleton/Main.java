package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person tom = Person.getInstance();
		Person harry = Person.getInstance();
		
		System.out.println(tom.toString() + " " + harry.toString());
	}

}

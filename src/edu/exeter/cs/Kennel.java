package edu.exeter.cs;

public class Kennel {

	public static void main(String[] args) {
		
		Dog dog1, dog2;
		dog1 = new Dog("kip", 3);
		dog2 = new Dog("jon", 4);
		System.out.println(dog1);
		dog2.setName("something");
		System.out.println(dog2);
		dog2.setAge(2);
		System.out.println(dog2);
		System.out.println(dog2.humanAge());

	}

}

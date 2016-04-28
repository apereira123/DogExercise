package edu.exeter.cs;

public class Dog {

	public String name;
	public int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	public int humanAge() {
		return age*7;
	}
	
	public String toString() {
		String agestr = Integer.toString(age);
		return name + "'s age is " + agestr + ".";
	}
}

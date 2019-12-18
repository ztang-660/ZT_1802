package com.inner_class;
@FunctionalInterface
interface PersonBuilder{
	Person builderPerson(String name);
}

class Person {
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

public class E26{
	public static void printName(String name, PersonBuilder builder) {
			System.out.println(builder.builderPerson(name).getName());
	}
public static void main (String[] args) {
	
	printName("zhao", name->new Person(name));
	printName("zhao", Person::new);
	}
}
	

}

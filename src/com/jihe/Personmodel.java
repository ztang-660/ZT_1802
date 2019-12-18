package com.jihe;
import java.util.ArrayList;
import java.util.List;

public class PersonModel {
	String name;
	int age;
	String sex;
	public static  void main(String[] args) {


	List<PersonModel> list=new ArrayList<>();
	PersonModel p1=new PersonModel( "zhao qiao",28,"男");
	PersonModel p2=new PersonModel( "zhao qiao",28,"男");
	PersonModel p3=new PersonModel( "zhao qiao",28,"男");
	PersonModel p4=new PersonModel( "zhao qiao",28,"男");
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	
	//old
	for(Personmodel personmodel : list) {
		System.out.println(pm.getName());
	}
	//new 1
	list.stream().map(PersonModel)

	}

}

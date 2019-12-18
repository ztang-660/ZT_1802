package com.io;

import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jhart.Person;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("obj.txt")); 
		Person p1=new Person("Mike",40);
		out.writeObject(p1);
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name="+person.getName());
		System.out.println("age="+person.getAge());
		

	}

}

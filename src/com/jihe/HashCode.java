package com.jihe;

import java.util.HashSet;

import com.jhart.Person;

class person{
	String name;
	int age;
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return name + ":"+age ;
	}
	
}
public class HashCode {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p1=new Person("mickey",17);
		Person p2=new Person("dangduck",15);
		
		HashSet h1=new HashSet();
		
		h1.add(p1);
		h1.add(p2);
		System.out.println(h1);
	}

}

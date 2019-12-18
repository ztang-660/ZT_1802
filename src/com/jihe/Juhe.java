package com.jihe;
import java.util.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小妹");
		list.add("张阳");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=====");
		list.stream().filter(i->i.startsWith("张"))
		.limit(2)
		.forEach(j->System.out.println(j));
				
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合李所以姓张的人:");
		liu3.forEach(j->System.out.println(j));
		System.out.println("=====");rfvgdgxdgbtnhxtwzrQef
		Stream<String>stream1=Stream.of("张三","李四","张小妹","张阳");
		stream1.skip(1)
		.limit(2)
		.forEach(System.out::println);
	}

}

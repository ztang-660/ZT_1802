package com.jihe;
import java.util.ArrayList;
import java.util.Iterator;
public class Deidai_xiugai {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
			list.add("Jack");
			list.add("Annie");
			list.add("Rose");
			list.add("Mickey");
			Iterator it=list.iterator();
			while (it.hasNext()) {
				Object obj= it.next();
				if("Annie".equals(obj)) {
					list.remove(obj);
				}
			}
			System.out.println(list);
		

	}

}

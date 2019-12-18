package com.jihe;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HashMap_test {

	public static void main(String[] args) {
		Map hmap=new HashMap();
		hmap.put("1", "Jockey");
		hmap.put("2", "Charger");
		hmap.put("3", "Hunter");
		System.out.println(hmap);
		
		if (hmap.containsKey("3")) {
			System.out.println("这个双列集合包含键3");
		}
		System.out.println("这个双列集合包含键3的值是"+hmap.get("3"));
			
		
		System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
		System.out.println("这个双列集合中所有键的集合是"+hmap.values());
		//将键为1的值改为Tank
		hmap.replace("1", "Tank");
		System.out.println(hmap);
		//删除键1对应的键key值+value=对entry
		hmap.remove("1");
		System.out.println(hmap);
		
		
		System.out.println();
		//将双列集合map变成单列的键对象集合使用keySet()方法
		Set jianji=hmap.keySet();
		Iterator diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("用键值对集遍历双列集合的键和值");
		
		Set jianzhiduiji=hmap.entrySet();
		Iterator diedai2=jianzhiduiji.iterator();
		while (diedai2.hasNext()) {
			Map.Entry jianzhidui = (Map.Entry) diedai2.next();
			Object key=jianzhidui.getKey();
			Object value=jianzhidui.getValue();
			System.out.println(key+":"+value);
		}
		System.out.println("用foreach键值对集遍历双列集合的键和值");
		hmap.forEach((key,value)->System.out.println(key+":"+value));
		
		System.out.println("用foreach键值对集遍历双列集合的所有值");
		Collection zhiji=hmap.values();
		zhiji.forEach(value->System.out.println(value));
		
		Map map1 =new HashMap();
		map1.put(2, "Charger");
		map1.put(1, "Jockey");
		map1.put(3, "Hunter");
		map1.forEach((key,value)->System.out.println(key+":"+value));
		System.out.println("=============");
		Map map2=new LinkedHashMap();
		map2.put(2, "Charger");
		map2.put(1, "Jockey");
		map2.put(3, "Hunter");
		map2.forEach((key,value)->System.out.println(key+":"+value));
	}
	
		
	
	

}

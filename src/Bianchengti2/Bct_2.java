package Bianchengti2;

import java.util.*;
class Customcomparator implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
		
	}
}

public class Bct_2 {

	public static void main(String[] args) {
		
		Map map=new TreeMap(new Customcomparator());
		tmap.put("1", "Jockey");
		tmap.put("2", "Charger");
		tmap.put("3", "Hunter");

	}

}

package Java_Based;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("Name  ", " Miraz Zaman");
		mapData.put("Address  ", " LIC, NY");
		mapData.put("Email  ", " miraz@zaman.com");
		mapData.put("Phone  ", " (234) 987-9283 ");

		for (Map.Entry<String, String> maps : mapData.entrySet()) {
			System.out.println(maps.getKey() + " " + maps.getValue());
		}
	}

}

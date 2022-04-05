package com.Datas;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

@Test
public class Maps {
	public void maps() {
		Map<String, String> mapData = new HashMap<String, String>();
		mapData.put("Name", "Sarvin");
		mapData.put("Address", "Alaska");
		mapData.put("Phone", "3456789667");
		
		for(Map.Entry<String, String> pnt:mapData.entrySet()) {	
			System.out.println(pnt.getKey()+" "+pnt.getValue());
		}
		mapData.replace("Phone", "234567");
		System.out.println(mapData);
		
		mapData.replace("Phone", "00000");
		System.out.println(mapData);
		
	}

}

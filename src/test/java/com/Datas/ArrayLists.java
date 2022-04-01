package com.Datas;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayLists {

	@Test
	public void aLists() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(3);
	numbers.add(4);
	numbers.add(5);
	numbers.add(6);
	
	int siz = numbers.size();
	System.out.println("Total elements in this list is : "+siz);

	for(Integer num:numbers) {
		System.out.println(num);
	}
	numbers.add(3, 6);
	System.out.println(numbers.toString());
	}
	
}

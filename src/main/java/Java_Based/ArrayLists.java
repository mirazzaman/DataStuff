package Java_Based;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kellie");
		names.add("Anna");
		names.add("Kay");
		names.add("Sam");
		names.add("Karsan");
		names.add("Anitha");
		
		System.out.println("List of Names are in this list : ");
		for(String ArrayData:names) {
			System.err.print(ArrayData+" ");
			
		}
	}

}

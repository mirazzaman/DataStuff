package com.Datas;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider = "data-sheet")
	public void getTestData(String name1, String name2, String name3) {
		System.out.println("First name Set : "+name1+
				"Second name Set : "+name2+
				"Third name Set : "+name3);
		
	}
	@DataProvider(name = "data-sheet")
	public Object[][] dp(){
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Arif";
		data[0][1] = "Sadek";
		data[0][2] = "Amel";
		
		data[1][0]= "Dev";
		data[1][1]= "Kamal";
		data[1][2]= "Afridi";
		
		data[2][0]= "Tawfiq";
		data[2][1]= "Miraz";
		data[2][2]= "Sarvin";
		
		return data;
		
	}

}

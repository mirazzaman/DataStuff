package com.TestNGS;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name = "data_provider")
	public Object[][] myData(){
		
		Object[][] data = new Object[3][3];
		
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		
		data[2][0]=7;
		data[2][1]=8;
		data[2][2]=9;
		
		return data;
	}
	
	@Test(dataProvider = "data_provider")
	public void testData(int set1, int set2, int set3) {
		System.out.println("First Data Set is : "+set1+
				" Second Data Set is : "+set2+
				" Third Data Set is : "+set3);
		
	}
	
	

}

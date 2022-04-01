package com.Datas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class GetExcelData {

	public static void main(String[] args) throws IOException {

		// Path of the excel file
		String path = "/Users/miraz/eclipse-workspace/Data/Data/MyData.xlsx";

		// Refer by the File Input Stream
		FileInputStream file = new FileInputStream(path);

		// Get workbook from the file
		XSSFWorkbook workbook = new XSSFWorkbook(file); // represent WorkBook based on XLS AND XLSX

		// Get WorkSheet for workbook
		XSSFSheet sheet = workbook.getSheet("employee_details");

		// Iterate table data
		int rows = sheet.getLastRowNum(); // To get the rows
		int columns = sheet.getRow(1).getLastCellNum(); // to get the last column

		// Get Table Rows Values
		for (int r = 0; r <=rows; r++) {
			XSSFRow row = sheet.getRow(r);

			// Get Table Columns Values
			for (int c = 0; c < columns; c++) {

				XSSFCell cell = row.getCell(c);

				 System.out.print(cell+" ");
//				switch (cell.getCellType()) {
//				case STRING:
//					System.out.print(cell.getStringCellValue()+" ");
//					break;
//				case NUMERIC:
//					System.out.print(cell.getNumericCellValue()+" ");
//					break;
//				case BOOLEAN:
//					System.err.print(cell.getBooleanCellValue()+" ");
//					break;
//				}
				
			}
			System.out.println();

		}
	}
}

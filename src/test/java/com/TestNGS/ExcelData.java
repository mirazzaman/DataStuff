package com.TestNGS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	public static String sheetsname = "EmployeeData";

	public static void main(String[] args) throws IOException {

		// Path of the excel file
		String filePath = "/Users/miraz/eclipse-workspace/Data/Datas/Employees.xlsx";

		// Refer by the File Input Stream
		FileInputStream inputStream = new FileInputStream(filePath);

		// Get workbook from the file
		XSSFWorkbook workBook = new XSSFWorkbook(inputStream); // represent WorkBook

		// Get WorkSheet for workbook
		XSSFSheet workSheet = workBook.getSheet("EmployeeDetails"); // workBook.getSheetAt(0)

		// Iterate table data
		int tableRows = workSheet.getLastRowNum(); // To get the rows
		int tableColumns = workSheet.getRow(1).getLastCellNum(); // To get the columns columns
		//Get Table Rows Values
		System.err.println("\nAVAILABLE TABLE DATA: \n");
		for (int r = 0; r < tableRows; r++) {
			XSSFRow rows = workSheet.getRow(r);
			//Get Table Columns Values
			for (int c = 0; c < tableColumns; c++) {
				
				XSSFCell cell = rows.getCell(c);
				
				//System.out.print(cell+" ");
				
				switch (cell.getCellType()) {	
				case STRING: System.out.print(" "+cell.getStringCellValue()+" "); break;
				case BOOLEAN: System.err.print(cell.getBooleanCellValue()+" "); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()+" ");break;
				}

			}
			System.out.println();
			//System.out.print(rows.getCell(r));
			//System.out.println(rows.getCell(3));
			
		}

	}
}

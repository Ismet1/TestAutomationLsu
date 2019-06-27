package com.syntax.lsu.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {

	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	
	@Test
	public void readExcelData() throws IOException {
	 fis = new FileInputStream("src\\test\\resources\\test-data\\exceldata.xlsx");
	 workbook = new XSSFWorkbook(fis);
	 sheet=workbook.getSheet("Sheet1");
	 
	int rows = sheet.getPhysicalNumberOfRows();
	int col = sheet.getRow(0).getLastCellNum();
	
	Object[][] data = new Object[rows][col];
	
	for(int i=0; i<rows; i++) {
		for(int j=0; j<col; j++) {
			
			String values=sheet.getRow(i).getCell(j).toString();
			data[i][j]=values;
			System.out.println(values+" ");
			}
		System.out.println();
	};
		
	}	
	
}

package com.syntax.lsu.testCases;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleArrayObj {

	@Test(dataProvider="getData") //dataProvider'a isim tanimlayabilirdik onuda yazabilirdik. Ismi yoksa methodun ismini yazariz buraya.
	public void arrayData(String uName, String pass) {
	
		XSSFWorkbook workbook=new XSSFWorkbook();
	}
	
	
	//baska sayfadaki methodu bu sekilde calistirabiliriz.
	//DataProvider'in bir baska sekli.
	@DataProvider()
	public Object[][] getData() {
		
		return ConstantsArray.getArrayData();
	}
	
	
	
	
//	@DataProvider()
//	public Object[][] getData() {
//		
//		Object [][] data=new Object[2][2];
//		
//		data[0][0]="UserName";
//		data[0][1]="password";
//		
//		data[1][0]="userName1";
//		data[1][1]="password2";
//		
//		return data;
//	}
	
}

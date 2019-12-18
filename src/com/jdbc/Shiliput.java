package com.jdbc;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class Shiliput {

	public static void main(String[] args) {
		FileInputStream fin=new FileInputStream("sjili.xlsx");
		XSSFWORKBOOK Workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		for(int i = 0 ; i < rows ;i ++) {
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell cell=row.getCell(17);
			
			String xuehao=cell.getStringCellvalue();
			System.out.println(xuehao);
			
			XSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			
			XSSFCell cell17=row.getCell(16);
			String you_shili=cell17.getStringCellValue();
			System.out.println(you_shili);
		}

	}

}

package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead18 { // data driven issue

	public static void main(String[] args) throws IOException {
		// 1. file path == excel sheet
		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2. read the excel sheet

		FileInputStream fi = new FileInputStream(f);

		// 3.file format workbook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("data");

//		int a = sheet.getPhysicalNumberOfRows();
//
//		System.out.println("Physical number of rows:" + a);
//
//		Row r = sheet.getRow(2);
//
//		int b = r.getPhysicalNumberOfCells();
//
//		System.out.println("Physical number of cells:" + b);
		
		
		// to get all the values from the excel 
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
		// 
			
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				System.out.println(cell);
				
			}
			
		}

	}

}

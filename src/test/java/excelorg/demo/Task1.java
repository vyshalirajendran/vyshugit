package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 { // framework task 1 and 2

	public static void main(String[] args) throws IOException {
		// 1. File path
		File fin = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2.read the file

		FileInputStream fi = new FileInputStream(fin);

		// 3.file format WorkBook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("data_10");
	

		// 5. to get a row

		int a = sheet.getPhysicalNumberOfRows();

		System.out.println("physical number of rows:" + a);

		// to get a cell
		Row row = sheet.getRow(2);

		int b = row.getPhysicalNumberOfCells();

		System.out.println("Physical number of cells:" + b);
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row2 = sheet.getRow(i);
			
			for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row2.getCell(j);
				
				System.out.println(cell);
				
			}
			
		}

	}

}

package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRead17 {
	public static void main(String[] args) throws IOException {
		// 1. file path == excel sheet
		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2. read the excel sheet

		FileInputStream fi = new FileInputStream(f);

		// 3.file format workbook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("data");

		// to get row

		Row row = sheet.getRow(1);

		// 5.to get a cell

		Cell cell = row.getCell(1);
		System.out.println(cell);

	}
}
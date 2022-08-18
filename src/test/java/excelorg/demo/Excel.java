package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
	public String getFile(int rowno, int cellno) throws IOException {

		// 1. file path == excel sheet
		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2. read the excel sheet

		FileInputStream fi = new FileInputStream(f);

		// 3.file format workbook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("number");

		// to get row

		Row row = sheet.getRow(rowno);

		// 5.to get a cell

		Cell cell = row.getCell(cellno);

		int cellType = cell.getCellType();

		String value = "";

		if (cellType == 1) {

			value = cell.getStringCellValue();

		}

		else if (DateUtil.isCellDateFormatted(cell)) {

			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
			value = sim.format(d);

		} else {
			double d = cell.getNumericCellValue();// 7.876547

			// newDataType ref=(newDataType)oldvariable;// syntax

			long l = (long) d;// downcasting

			value = String.valueOf(l);

		}
		return value;
	}

	public static void main(String[] args) throws IOException {
Excel e=new Excel();
String s=e.getFile(1, 1);
System.out.println(s);
		

	}

}

package excelorg.demo;

import java.io.File;
import java.io.FileOutputStream; // excel write
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelWrite22 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\22ndJune.xls");

		// 1.create the excel

		boolean a = f.createNewFile();
		System.out.println(a);

		// 2. Tyep of workbook

		Workbook w = new HSSFWorkbook();

		// 3.create the sheet

		Sheet s = w.createSheet("");

		// 4. create the row

		Row r = s.createRow(0);

		// 5 create the cell

		Cell c = r.createCell(1);

		// 6 set the value

		c.setCellValue("Polymorphism");

		// 7.updatinh the sheet

		FileOutputStream fout = new FileOutputStream(f);

		w.write(fout);
		System.out.println("Success");

	}

}

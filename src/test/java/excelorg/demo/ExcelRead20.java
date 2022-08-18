package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRead20 {

	public static void main(String[] args) throws IOException {

		// 1. file path == excel sheet
		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");

		// 2. read the excel sheet

		FileInputStream fi = new FileInputStream(f);

		// 3.file format workbook

		Workbook book = new HSSFWorkbook(fi);

		// 4. to get a sheet

		Sheet sheet = book.getSheet("number");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
			//

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();

				// 1====> String ; 0====> Int or date

				if (cellType == 1) {

					String value = cell.getStringCellValue();
					System.out.println(value);

				}

				else if (DateUtil.isCellDateFormatted(cell)) {

					Date d = cell.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
					String value = sim.format(d);
					System.out.println(value);

				}
				else {
					double d = cell.getNumericCellValue();//7.876547
					
					//newDataType ref=(newDataType)oldvariable;// syntax
					
					long l=(long)d;// downcasting
					
					String value = String.valueOf(1);
					System.out.println(value);
					
				}

			}

		}

	}
}

package excelorg.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excelreadwrite22 {

	public static void main(String[] args) throws IOException {

		// 1. File loc

		File f = new File("C:\\Users\\Ashok.Sridhar\\eclipse-workspace\\FrameWork\\target\\Excel\\test_data.xls");
		// 2 read the file

		FileInputStream fin = new FileInputStream(f);

		// 3. Workbook

		Workbook w = new HSSFWorkbook(fin);

		// 4. sheet

		Sheet s = w.getSheet("number");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row row = s.getRow(i);
			

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {

					String value = cell.getStringCellValue();

					if (value.contains("Chennai")) {

						cell.setCellValue("madurai");
						
						FileOutputStream fout = new FileOutputStream(f);
						w.write(fout);

					}
				}

			}

		}

	}

}

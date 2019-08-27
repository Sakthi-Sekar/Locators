package Selenium.com.atmecs.utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.text.html.StyleSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadxlsFile {
	public static void main(String[] args) throws IOException {

		FileInputStream excelFile = new FileInputStream(
				"C:\\Users\\sakthi.sekar\\eclipse-workspace\\com.atmecs.task\\readlocators.xls");
		XSSFWorkbook workbook = new XSSFWorkbook(excelFile);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIt = sheet.rowIterator();
		while (rowIt.hasNext()) {
			Row row = rowIt.next();
			Iterator<Cell> cellIt = row.cellIterator();
			while (cellIt.hasNext()) {
				Cell cell = cellIt.next();
				System.out.println(cell.toString());
			}
			System.out.println();
		}
	}
}

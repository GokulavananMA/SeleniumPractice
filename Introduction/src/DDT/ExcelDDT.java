package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDDT {

	public static void main(String[] args) throws Throwable {

		// path
		FileInputStream path = new FileInputStream("./Data/ddtSheet.xlsx");
		// workbook
		Workbook wb = WorkbookFactory.create(path);
		// sheet
		Sheet sheet = wb.getSheet("Sheet1");
		// row
		Row row = sheet.getRow(2);
		// cell
		Cell cell = row.getCell(1);
		// fetch the data
		String data = cell.getStringCellValue();
		System.out.println(data);
	}

}

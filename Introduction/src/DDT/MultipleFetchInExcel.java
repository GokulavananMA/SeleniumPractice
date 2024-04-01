package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleFetchInExcel {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		// path
				FileInputStream path = new FileInputStream("./Data/ddtSheet.xlsx");
				// workbook
				Workbook wb = WorkbookFactory.create(path);
				// sheet
				Sheet sheet = wb.getSheet("Sheet1");
				// rowcount and cellcount
				int rowCount=sheet.getPhysicalNumberOfRows();
				int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
				for(int i=1;i<rowCount;i++)
				{
					for(int j=0;j<cellCount;j++)
					{
						String data = sheet.getRow(i).getCell(j).getStringCellValue();
						//for interger value in sheet we need to give " ' " in the beginning
						System.out.print(data+" ");
					}
					System.out.println();
				}
				
	}

}

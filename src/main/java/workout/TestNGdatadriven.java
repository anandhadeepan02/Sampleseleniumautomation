package workout;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TestNGdatadriven {

@Test	
public void data() throws IOException {
	
	 XSSFWorkbook book= new XSSFWorkbook("./Utilities/data.xlsx");
	XSSFSheet sheet=book.getSheet("Sheet1");
	int rowcount=sheet.getLastRowNum();
	int columncount=sheet.getRow(0).getLastCellNum();
	for(int i=1;i<=rowcount;i++) {
		XSSFRow row=sheet.getRow(i);
		for(int j=0;j<columncount;j++) {
		XSSFCell cell=row.getCell(j);
		String data=cell.getStringCellValue();
			System.out.println("the row "+i+" of and the cell "+j+" of value"+data);
		}
	}
	
}
	
	
	
	
}

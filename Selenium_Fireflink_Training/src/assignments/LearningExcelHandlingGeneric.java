package assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningExcelHandlingGeneric {
public static void main(String[] args) {
	
}
	public String getDataFromExcelSheet(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("D:\\SELENIUM\\Excel2.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(Sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
}
}

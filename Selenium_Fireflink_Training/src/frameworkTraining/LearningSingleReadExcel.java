package frameworkTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningSingleReadExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		LearningSingleReadExcel l=new LearningSingleReadExcel();
		l.handleExcel();
	}
public void handleExcel() throws EncryptedDocumentException, IOException
	{
	File file=new File("./Testdata/excel1.xlsx");
	FileInputStream fis=new FileInputStream(file);
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet=workbook.getSheet("login");
	int rownum=sheet.getPhysicalNumberOfRows();
	Row row=sheet.getRow(1);
	int cellnum=row.getPhysicalNumberOfCells();
	Cell cell=row.getCell(1);
	
	for(int i=1;i<rownum;i++)
	{
		for(int j=0;j<cellnum;j++)
		{
			String value=(sheet.getRow(i).getCell(j)).toString();
			System.out.print(value+"\t");
		}
		System.out.println(); 
	}	
  }
}

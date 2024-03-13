package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream f1= new FileInputStream("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\webdriverexamples\\\\External data\\\\Excelwriting.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f1);
		XSSFSheet sheet= wb.getSheet("Sheet1");
		
		int rows= sheet.getLastRowNum();
		System.out.println(rows);
		
		int cells=sheet.getRow(1).getLastCellNum();
		
		System.out.println(rows);
		
		for (int i=1;i<rows;i++) 
		{
			XSSFRow noofrow=sheet.getRow(i);
			
			for(int j=1;j<cells;j++) 
			{
				String value=noofrow.getCell(i).toString();
				System.out.print(value+"  ");
			}
			System.out.println();
		}
		wb.close();
		f1.close();

	}

}

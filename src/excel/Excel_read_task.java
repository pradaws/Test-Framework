package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_task {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			
			
			
			FileInputStream f1= new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\External data\\Excelwriting.xlsx");
			
			XSSFWorkbook wb= new XSSFWorkbook(f1);
			XSSFSheet sheet= wb.getSheet("Sheet1");
			
			//How many rows is available
			int rows=sheet.getLastRowNum();
			
			System.out.println(rows);
			
			//How many cells 
			int cells=sheet.getRow(1).getLastCellNum();
			
			System.out.println(cells);
			
			for(int i=1;i<=rows;i++) 
			{
				XSSFRow noofrows=sheet.getRow(i);
				
				for (int j=0;j<cells;j++)
				{
					String value=noofrows.getCell(j).toString();
					System.out.print(value+"  ");
				}
				System.out.println();
			}
			
			wb.close();
			f1.close();

	}

}

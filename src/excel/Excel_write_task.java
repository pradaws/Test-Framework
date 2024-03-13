package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_task {

	
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			FileOutputStream f1=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\External data\\newfile-task.xlsx");
			
			XSSFWorkbook wb= new XSSFWorkbook();
			XSSFSheet sheet=wb.createSheet();
			
			Scanner sc= new Scanner(System.in);
			
			for(int i=0; i<=6;i++)
			{
				XSSFRow r1=sheet.createRow(i);
				
				for(int j=0;j<5;j++) {
					
					System.out.println("Enter value");
					
					String data =sc.next();
					
					r1.createCell(j).setCellValue(data);
					
					
				}
				
				
			}
			wb.write(f1);
			wb.close();
			f1.close();

	}

}

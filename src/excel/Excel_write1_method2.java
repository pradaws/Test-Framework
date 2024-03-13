package excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write1_method2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\External data\\newfile2.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<4;i++)
		{
			XSSFRow r1=sheet.createRow(i);
			
			for(int j=0;j<3;j++) {
				
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

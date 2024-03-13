package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\webdriverexamples\\External data\\newfile1.xlsx");
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet();
		
	    XSSFRow rows=sheet.createRow(0);
	    
	    rows.createCell(0).setCellValue("empName");
	    rows.createCell(1).setCellValue("emp designation");
	    rows.createCell(2).setCellValue("salary");
	    
	    XSSFRow rows1=sheet.createRow(1);
	    rows1.createCell(0).setCellValue("pradeep");
	    rows1.createCell(1).setCellValue("test engineer");
	    rows1.createCell(2).setCellValue("10000");
	    
	    XSSFRow rows2=sheet.createRow(1);
	    rows2.createCell(0).setCellValue("rakesh");
	    rows2.createCell(1).setCellValue("Sr test engineer");
	    rows2.createCell(2).setCellValue("20000");
		

	}

}

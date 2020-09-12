package apachepoidemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


    @Test
    public class writeexcelsheet {
	
	public void writeinsheet() throws Exception {
		
		File file = new File("C:\\Users\\SOFTWARE QA\\Desktop\\New folder\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("hello1");
		sheet1.getRow(1).createCell(2).setCellValue("hello2");
		sheet1.getRow(2).createCell(2).setCellValue("hell03");
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		wb.close();
		
		
	}

}

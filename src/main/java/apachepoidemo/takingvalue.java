package apachepoidemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


    @Test
    public class takingvalue {
	
	public void excelvalue() throws Exception {
		
		
		File file = new File("C:\\Users\\SOFTWARE QA\\Desktop\\New folder\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String Value = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Value);
		
		String Value1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Value1);
		
		
		int totalrow = sheet1.getLastRowNum();
		System.out.println("total row are "+totalrow);
		
		for (int i = 0; i<totalrow; i++) {
			
			String allvalue= sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(allvalue);
			
		}
		
		
		
	}

}

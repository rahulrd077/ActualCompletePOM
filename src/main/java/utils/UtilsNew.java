package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import testBase.Base;

public class UtilsNew extends Base{
	
	public static  String Excel_PATH = " D:\\Workspace\\PageObjectModel\\src\\main\\testcase\\FreeCRM.xlsx" ;
	
	public static Sheet sheet ;
	
	public static Workbook workbook ;
	
	
	
	
	public long Page_load_timeout = 30 ;
	
	
	
	
	public long Implicit_Wait = 30 ;
	
	public void Switch() {
		
		driver.switchTo().frame("mainpanel");
	}
	
	
	public static Object[][] data (String ExcelPath){
		
		FileInputStream file = null ;
		
		try {
			
			file  = new FileInputStream (Excel_PATH);
			
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			
			workbook  = WorkbookFactory.create(file);
		}
		
catch(Exception e) {
			
			e.printStackTrace();
		}
		
		try {
			
			sheet = workbook.getSheet(ExcelPath);
		}
		
catch(Exception e) {
			
			e.printStackTrace();
		}
		
		 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 
		 
		 for(int i = 0 ; i < sheet.getLastRowNum(); i++) {
			 
			 for(int j = 0 ; j <sheet.getRow(0).getLastCellNum(); j++) {
				 
				 data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				 
				 
			 }
		 }
		 
		 return data ;
	}
	
	
	

}

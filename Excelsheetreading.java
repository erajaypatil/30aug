package JavaStudy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelsheetreading {
	
	
	
	@Test
	public void Exceldatareading() throws Exception
	{
		
		File fis=new File("C:\\selinium\\Excellsheet\\Excel.xlsx");
		
		FileInputStream src=new FileInputStream(fis);
		
		XSSFWorkbook wb=new XSSFWorkbook(src);
		
		XSSFSheet sheet1 = wb.getSheetAt(1);
		
	//	String data0 = sheet1.getRow(0).getCell(3).getStringCellValue();
		
	//	System.out.println(data0);//
		
	//	double data1 = sheet1.getRow(0).getCell(2).getNumericCellValue();
		
	//	System.out.println(data1);//
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println(rowcount);
		
		for(int i=0;i<rowcount;i++)
		{
			String totalrows = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(totalrows);
		}
		
		
		
	}

}

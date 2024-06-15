package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel 
{


	public static Object [][] getData() throws IOException 
	{
		
		File file =new File ("./Data/excel.xlsx");
		FileInputStream FIS=new FileInputStream(file );
		XSSFWorkbook workbook=new XSSFWorkbook(FIS);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
			  	int rows= sheet.getLastRowNum();  //give index basic value 0,1,2,3
			  // int row = sheet.getPhysicalNumberOfRows();
			 //  int col = sheet.getRow(0).getPhysicalNumberOfCells();
			   	
			  	int cols=sheet.getRow(0).getLastCellNum();  //give index value and then add +1   0,1,2  +1
			   	System.out.println(rows);
			   	System.out.println(cols);
			   	
				String data[][]=new String[rows+1][cols];
			
			   	for(int i=0; i<=rows   ;i++)
			   	{
			   		XSSFRow row=sheet.getRow(i);
			   		
			   		for(int j=0; j< cols  ;j++)
			   		{
			   			XSSFCell cel=row.getCell(j);
			   			System.out.println(cel);
			   			
			   			data[i][j]=cel.toString();
			   			
			   			
			   		}
			   		
			 
			   	}
				return data;

	}

}

package com.excel.read;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class ExcelManager {

	public void getReadExcelData(int rowNum, int ColNum) throws Exception{
	
		// Convert excel to stream =FileInputStream class

	File file = new File( "./src/test/resources/Login Test data (trial run).xlsx");
	FileInputStream fis = new FileInputStream(file);
	
 	// read excel = Apache POI***********
    // whole excel file as a book>> 
	   
	         Workbook workbook = WorkbookFactory.create(fis); // Create workbook object
	
	          
	       //page as sheet
	       Sheet sheet = workbook.getSheetAt(0);  // Access first sheet ( index 0)
       
	       
	      for(Row row : sheet) { // all row
	       
	       // System.out.printIn("-------" + row.getRowNum()); // row numb
	       
	       for(Cell cell : row)  {// get cell
	    	  
	       // System.out.printIn("Column number = "+cell.getColoumnIndex());
	        	
	        	
				if (row.getRowNum() != 0
	        	&& row.getRowNum()== rowNum
	        	&& cell.getColumnIndex()== ColNum) {
	        		// 2nd all column == loop it to get each column
	        		// cell (row+col)= return data
	        		
	        		String value = cell.getStringCellValue();
	        		System.out.println(value);
	            	
	        	     }
	        	}
	        		
	       }
	        
	}//
	       
	
	public static void main(String[]args) throws Exception {
		
		
		ExcelManager em = new ExcelManager();
		// Row2_Col2==> row2=2-1= 1 & col2=2-1 = 1
		// row & colu,m count by index theory = actual number -1
		// Excel = horizontal(LT to RT) ; Row & Vertical(top to down) : Column
		em.getReadExcelData(1,1);
	
	
	}   
		
	
}

 
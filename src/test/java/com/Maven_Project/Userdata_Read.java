package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Userdata_Read {

	public static void read_Particular_Data() throws Throwable {

		File f = new File("C:\\Users\\balak\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int num = (int) numericCellValue;       //narrowing casting
				System.out.println(num);
				
			}
		}
	
	
	    public static void read_All_Data() throws Throwable {

	    	File f = new File("C:\\Users\\balak\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet sheetAt = w.getSheetAt(0);
			int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	    	for (int i = 0; i < physicalNumberOfRows; i++) {
	    		Row row = sheetAt.getRow(i);
	    		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	    	for (int j = 0; j < physicalNumberOfCells; j++) {
	    		Cell cell = row.getCell(j);
	    		CellType cellType = cell.getCellType();
	    		
	    		if (cellType.equals(CellType.STRING)) {
	    			String stringCellValue = cell.getStringCellValue();
	    			System.out.println(stringCellValue);
	    		}
	    			else if (cellType.equals(cellType.NUMERIC)) {
	    				double numericCellValue = cell.getNumericCellValue();
	    				int num = (int) numericCellValue;       //narrowing casting
	    				System.out.println(num);
	    				
	    			}
				
			}
				
			}
	    	

	    	
	    	
	    	
	}
		
		public static void main(String[] args) throws Throwable {
			read_Particular_Data();
			read_All_Data();
		}
		
		
		
		
		
		
	}
	
	
	


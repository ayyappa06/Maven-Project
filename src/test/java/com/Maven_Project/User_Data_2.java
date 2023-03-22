package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.reporters.jq.Main;

public class User_Data_2 {

	public static void read_Particular_Data() throws Throwable {    //readonlycell

		File f = new File("E:\\ecli[pse worspace 2\\Maven_Project\\userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		Cell cell = row.getCell(0);
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
		
		public static void main(String[] args) throws Throwable {
			read_Particular_Data();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

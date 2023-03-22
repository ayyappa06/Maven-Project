package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Only_Row {
	
	
	
	public static void read_Only_Row() throws Throwable {    //readonlyrow

		File f = new File("E:\\ecli[pse worspace 2\\Maven_Project\\userdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row2 = sheetAt.getRow(3);
		int physicalNumberOfCells = row2.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
		   Cell cell = row2.getCell(i);
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
		read_Only_Row();
	}

}

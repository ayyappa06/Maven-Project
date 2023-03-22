package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class User_Data_Write {
	
	
	public static void Write_Data() throws Throwable {
		
		
	File f = new File("C:\\Users\\balak\\eclipse-workspace\\Maven_Project\\userdata.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("Ayyapan");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("DharmaSastha");
	
	w.getSheet("Ayyapan").getRow(0).createCell(1).setCellValue("SwamySaranam");
	w.getSheet("Ayyapan").createRow(1).createCell(0).setCellValue("AshtaSastha");
	w.getSheet("Ayyapan").getRow(1).createCell(1).setCellValue("Vepampattu");
	w.getSheet("Ayyapan").createRow(2).createCell(0).setCellValue("Kulathupullai");
	w.getSheet("Ayyapan").getRow(2).createCell(1).setCellValue("Balakan");
	
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	w.close();
	}
	public static void main(String[] args) throws Throwable {
		Write_Data();
		
	}

}

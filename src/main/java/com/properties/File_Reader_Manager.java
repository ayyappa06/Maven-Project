package com.properties;

import com.helper.Configuration_Reader;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		
//		 restrict to create object in another class but allows to create the object fro same class
//		ex outside class ls object create panna mudiyathu inside class la panalam
	}
	
	
//	static method
	public static File_Reader_Manager getInstanceFRM() {
		
		File_Reader_Manager frm= new File_Reader_Manager();
		return frm;

	}
	
//	non static method
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
		

	}
	
	
	

}

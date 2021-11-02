package com.configuration;

public class File_reader_manager {
	
	private File_reader_manager(){
		
	}

	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		
		return cr;

	}
	
	public static File_reader_manager getInstanceFRm() {
		
		File_reader_manager frm = new File_reader_manager();
		
		return frm;
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

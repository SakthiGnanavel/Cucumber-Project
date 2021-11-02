package com.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {
		p = new Properties();

		File f = new File("C:\\Users\\SAKTHI\\eclipse-workspace\\Adactin_Project\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p.load(fis);

		
		
	}
	
	public String getUrl() throws Throwable {

		
		String url = p.getProperty("geturl");

		return url;
	}

	public String username() throws Throwable {

		

		String username = p.getProperty("username");

		return username;

	}

	public String password() throws Throwable {
		

		String password = p.getProperty("password");

		return password;

	}

}

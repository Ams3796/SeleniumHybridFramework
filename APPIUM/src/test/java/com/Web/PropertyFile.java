package com.Web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public String read_prop(String Key) throws FileNotFoundException
	{
	
		FileInputStream fis=new FileInputStream(AutoConstantapp.PropertyFile);
		Properties prop=new Properties();
		String value = prop.getProperty(Key);
		System.out.println(value);
		return value;
		
	}

}

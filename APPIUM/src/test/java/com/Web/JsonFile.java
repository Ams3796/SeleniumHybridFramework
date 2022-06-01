package com.Web;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFile {
	
	public String readDataFromJson(String Key) throws IOException, ParseException
	{
		FileReader inputfile=new FileReader(AutoConstantapp.JsonFile);
		JSONParser parser=new JSONParser();
		Object obj = parser.parse(inputfile);
		HashMap jobj=(HashMap) obj;
		String value = jobj.get(Key).toString();
		
		
		return Key;
		
		
	}

}

package com.syntax.lsu.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static String getProperty(String key){
		
		Properties prop = new Properties();
		try {
			prop.load( new FileInputStream(ConstantsReader.PROPERTIES_FILE_PATH));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		
	}
}

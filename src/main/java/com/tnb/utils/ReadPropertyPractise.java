package com.tnb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadPropertyPractise {

	private static Properties property = new Properties();
	private static Map<String, String> CONFIGMAP = new HashMap<>();

	static {
		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config/config.properties");
			property.load(file);
			
			property.entrySet().forEach(entry -> 
			CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static String getPropValue(String key) throws IOException {
		//return property.getProperty(key);	
		return CONFIGMAP.get(key);
	}

}

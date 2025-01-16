package com.tnb.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.tmb.constants.FrameworkConstants;
import com.tmb.enums.ConfigProperties;

public final class PropertyUtils {

	private PropertyUtils() {}

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIGMAP = new HashMap<>();

	static {
		FileInputStream file;
		try {
			file = new FileInputStream(FrameworkConstants.getConfigFilePath());
			property.load(file);
			
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()).trim());
			}
			
	//property.entrySet().forEach(entry -> CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())));
			 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static String getValue(ConfigProperties key) throws Exception {
		String key1 = key.name().toLowerCase();
		if (Objects.isNull(key1) || Objects.isNull(CONFIGMAP.get(key1))) {
			throw new Exception("Property name " + key+ " is not found. Pls check config.properties");
		}

		return CONFIGMAP.get(key1);
	}


	public static String get(String key) throws Exception {
		if (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {
			throw new Exception("Property name " + key+ " is not found. Pls check config.properties");
		}

		return property.getProperty(key);
	}

}

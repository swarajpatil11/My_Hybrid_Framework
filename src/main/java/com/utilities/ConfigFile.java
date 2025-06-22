package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigFile {
	public static String ReadConfig(String key) throws Exception {
		
		
		String path = System.getProperty("user.dir")+"/src/main/resources/Config.properties";
		FileInputStream file = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(file);
				return pro.getProperty(key);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

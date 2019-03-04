package com.etsy.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties configFile;

	static {

		try {
			String path = "./src/test/resources/com/etsy/testdata/configuration.properties";
			FileInputStream input = new FileInputStream(path);

			configFile = new Properties();
			configFile.load(input);
			input.close();
		} catch (Exception e) {
			System.out.println("Check the FileInputStream");
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}

}

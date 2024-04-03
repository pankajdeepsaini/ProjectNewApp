package UtilitiesFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {
	Properties pro;
	
	String path="C:\\Users\\panks\\Contacts\\FirstCryProjectDDF\\Configuration\\config.properties";
	

	public ReadConfiguration() {
		FileInputStream fis = null;
		
		pro = new Properties();
		
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public String geturl() {
			String s1 = pro.getProperty("url");
			if(s1!=null) {
				return s1;
			}
			else {
				throw new RuntimeException("url not found");
			}
		}
		
		public String getbrowser() {
			String s2 = pro.getProperty("browser");
			if(s2!=null) {
				return s2;
			}
			else {
				throw new RuntimeException("browser not found");
			}
		
	}
}


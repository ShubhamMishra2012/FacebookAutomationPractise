package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties pro;
	
	public readConfig()
	
	{
		File src = new File("./Configurations//Config.properties");
		try{
		FileInputStream fis= new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e){
			
			System.out.print("Exception is "+ e.getMessage());
		}}
		
		public String GetapplicationURL()  
		{
			String URL = pro.getProperty("BaseURL");
			return URL;
				}
		

		public String Username()  
		{
			String Username = pro.getProperty("EmailOrPhone");
			return Username;
				}
		

		public String Password()  
		{
			String Password = pro.getProperty("Password");
			return Password;
				}
		

		public String Firefoxpath()  
		{
			String FFpath = pro.getProperty("Firefoxpath");
			return FFpath;
				}
		
		public String Chromepath()  
		{
			String Cpath = pro.getProperty("Chromepath");
			return Cpath;
				}

		
	
}

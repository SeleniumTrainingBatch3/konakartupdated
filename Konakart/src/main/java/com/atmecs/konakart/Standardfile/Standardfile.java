package com.atmecs.konakart.Standardfile;

import java.io.File;

public class Standardfile {

	public final static String Home_file = System.getProperty("user.dir") + File.separator;
	
	public final static String Home_config = Home_file + "drivers" + File.separator;
	public final static String Chrome_config = Home_config + "chromedriver.exe";
	public final static String Firefox_Config = Home_config + "geckodriver.exe";
	
	public final static String Home_Xpath = Home_file + "resources" + File.separator + "locators" + File.separator;
	public final static String Config_Home = Home_file + "resources" + File.separator + "config" + File.separator;
	public final static String Config_File = Config_Home + "config.properties" + File.separator;
	
	
	public final static String Locator_config = Home_Xpath + "locators.properties";
	public final static String Validation_Home = Home_file + "resources" + File.separator + "validationdata" + File.separator;
	public final static String Validation_config =Validation_Home + "validationdata.property";

}

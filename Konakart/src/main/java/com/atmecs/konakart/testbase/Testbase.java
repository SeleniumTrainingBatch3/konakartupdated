package com.atmecs.konakart.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.atmecs.konakart.Standardfile.Standardfile;
import com.atmecs.konakart.utils.ReadLocatorsfile;




public class Testbase {
	public static WebDriver driver;
	public Properties properties;
	String browser;
	String browserName;

	String url;
	
	@BeforeTest
	public void Launch() throws Exception {
		properties = ReadLocatorsfile.loadProperty(Standardfile.Config_File);

		url = properties.getProperty("URL");
        browser = properties.getProperty("Browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Standardfile.Chrome_config);
			driver = new ChromeDriver();
			System.out.println("Chrome browser is started...");
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Standardfile.Firefox_Config);
			driver = new FirefoxDriver();
			System.out.println("Firefox browser is started...");
		}
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		browserName = caps.getBrowserName();
		
		
        
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}


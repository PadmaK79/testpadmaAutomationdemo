package com.mipsdemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mipsdemo.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	static Properties prop;
	//public static String ChromeDriverPath = System.getProperty("user.dir") + "\\mipsdemo1\\setup\\chromedriver.exe";
	public static String propertyFilePath = System.getProperty("user.dir") + "\\configuration\\config.properties";

	@BeforeClass
	public static void set() {
		loadprop();
		System.out.println("I am here in setup");
		try {
			initialization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void loadprop() {
		try {
			prop = new Properties();
			System.out.println(propertyFilePath);
			prop.load(new FileInputStream(propertyFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver initialization() throws IOException {
		
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
//			System.setProperty("webdriver.chrome.driver", Paths.get(System.getProperty("user.dir")).toRealPath()
//					+ "\\src\\test\\resources\\setup\\chromedriver.exe");
			System.setProperty("webdriver.gecko.driver", Paths.get(System.getProperty("user.dir")).toRealPath()
					+ "\\src\\test\\resources\\setup\\geckodriver.exe");
			System.out.println("driver started1");
			driver = new FirefoxDriver();
			System.out.println("driver started");
			} else {
			System.out.println("Invalid browser");
		}
		return driver;
	}
	
	@AfterClass
	public static void closebrowser()
	{
		driver.quit();
	}
	

}

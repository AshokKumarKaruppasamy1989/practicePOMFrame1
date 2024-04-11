package com.baseTest;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;

	public BaseTest() {
		prop = new Properties();
		String path = System.getProperty("user.dir") + "//src/test/resources//configfiles//config.properties";
		FileInputStream file;

		try {
			file = new FileInputStream(path);
			prop.load(file);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public static void initialize() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver.quit();
		}
		
		String url = prop.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

}

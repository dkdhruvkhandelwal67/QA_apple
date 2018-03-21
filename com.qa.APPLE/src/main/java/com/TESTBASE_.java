package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Support_codebase.QA_TEST_util;

public class TESTBASE_ {

	public static WebDriver driver;
	public static Properties prop;

	public TESTBASE_() throws FileNotFoundException
	{
		prop = new Properties();
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\java\\com\\PAGE\\config\\config.properties";
		FileInputStream file = new FileInputStream(otherFolder);
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization(String browser)
	{
		String browserName = prop.getProperty(browser);
		switch(browserName)

		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhruv.khandelwal\\Downloads\\com.qa.APPLE\\com.qa.APPLE\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\dhruv.khandelwal\\Downloads\\com.qa.APPLE\\com.qa.APPLE\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

			break;

		case "ie":
			System.setProperty("webdriver.edge.driver","C:\\Users\\dhruv.khandelwal\\Downloads\\com.qa.APPLE\\com.qa.APPLE\\Drivers\\IEDriverServer.exe");
			driver = new EdgeDriver();
		}

//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
	

	}
	
	public static void wait_method()
	{
		driver.manage().timeouts().pageLoadTimeout(QA_TEST_util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(QA_TEST_util.IMPLICIT_WAIT, TimeUnit.SECONDS);}
	
	}


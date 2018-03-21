package com.qa.PAGE;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TESTBASE_;

public class QA_IPAD__Page extends TESTBASE_{
	
	

	@FindBy(xpath ="//a[@data-analytics-title='mac']")
	static
	WebElement Mac_page;

	@FindBy(xpath ="//a[@data-analytics-title='ipad']")

	static WebElement Ipad_page;

	@FindBy(xpath ="//a[@data-analytics-title='iphone']")
	static WebElement Iphone_page;

	@FindBy(xpath ="//a[@data-analytics-title='watch']")
	static WebElement Watch_page;

	@FindBy(xpath ="//a[@data-analytics-title='tv']")
	static WebElement Tv_page;

	@FindBy(xpath ="//a[@data-analytics-title='music']")
	static WebElement Music_page;

	@FindBy(xpath ="//a[@data-analytics-title='support']")
	static WebElement Support_page;

	@FindBy(xpath ="//a[@data-analytics-title='buy']")
	static WebElement whrto_buy_page;
	
	@FindBy(xpath ="//*[@id=\"main\"]/section[1]/div[1]/div/h2")
	static WebElement name_ipad;

	public QA_IPAD__Page(WebDriver driver) throws FileNotFoundException {
		PageFactory.initElements((TESTBASE_.driver), this);
	}
	
	
		
	public static QA_MAC__Page to_macpage() throws FileNotFoundException
	{   
//		System.out.println("Currect page headline is " + name_ipad.getText());
		Mac_page.click();
		return new QA_MAC__Page(driver);
		}
	}



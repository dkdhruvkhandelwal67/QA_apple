package com.qa.PAGE;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TESTBASE_;

public class QA_HOME__Page extends TESTBASE_{

@FindBy(xpath ="//a[@data-analytics-title='mac']")
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

public QA_HOME__Page() throws FileNotFoundException {
	PageFactory.initElements(driver, this);
}

	
public static QA_IPAD__Page to_ipadpage() throws FileNotFoundException

{
	Ipad_page.click();
	return new QA_IPAD__Page(driver);
	}
}

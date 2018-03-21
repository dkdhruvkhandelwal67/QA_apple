package com.qa.PAGE;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TESTBASE_;

public class QA_SUPPORT__Page extends TESTBASE_{

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

	public QA_SUPPORT__Page(WebDriver driver) throws FileNotFoundException {
		PageFactory.initElements((TESTBASE_.driver), this);
	}
	public static void getpage_title_support()
	{
		System.out.println((TESTBASE_.driver).findElement(By.xpath("//h2")).getText());
		}
		
	public static QA_WHERETOBUY__Page to_whereTobustpage() throws FileNotFoundException
	{
		whrto_buy_page.click();
		return new QA_WHERETOBUY__Page(driver);
}

}

package com.qa.TEST_page;

import java.io.FileNotFoundException;

import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.TESTBASE_;
import com.qa.PAGE.QA_HOME__Page;

@Listeners(Report.Listners_01.class)
public class QA_HOME__Test extends TESTBASE_ {
	
	public QA_HOME__Test() throws FileNotFoundException {
		super();
	}

@Parameters("browser")
@BeforeTest
public static QA_HOME__Page browser_open(String browser) throws FileNotFoundException

{
	initialization(browser);
	return new QA_HOME__Page();
	}

@Test(priority = 1)

public static void next_page() throws FileNotFoundException
{
	QA_HOME__Page.to_ipadpage();}


@AfterSuite
public static void clos_browsers()
{
	driver.quit();}
}

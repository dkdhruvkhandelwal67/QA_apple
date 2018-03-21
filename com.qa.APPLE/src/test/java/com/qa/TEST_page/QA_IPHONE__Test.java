package com.qa.TEST_page;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TESTBASE_;
import com.qa.PAGE.QA_IPHONE__Page;

@Listeners(Report.Listners_01.class)
public class QA_IPHONE__Test extends TESTBASE_{

	public QA_IPHONE__Test() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void waiting() throws InterruptedException
	{wait_method();}
	
	@Test(priority = 1)
	public static void next_page() throws FileNotFoundException
	{
		QA_IPHONE__Page.to_watchpage();}
}

package com.qa.TEST_page;
import java.io.FileNotFoundException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TESTBASE_;
import com.qa.PAGE.QA_IPAD__Page;

@Listeners(Report.Listners_01.class)
public class QA_IPAD__Test extends TESTBASE_{

	public QA_IPAD__Test() throws FileNotFoundException {
		super();
	}
	
	@BeforeClass
	public static void waiting() throws InterruptedException 
	{wait_method();}

	
	@Test(priority = 1)
	public static void next_page() throws FileNotFoundException, InterruptedException
	{
		QA_IPAD__Page.to_macpage();}

}

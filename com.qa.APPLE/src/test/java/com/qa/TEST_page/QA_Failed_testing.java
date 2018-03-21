package com.qa.TEST_page;

import java.lang.annotation.Repeatable;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Report.Listners_01.class)
public class QA_Failed_testing {
	
	@Test(priority =0)
	
	public static void failed_test1()
	
	{
		Assert.assertTrue(false);
	}
	
	
//	@Test(priority =1)
//	
//	public static void failed_test2()
//	
//	{
//		Assert.assertNotNull(null);
//	}
//	
	
}

package com.smriti.firsttestngtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNGTest {

	@BeforeTest
	public void setUp() {
		System.out.println("Test Cases : ");
	}

	@BeforeMethod
	public void before() {
		System.out.println("Starting test case");
	}

	@Test(priority = 0)
	public void testmethod1() throws InterruptedException {
		System.out.println("Priority 0 Test");
	}

	@Test(priority = 1)
	public void testmethod2() throws InterruptedException {
		System.out.println("Priority 1 Test");
	}

	@AfterMethod
	public void after() throws Exception {
		System.out.println("Finished a test case");
	}

	@AfterTest
	public void finishtest() throws Exception {
		System.out.println("Finished all test cases");
	}
}
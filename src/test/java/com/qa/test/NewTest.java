package com.qa.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeSuite
	public static void bs() {
		System.out.println("This happened BeforeSuite");
	}

	@BeforeClass
	public static void bc() {
		System.out.println("This happened BeforeClass");
	}

	@Test
	public void t1() {
		System.out.println("This happened  in t1");
	}
	
	@Test
	public void t2() {
		System.out.println("This happened  in t2");
	}

	@AfterClass
	public static void ac() {
		System.out.println("This happened AfterClass");
	}

	@AfterSuite
	public static void as() {
		System.out.println("This happened AfterSuite");
	}
}

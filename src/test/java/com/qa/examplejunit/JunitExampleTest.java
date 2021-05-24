package com.qa.examplejunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {
	// @Test
	// @BeforeAll, @AfterAll - runs at start and end - these methods must be static!
	// @BeforeEach, @AfterEach - runs before and after each @Test
	// @Disabled - stops the running of that test - general use for debugging (but use with care!)
	
	@BeforeAll
	public static void start() {
		System.out.println("Start of tests\n");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("TEST STARTING");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("TEST ENDING\n");
	}
	
	@Test
	public void test1() {
		System.out.println("Hello World - 1");
	}
	
	@Test
	@Disabled
	public void test2() {
		System.out.println("Hello World - 2");
	}
	
	@AfterAll
	public static void end() {
		System.out.println("\nEnd of tests");
	}
}
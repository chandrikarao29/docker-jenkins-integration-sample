package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

	@Autowired
	private HelloController controller;
	private static WebDriver driver;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();

	}

	@Test
	public void testCase() {

		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver.get("https://google.com");



	}

	@Test
	public void testCase2() {

	}

	@Test
	public void testCase3() {

	}

	@AfterAll
    	public static void cleanUp(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
}
}

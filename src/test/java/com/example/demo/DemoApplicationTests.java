package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Test
	public void testCase() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8080/demo");
		String title = driver.getTitle();
		assertEquals(title, "demo");
	}

	@Test
	public void testCase2() {
	}
}

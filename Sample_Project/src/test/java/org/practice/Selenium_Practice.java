package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Practice {
	
	WebDriver driver;
	
	@Test
	public void tc_001() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");

	}
	
	@Test
	public void tc_002() {
		driver.findElement(By.name("uid")).sendKeys("mngr464832");
		driver.findElement(By.name("password")).sendKeys("AgezatA");
		driver.findElement(By.name("btnLogin")).click();

	}
	@Test
	private void tc_003() {
	
	}

}

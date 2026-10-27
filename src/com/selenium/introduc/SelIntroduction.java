package com.selenium.introduc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> Method close get
		// FireFox - FireFoxDriver -> methods close get
		// WebDriver methods + class methods
		
		// Chromedriver.exe -> Chrome Browser Selenium Browser
		// Step to invoke Chrome Driver //
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//FireFox
//		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\chromedriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
		
		driver.get("https://shivani-light-events-1.onrender.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		

	}

}

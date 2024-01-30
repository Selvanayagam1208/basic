package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorset1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("email")).sendKeys("selva123@gmail.com");
	driver.findElement(By.id("email")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("ambrose123@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("12345");
	driver.findElement(By.name("login")).click();

	}

}

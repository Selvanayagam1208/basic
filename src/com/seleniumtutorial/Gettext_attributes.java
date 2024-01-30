package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext_attributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String text=driver.findElement(By.partialLinkText("?")).getText();
	System.out.println(text);
	String value=driver.findElement(By.partialLinkText("?")).getAttribute("href");
	System.out.println(value);
	driver.findElement(By.id("email")).sendKeys("ambrose123@gmail.com");
	String type=driver.findElement(By.id("email")).getAttribute("value");
	System.out.println(type);
//	driver.findElement(By.id("email")).sendKeys("selva123@gmail.com");
//	driver.findElement(By.id("email")).clear();
//	 Thread.sleep(2000);
//	driver.findElement(By.id("email")).sendKeys("ambrose123@gmail.com");
//	driver.findElement(By.name("pass")).sendKeys("12345");
//	driver.findElement(By.name("login")).click();

	}

}

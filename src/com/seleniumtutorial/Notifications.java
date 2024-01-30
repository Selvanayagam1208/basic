package com.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe";
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("disable-notifications");
		System.setProperty(stringkey,stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}


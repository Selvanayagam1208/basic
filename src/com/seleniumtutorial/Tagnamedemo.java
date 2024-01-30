package com.seleniumtutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
//	WebElement emailfield = driver.findElement(By.id("email"));
//	emailfield.sendKeys("tester");
//	emailfield.clear();
	List<WebElement> links = driver.findElements(By.tagName("input"));
	System.out.println(links.size());
	for(WebElement aa:links) {
		System.out.println(aa.getText()+"========="+aa.getAttribute("id"));
	}
	}

}

package com.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_attribute_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String text=driver.findElement(By.partialLinkText("Cre")).getText();
		System.out.println(text);
		String att=driver.findElement(By.partialLinkText("Log")).getAttribute("href");
		System.out.println(att);
		driver.findElement(By.id("email")).sendKeys("anbt21@@");
		String no=driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(no);
	}

}

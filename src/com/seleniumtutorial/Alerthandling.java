package com.seleniumtutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.drive";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.name("proceed")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();

	}

}

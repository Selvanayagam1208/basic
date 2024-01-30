package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions act = new Actions(driver);
	act.doubleClick(click).build().perform();
//	Alert alt = driver.switchTo().alert();
//	alt.accept();
	}

}

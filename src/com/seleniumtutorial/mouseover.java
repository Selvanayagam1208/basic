package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();)
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	WebElement click = driver.findElement(By.xpath("//img[@loading='lazy'][@alt='Fashion']"));
	//click.click();
	Actions act = new Actions(driver);
	act.moveToElement(click).build().perform();
		}

}

package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlingtnpsc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String parentwindow = driver.getWindowHandle();		
	driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.redbus.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.gmail.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.irctc.co.in");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.WINDOW).get("http://www.ticketnew.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Set<String> child = driver.getWindowHandles();
	List<String> list = new ArrayList(child);
	System.out.println(list.size());
	driver.switchTo().window(list.get(1));
	driver.findElement(By.id("src")).sendKeys("chennai");	
	}
	}



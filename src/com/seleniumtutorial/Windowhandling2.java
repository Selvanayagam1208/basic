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

public class Windowhandling2 {

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
	driver.findElement(By.partialLinkText("Crea")).click();
	driver.findElement(By.name("firstname")).sendKeys("tester");
	String parentwindow = driver.getWindowHandle();	
	driver.findElement(By.id("terms-link"));
	
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.TAB).get("https://www.facebook.com/legal/terms/update");
	Set<String> child = driver.getWindowHandles();
	List<String> list= new ArrayList(child);
	System.out.println(list.size());
	driver.switchTo().window(list.get(1));
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(list.get(0));
	driver.findElement(By.name("lastname")).sendKeys("selenium");
	
	
	
	
	
	


	
	
	}
	}



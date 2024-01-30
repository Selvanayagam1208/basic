package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dropdownsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		List li=new ArrayList();
		List li1=new ArrayList();
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.partialLinkText("Cre")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select se=new Select(month);
	List<WebElement> options = se.getOptions();
	for (WebElement object : options) {
		li.add(object.getText());
	}
	for (Object beforesort : li) {
		System.out.println(beforesort);	
	}
	System.out.println("======================================");
	for (WebElement object : options) {
		li1.add(object.getText());
	}
	Collections.sort(li1);
	for (Object aftersort : li1) {
		System.out.println(aftersort);	
	}
	if(li.equals(li1))
	{
		System.out.println("this is sort order");
	}
	else
	{
		System.out.println("not in sorted order");
	}
	
	
	
	
	}

}

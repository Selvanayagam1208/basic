package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class Webtable4 {
	static String sort;
	public static boolean checkarray(String[]size1, String[]value)
	{
		if(size1==value)
		{
			return true;
		}
		if(size1==null || value==null)
		{
			return false;
		}
		int n=size1.length;
		if(n!=value.length)
		{
			return false;
		}
		for(int i=0;i<n;i++)
		{
			if(!size1[i].equals(value[i]))
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/table");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				
		WebElement table = driver.findElement(By.cssSelector("table.mat-sort"));	
		List<WebElement> allrow=table.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr"));
		int size=allrow.size();
		String[] size1=new String[size];
		for(int i=0;i<size;i++)
		{
			List<WebElement> allvalue = allrow.get(i).findElements(By.tagName("td"));
			size1[i]=allvalue.get(0).getText();
		}
		for (String string : size1) {
			
			System.out.println(string);
		}
		
		System.out.println("====================================================");
		Arrays.sort(size1);

		for (String string1 : size1) 
		{
		System.out.println(string1);
		}
		System.out.println("====================================================");
		
		WebElement sort = driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[1]/div/div[2]/div[2]/div[2]"));		
		sort.click();
		List<WebElement> allrow1=table.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr"));
		int size2=allrow.size();
		String[] value=new String[size];
		for(int i=0;i<size2;i++)
		{
			List<WebElement> allvalue = allrow.get(i).findElements(By.tagName("td"));
			value[i]=allvalue.get(0).getText();
		}
		for (String string : value) {
			
			System.out.println(string);
		}
		System.out.println("+++++++++++++++++");
		Arrays.sort(value);
		for (String string1 : value) {
			System.out.println(string1);
		}
		System.out.println("++++++++++++++++++++++++");
	
	for (String string2 : value) {
		
		System.out.println(string2);
	}
	for (String string3 : size1) {
		System.out.println(string3);
	}
	if(checkarray(size1, value))
	{
		System.out.println("both arrays are equal");
	}
	else
	{
		System.out.println("both arrays are not equal");
	}
	}
}
	

		








package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		String stringkey="webdriver.chrome.driver";
//		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
//		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/table");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement table = driver.findElement(By.xpath("//table[@id='simpletable']"));	
	List<WebElement> header = table.findElements(By.tagName("th"));
	for (WebElement aa : header) {
		System.out.println(aa.getText());
	}
	List<WebElement> allrow = table.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
	String webElement = allrow.get(0).getText();
	System.out.println(webElement);
	int size = allrow.size();
	System.out.println(size);
	for (WebElement bb : allrow) {
		List<WebElement> name=bb.findElements(By.tagName("td"));
		WebElement read=name.get(0);
		System.out.println(read.getText());
	}
	for(int i=0;i<size;i++)
	{
		List<WebElement>  rows=allrow.get(i).findElements(By.tagName("td"));
		WebElement lastname = rows.get(1);
		String text = lastname.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("raj"))
		{
			WebElement input = rows.get(3).findElement(By.tagName("input"));
			input.click();
			break;
		}
	}
	

	
	
	}
	}



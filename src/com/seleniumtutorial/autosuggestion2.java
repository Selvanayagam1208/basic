package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.tnstc.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement town = driver.findElement(By.id("matchStartPlace"));
	town.sendKeys("ma");
	town.sendKeys(Keys.RETURN);
	List<WebElement> place = driver.findElements(By.cssSelector("ul.ui-autocomplete>li"));
	System.out.println(place.size());
	for (WebElement aa : place) {
		System.out.println(aa.getText());
	}
	for (WebElement bb : place) {
		if(bb.getText().equalsIgnoreCase("mathur"))
		{
			bb.click();
			break;
		}
		
	}
	}
}



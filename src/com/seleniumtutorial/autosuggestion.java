package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestion {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\\\Users\\\\user\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");

		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.redbus.in/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement city = driver.findElement(By.id("src"));
	city.sendKeys("ch");
	city.sendKeys(Keys.RETURN);
	List<WebElement> place = driver.findElements(By.cssSelector("ul.sc-dnqmqq>li"));
	WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(5));
	wb.until(ExpectedConditions.visibilityOfAllElements(place));
	System.out.println(place.size());
	for (WebElement aa : place) {
		System.out.println(aa.getText());
	}
	for (WebElement bb : place) {
		if(bb.getText().equalsIgnoreCase("chidambaram"))
		{
			bb.click();
			break;
		
		}
		
	}
	}

}

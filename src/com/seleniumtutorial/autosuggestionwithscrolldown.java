package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionwithscrolldown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[20]/td/div/table/tbody/tr/td[3]/div[2]/div[2]/img")).click();
	List<WebElement> place = driver.findElements(By.cssSelector("div#country_id>ul>li"));
	System.out.println(place.size());
	for (WebElement aa : place) {
		System.out.println(aa.getText());
	}
	for (WebElement bb : place) {
		if(bb.getText().equalsIgnoreCase("Thailand (+66)"))
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", bb);
			bb.click();
			break;
		}
		
	}
	}
}



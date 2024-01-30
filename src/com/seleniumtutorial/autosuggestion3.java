package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autosuggestion3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.redbus.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement page=driver.findElement(By.cssSelector("input#src"));
		//driver.navigate().refresh();

		page.sendKeys("ch");
		page.sendKeys(Keys.RETURN);
		
	WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
		//		wb.until(ExpectedConditions.visibilityOf(page));
		List<WebElement> place = driver.findElements(By.cssSelector("ul.sc-dnqmqq>li"));
		wb.until(ExpectedConditions.visibilityOfAllElements(place));
		//wb.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.sc-dnqmqq>li")));
			WebDriverWait wb1=new WebDriverWait(driver, Duration.ofSeconds(0));
			WebDriverWait wb2=new WebDriverWait(driver, Duration.ofSeconds(10));
		//		WebDriverWait wb3=new WebDriverWait(driver, Duration.ofSeconds(2));
		//

		System.out.println(place.size());
		for (WebElement aa : place) {
			System.out.println(aa.getText());
		}
		for (WebElement bb : place) {
			if(bb.getText().equalsIgnoreCase("chennai"))
			{
				wb1.until(ExpectedConditions.elementToBeClickable(bb));

				bb.click();
				break;
			}

		}
		WebElement dest=driver.findElement(By.xpath("//input[@id='dest']"));
		//driver.navigate().refresh();

		dest.sendKeys("nam");
		dest.sendKeys(Keys.RETURN);
		
		//wb2.until(ExpectedConditions.visibilityOf(dest));


		List<WebElement> to = driver.findElements(By.cssSelector("ul.sc-dnqmqq>li"));
			//wb2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul.sc-dnqmqq>li")));
		wb.until(ExpectedConditions.visibilityOfAllElements(to));
		System.out.println(to.size());
		for (WebElement aa1 : to) {
			System.out.println(aa1.getText());
		}
		for (WebElement bb1 : to) {
			if(bb1.getText().equalsIgnoreCase("namakkal"))
			{
				wb2.until(ExpectedConditions.elementToBeClickable(bb1));

				bb1.click();
				break;
			}

		}
		driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		
		WebElement calendar=driver.findElement(By.cssSelector("svg#Layer_1"));
		calendar.click();
		
		List<WebElement> date=driver.findElements(By.cssSelector("span.DayTilesWrapper__SpanContainer-sc-19pz9i8-0>div"));
		//wb.until(ExpectedConditions.visibilityOf(calendar));
	//	wb.until(ExpectedConditions.elementToBeClickable(calendar));
		

		for (WebElement aa : date) {
		//	wb.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated("WebElement aa")));

			System.out.println(aa.getText());
		}

		for (WebElement bb : date) {
			if(bb.getText().equalsIgnoreCase("1")) {
				boolean enabled = bb.isEnabled();
				if(enabled==true)
					bb.click();
				
			}
		}

		WebElement search = driver.findElement(By.cssSelector("button#search_button"));
		wb.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
	
	}


}



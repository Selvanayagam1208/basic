 package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndate {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
//		String stringkey="webdriver.chrome.driver";
//		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
//		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://www.facebook.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.partialLinkText("Crea")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("selva0012@gmail.com");
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	Select daydrop=new Select(day);
	daydrop.selectByIndex(3);
	Thread.sleep(2000);
	daydrop.selectByValue("12");
	Thread.sleep(2000);
	daydrop.selectByVisibleText("14");
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select yeardrop=new Select(year);
	yeardrop.selectByVisibleText("2012");
	List<WebElement> option=yeardrop.getOptions();
	for (WebElement aa : option) {
		System.out.println(aa.getText());
	}
	for (WebElement bb : option) {
		if(bb.getText().equalsIgnoreCase("2000"))
		{
			bb.click();
			break;
		}
	}
//	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
//	Select monthdrop=new Select(month);
//	monthdrop.deselectAll();
	
	
	
	
	
	
	
	}

}

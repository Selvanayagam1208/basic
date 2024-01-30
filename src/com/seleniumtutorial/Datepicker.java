package com.seleniumtutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.drive";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		Date date=new Date();
//		String dateinput="12/08/1995";
//		SimpleDateFormat dateformat=new SimpleDateFormat("MM-dd-yyyy");
//		String fdate=dateformat.format(dateinput);
//		WebDriverWait wb=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wb.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='ui-datepicker-div']")));
		WebElement frame=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame); 
		WebElement a=driver.findElement(By.xpath("//input[@id='datepicker']"));
		 a.click();
		 a.sendKeys("12/08/2023");
		

	}

}

package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandlingnewwindow {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	driver.get("http://tnpsc.gov.in");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div/a")).click();
	Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(10));
	wb.until(ExpectedConditions.numberOfWindowsToBe(2));
	Set<String> child=driver.getWindowHandles();
	List<String> list=new ArrayList(child);
	System.out.println(list.size());

	driver.switchTo().window(list.get(1));
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	WebElement pstm=driver.findElement(By.partialLinkText("Click"));
	pstm.click();
	
	}
	}



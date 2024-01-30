package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expliciitwaittime {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		String stringkey="webdriver.chrome.driver";
//		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
//		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.id("alert")).click();
	WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(30));
	wb.until(ExpectedConditions.alertIsPresent());
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
	alt.accept();
	WebElement textc = driver.findElement(By.id("populate-text"));
	WebElement a=driver.findElement(By.className("target-text"));
	System.out.println(a.getText());
	textc.click();
	WebElement b=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));	
	System.out.println(b.getText());
	WebElement button = driver.findElement(By.xpath("//button[text()='Enabled']"));
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
	driver.findElement(By.id("display-other-button")).click();
	wb.until(ExpectedConditions.elementToBeClickable(button));
	System.out.println(button.isDisplayed());
	System.out.println(button.isEnabled());
	
	WebElement but=driver.findElement(By.id("disable"));
	System.out.println(but.isDisplayed());
	System.out.println(but.isEnabled());
	driver.findElement(By.id("enable-button")).click();
	wb.until(ExpectedConditions.elementToBeClickable(but));
	System.out.println(but.isDisplayed());
	System.out.println(but.isEnabled());
	
	WebElement checkbox=driver.findElement(By.id("ch"));
	System.out.println(checkbox.isDisplayed());
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());

	WebElement check = driver.findElement(By.id("checkbox"));
	System.out.println(check.isEnabled());
	check.click();
	System.out.println(checkbox.isDisplayed());
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());
	wb.until(ExpectedConditions.elementToBeClickable(check));
	System.out.println(check.isEnabled());
	
	
	}

}

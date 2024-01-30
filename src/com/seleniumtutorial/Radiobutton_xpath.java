package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.facebook.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	WebElement button = driver.findElement(By.partialLinkText("Crea"));
	button.click();
	WebElement radio=driver.findElement(By.xpath("//input[@value='2']"));
	System.out.println(radio.isEnabled());
	System.out.println(radio.isDisplayed());
	System.out.println(radio.isSelected());
	radio.click();
	System.out.println(radio.isSelected());
	
	}

}

package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://letcode.in/signin");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ambroseselva001@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selva@100");
driver.findElement(By.xpath("//button[text()='LOGIN']")).submit();  //submit also optional to use click replacement onli if tagname is form

	}

}

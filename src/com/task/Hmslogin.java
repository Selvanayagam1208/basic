package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hmslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/hmsci");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement scroll = driver.findElement(By.xpath("//select[@name='login_type']"));
		Select type= new Select(scroll);
		type.selectByValue("admin");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin@mail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
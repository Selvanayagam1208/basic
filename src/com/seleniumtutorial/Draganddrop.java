package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/droppable/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
	
		}

}

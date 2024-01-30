package com.seleniumtutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framedemo2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://www.rediff.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
 // WebDriver fr= driver.switchTo().frame(1);
   WebDriver frame=driver.switchTo().frame("moneyiframe");
   // WebElement frame = driver.findElement(By.xpath("//iframe[@width='670']"));
   // driver.switchTo().frame(frame);
    System.out.println(frame);
    WebElement ad = driver.findElement(By.xpath("//span[@id='nseindex']"));
    String name=ad.getText();
    System.out.println(name);
    ad.click();
    

	}

}

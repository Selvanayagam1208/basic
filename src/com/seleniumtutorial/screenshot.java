package com.seleniumtutorial;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException  {
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
	driver.findElement(By.partialLinkText("Crea")).click();
	driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("selva0123");
	
//	(following 4 lines are example of type casting)
//	int a=100;
//	float b=(float)a;
//	System.out.println(a); //100
//	System.out.println(b); //100.0
	TakesScreenshot ts=(TakesScreenshot)driver;
	File capture = ts.getScreenshotAs(OutputType.FILE);
	//for screenshot alone
//	(File location=new File("C:\\Users\\user\\OneDrive\\Desktop\\screenshot\\screen.png");)
	File location=new File("C:\\Users\\user\\OneDrive\\Desktop\\screenshot\\nayag"+System.currentTimeMillis()+".png");
	//this method for avoid overriding files
	FileHandler.copy(capture, location);
	
	}

}

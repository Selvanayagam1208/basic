package com.seleniumtutorial;

import java.time.Duration;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getrowcolumn {
	static WebDriver driver;
	static int columnsize;
	static int rowsize;
	static String a;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> row=driver.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table"));
		rowsize=driver.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr")).size();
		columnsize=driver.findElements(By.xpath("//table[@id='product']/thead/tr/th")).size();
		
		for(int i=1;i<=rowsize;i++)
		{
			for(int j=1;j<=columnsize;j++)
			{
				String text = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(text.equalsIgnoreCase("alex"))
				{
					System.out.println(i + ":"+ j);
					break;
				}

			}


		}
	
	}
}
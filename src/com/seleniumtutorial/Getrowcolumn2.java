package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getrowcolumn2 {
	
	static int columnsize;
	static int rowsize;
	public static boolean getvalue(String name) {
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
		boolean flag=false;
	
		for(int i=1;i<=rowsize;i++)
		{
			for(int j=1;j<=columnsize;j++)
			{
				String text = driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				if(text.equalsIgnoreCase(name))
				{
					flag=true;
					System.out.println(i + ":"+ j);
					
				}

			}
		}
		if(flag==true)
		{
			System.out.println("text is present in the webtable");
			return true;
		}
		else
		{
			System.out.println("text not present in webtable");
		}
		return flag;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			System.out.println(getvalue("Mechanic"));
			System.out.println(getvalue("33"));
			System.out.println(getvalue("Chennai"));
			System.out.println(getvalue("yes"));

	
		}

}
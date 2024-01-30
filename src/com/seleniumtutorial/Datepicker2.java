package com.seleniumtutorial;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker2 {
	public static int targetday=0, targetmonth=0, targetyear=0;
	public static int currentday=0, currentmonth=0, currentyear=0;
	public static int jumptomonth=0;
	public static boolean increment=true;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String datetoset="12/10/2023";
		getCurrentdatemonthyear();
		System.out.println(currentday+" "+currentmonth+" "+currentyear);
		targetdaymonthyear(datetoset);
		System.out.println(targetday+" "+targetmonth+" "+targetyear);
		getjumptomonth();
		System.out.println(jumptomonth);
		String stringkey="webdriver.chrome.drive";
		String stringpath="C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement frame=driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame); 
		WebElement a=driver.findElement(By.xpath("//input[@id='datepicker']"));
		a.click();
		for(int i=0;i<jumptomonth;i++)
		{
			if(increment)
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();

			}
		}
		driver.findElement(By.linkText(Integer.toString(targetday))).click();
		
		

	}
	public static boolean getjumptomonth()
	{
		if((targetmonth-currentmonth)>0)
		{
			jumptomonth=targetmonth-currentmonth;
		}
		else
		{
			jumptomonth=currentmonth-targetmonth;
			return false;
		}
		return increment;
	}
	public static void targetdaymonthyear(String datetoset)
	{
		int firstindex=datetoset.indexOf("/");
		int lastindex=datetoset.lastIndexOf("/");
		String month=datetoset.substring(0, firstindex);
		String day=datetoset.substring(firstindex+1, lastindex);
		String year=datetoset.substring(lastindex+1, datetoset.length());
		targetday=Integer.parseInt(day);
		targetmonth=Integer.parseInt(month);
		targetyear=Integer.parseInt(year);
		
	}
	public static void getCurrentdatemonthyear()
	{
		Calendar cal=Calendar.getInstance();
		currentday=cal.get(Calendar.DAY_OF_MONTH);
		currentmonth=cal.get(Calendar.MONTH)+1;
		currentyear=cal.get(Calendar.YEAR);
	}

}

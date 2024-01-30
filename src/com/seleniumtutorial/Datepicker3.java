package com.seleniumtutorial;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker3 {
	public static int targetday=0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SimpleDateFormat date=new SimpleDateFormat("MM/dd/yyyy");
//		Date date1=new Date();
//		String currentdate=date.format(date1);
//		System.out.println(currentdate);
//		Calendar cal=Calendar.getInstance();
//		cal.add(Calendar.DATE, 1);
//		cal.add(Calendar.MONTH+1, 0);
//		cal.add(Calendar.YEAR, 1);
//		String result=date.format(cal.getTime());
//		System.out.println(result);
		SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
		Date date=new Date();
		String currentdate=dateformat.format(date);
		String targetdate="07/12/2023";
	
		try {
			Date date2=dateformat.parse(targetdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gettargetday(targetdate);
		System.out.println(targetday);

//		int a=Integer.valueOf(targetdate);
//		int b=Integer.valueOf(currentdate);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate day1=LocalDate.parse(currentdate, formatter);
		LocalDate day2=LocalDate.parse(targetdate, formatter);
		long monthbetween=ChronoUnit.MONTHS.between(day1, day2);	
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
		WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepicker.click();
		if(monthbetween>0)
		{
			long totalmonth=monthbetween;
			System.out.println(totalmonth);
			for(int i=0;i<totalmonth;i++)
			{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		else
		{
			long totalmonth=(-monthbetween)+1;
			System.out.println(totalmonth);
			for(int i=0;i<totalmonth;i++)
			{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}
				driver.findElement(By.linkText(Integer.toString(targetday))).click();

	}
	public static void gettargetday(String targetdate)
	{
		//String targetdate="09/12/2023";
		int firstindex=targetdate.indexOf("/");
		int lastindex=targetdate.lastIndexOf("/");
		String month=targetdate.substring(0, firstindex);	
		String day=targetdate.substring(firstindex+1, lastindex);
		String year=targetdate.substring(lastindex+1, targetdate.length());
		targetday=Integer.parseInt(day);


		
	}



		


	}
	
		
	
	



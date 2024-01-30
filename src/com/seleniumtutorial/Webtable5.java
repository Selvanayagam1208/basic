package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Checksum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.data.SumData;

public class Webtable5 {
	static int total;
	static Integer newage;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://letcode.in/table");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr"));
		int size=row.size();

		ArrayList<Integer> al=new ArrayList<>();
		
		int sum=0;

		for(int i=1; i<=size; i++)
		{
			Integer data=Integer.valueOf(driver.findElement(By.xpath("//table[@id='shopping']/tbody/tr["+i+"]/td[2]")).getText());
			al.add(data);
					
		}

		for (Integer ii : al) {
			System.out.println(ii);
		}

		for (Integer ii : al) {
			sum+=ii;
		}
		System.out.println(sum);
	}


}	











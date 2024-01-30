package com.seleniumtutorial;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args)  {


		List<String> li=new ArrayList<>();//list1

		List<String> li1=new ArrayList<>();//list2
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

		WebElement table = driver.findElement(By.cssSelector("table.mat-sort"));	
		//		List<WebElement> header = table.findElements(By.tagName("th"));
		//		for (WebElement headername : header) {
		//			String text = headername.getText();
		//			System.out.println(text);
		//		}
		//		System.out.println("=========================");


		List<WebElement> allrow=table.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr"));
		int size=allrow.size();
		System.out.println(size);


		for (WebElement row : allrow) {
			List<WebElement> data = row.findElements(By.tagName("td"));
			WebElement first=data.get(0);
			String firstname=first.getText();
			System.out.println(firstname);
			li.add(first.getText());
		}

		System.out.println("============================");

		for (String string : li) {
			System.out.println(string);
		}

		System.out.println("============================");

		Collections.sort(li);


		for (String string : li) {
			System.out.println(string);
		}

		System.out.println("============================");
		WebElement afterclick=driver.findElement(By.xpath("/html/body/app-root/app-simpletable/section[1]/div/div/div[1]/div/div/div/div[3]/div/table/thead/th[1]/div/div[2]"));
		afterclick.click();


		List<WebElement> allrow1=table.findElements(By.xpath("//table[@class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']/tr"));
		int size1=allrow1.size();
		System.out.println(size1);


		for (WebElement row : allrow1) {
			List<WebElement> data = row.findElements(By.tagName("td"));
			WebElement first=data.get(0);
			String firstname=first.getText();
			System.out.println(firstname);
			li1.add(first.getText());
		}
		System.out.println("===================================");
		for (String string : li1) {
			System.out.println(string);
		}



		if(li.equals(li1))
		{
			System.out.println("Both the lists are in sorted order");
		}

		else
		{
			System.out.println("Both the lists are in unsorted order");
		}

	}
}









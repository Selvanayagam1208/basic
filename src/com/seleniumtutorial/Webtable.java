package com.seleniumtutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String stringkey="webdriver.chrome.driver";
		String stringpath="C:\\Users\\user\\eclipse-workspace\\Bankofindia\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> table = driver.findElements(By.xpath("/html/body/div[2]/div[5]/table"));	
		for (WebElement aa : table) {
			System.out.println(aa.getText());
		}


	}
}



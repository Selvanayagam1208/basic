package com.brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_broken_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String stringkey="webdriver.chrome.driver";
//		String stringpath="C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Bankofindia\\\\src\\\\test\\\\resources\\\\Drivers\\\\chromedriver.exe";
//		System.setProperty(stringkey, stringpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=1425830969039199884&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no. of links are present"+links.size());
		List<String> list=new ArrayList<String>();
		for (WebElement aa : links) {
			String texturl=aa.getAttribute("href");
			list.add(texturl);
		//	checkbroken(texturl);
		}
		long first=System.currentTimeMillis();
		list.parallelStream().forEach(e->checkbroken(e));
		long second=System.currentTimeMillis();
		System.out.println("total time taken"+(second-first));//41.6 sec for parallel stream and 116.5sec for stream is sequential run
		driver.quit();
		
	}

	public static void checkbroken(String linkurl) {
		
			try {
				URL url=new URL(linkurl);
				HttpURLConnection httpurlconnection=(HttpURLConnection)url.openConnection();
				httpurlconnection.setConnectTimeout(5000);
				httpurlconnection.connect();
				if(httpurlconnection.getResponseCode()>=400)
				{
					System.out.println(linkurl+"------>"+httpurlconnection.getResponseCode()+"//"+httpurlconnection.getResponseMessage()+" is a broken link");
				}
				else
				{
					System.out.println(linkurl+"---->"+httpurlconnection.getResponseCode()+"//"+httpurlconnection.getResponseMessage());
				}
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
	


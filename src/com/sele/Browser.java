package com.sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver1\\chromedriver.exe" );

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	//NAVIGATE
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	
	//URL
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	driver.navigate().forward();
	 
	//TITLE
	String title=driver.getTitle();
	System.out.println(title);
	
	TakesScreenshot s=(TakesScreenshot)driver;
	File src=s.getScreenshotAs(OutputType.FILE);
	 File des=new File("D:\\workspace\\Selenim\\pic\\snap.png");
	FileUtils.copyFile(src, des);
	 
	driver.navigate().refresh();
	
	driver.close();
	}

}
 

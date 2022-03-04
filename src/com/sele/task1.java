package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String goog=driver.getTitle();
	System.out.println(goog);
	
	driver.navigate().to("https://www.instagram.com/");        //output--->google->insta->title->amazon->
	                                                        //back to insta->youtube->amzon->refr->close
	
	driver.navigate().forward();
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.navigate().to("https://www.amazon.com/");
	
	String amz=driver.getTitle();
	System.out.println(amz);
	
	driver.navigate().back();
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	
	driver.navigate().forward();
																																																							
	driver.navigate().to("https://www.youtube.com/");

String currenturl2=	driver.getCurrentUrl();
	System.out.println(currenturl2);
	
	driver.navigate().back();
	
	driver.navigate().refresh();
	driver.close();
	}

}

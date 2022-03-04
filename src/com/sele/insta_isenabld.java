package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_isenabld {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	    
		driver.get("https://www.instagram.com/accounts/login/");
	
		Thread.sleep(500);
		
  WebElement  email= driver.findElement(By.xpath("//input[@type='text']"));
	 email.sendKeys("vibsvib");
	 boolean displayed = email.isDisplayed();
	System.out.println(displayed);

	}

}

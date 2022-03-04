package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javscript_exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		
		WebElement moveto = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,9000);");
		js.executeScript("window.scrollBy(0,-4000);");
		
		js.executeScript("arguments[0].scrollIntoView();",moveto);
		
	}

}

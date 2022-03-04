package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sdet_parentframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		 
   driver.switchTo().frame("iframeResult");
   driver.switchTo().frame(0);
   
  System.out.println("driver.findElement(By.xpath(\"//iframe[@id='iframeResult']\")).getText();"); 
   
  driver.switchTo().parentFrame();

  	String txt= driver.findElement(By.xpath("//iframe[@id='iframeResult']")).getText();
   
   System.out.println(txt);
   
	}
}

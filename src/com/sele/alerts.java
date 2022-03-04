package com.sele;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		driver.switchTo().alert().accept();
	

		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert alert2 = driver.switchTo().alert(); 
		alert2.dismiss();
		
		Thread.sleep(5000);  //5 seconds
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.click();
		 
		Alert alert = driver.switchTo().alert();
	   alert.sendKeys("hi vibs");
	   alert.accept(); 
	}

}

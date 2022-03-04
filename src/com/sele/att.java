package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class att {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		
		WebElement rit = driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(rit).build().perform();
		
		
	}

}
 
package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 
		WebElement email=driver.findElement(By.id("email"));
		 email.sendKeys("vibsvibin@gmail.com");
		 
		 WebElement pass=driver.findElement(By.name("pass"));
		 pass.sendKeys("24439435");
		 
		 
		 WebElement log=driver.findElement(By.name("login"));
		 log.click();
	}

}
 
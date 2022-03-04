package com.sele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitexplicit_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement newacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		newacc.click();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("R");
		
	}

}

package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	int size = driver.findElements(By.tagName("Iframe")).size();
		 System.out.println(size);
		
		 driver.switchTo().frame(0);
		 WebElement passval = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		  passval.sendKeys("Success");
	}

}

package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Css_selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("vibs23434");
		
		WebElement pass = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		pass.sendKeys("67435698");
	}

}
 
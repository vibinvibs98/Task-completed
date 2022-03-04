package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     
			System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.javatpoint.com/java-tutorial");
			
			//WebElement web = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1"));
		//	System.out.println(web.getText());
			 
			List<WebElement>li=driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
			for (WebElement ele : li) {
				System.out.println(ele.getText());
			}	
	}

}
     
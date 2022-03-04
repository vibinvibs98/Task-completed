package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
	
    List<WebElement> findElements = driver.findElements(By.xpath("//table/tbody/tr/td"));
	   for (WebElement web : findElements) {
		   System.out.println(web.getText());
	   }
		   
		    List<WebElement>row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
			   for (WebElement web1 : row) {
				   System.out.println(web1.getText());
			   }
			   
				    List<WebElement> col = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
					   for (WebElement web2 : col) {
						   System.out.println(web2.getText());
					   }
						   
						    List<WebElement>partdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td[4]"));
							   for (WebElement web3 :partdata) {
								   System.out.println(web3.getText());						   
	}
	 
	}

}		  	   

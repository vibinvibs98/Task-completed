package com.sele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/shirts");
		
		List<WebElement> disprice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	    
		List<Integer>prod=new ArrayList<Integer>();
	
	for (WebElement price: disprice) {
	  String rep = price.getText().replace("Rs. ", "");
	  System.out.println(rep);
	  
	  int par = Integer.parseInt(rep);
	  System.out.println(par);
	
	}
		System.out.println(prod);
	}

}
 
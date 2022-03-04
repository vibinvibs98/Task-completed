package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://ironspider.ca/forms/dropdowns.htm#");
		
		WebElement d=driver.findElement(By.name("coffee2"));
		Select s=new Select(d);
		Boolean mul= s.isMultiple();
		System.out.println(mul);
		
		
		Select s1=new Select(d);
		s1.selectByValue("skim");
		 
		Select s2=new Select(d);
		 s2.selectByValue("cream");
		 
		 List<WebElement> Options = s.getAllSelectedOptions();
		 for (WebElement web : Options) {
			 System.out.println(web.getText());
		}
		 
		 WebElement Option = s.getFirstSelectedOption();
		  System.out.println(Option.getText());
		  
		  List<WebElement> options2 = s.getOptions();
		  for (WebElement web : options2) {
			System.out.println(web.getText());
		}
		  
		  
	}

}

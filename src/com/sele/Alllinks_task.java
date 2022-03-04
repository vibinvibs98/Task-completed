package com.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinks_task {

 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver1\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.javatpoint.com/");
	
	List<WebElement> AllLINKS = driver.findElements(By.tagName("a"));	
	System.out.println("Links are"+AllLINKS );
	
	for(int i=0;i<AllLINKS.size();i++) {
		System.out.println(AllLINKS.get(i).getAttribute("href"));
	}
}
}

package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practising_notepad {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.get("https://www.amazon.in/");
	 
	Actions act=new Actions(driver);
	
	WebElement el = driver.findElement(By.xpath("(//a[normalize-space()='Electronics'])[1]"));
	  act.contextClick(el).build().perform();
	  
	  Robot r=new Robot();
	  
	  r.keyPress(KeyEvent.VK_DOWN);
	  r.keyRelease(KeyEvent.VK_DOWN);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	

	  WebElement hk = driver.findElement(By.xpath("(//a[normalize-space()='Home & Kitchen'])[1]"));
	  
	   act.contextClick(hk).build().perform();
	   
	   
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		
		  
		  Set<String> win = driver.getWindowHandles(); 
		  
		  for(String str:win) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
		  }
	}
	
	   
	
	
}

package com.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class window {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_7b63n4zle7_e&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=10268648725823312746&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302538&hvtargid=kwd-318610508581&hydadcr=5840_1914862&gclid=Cj0KCQiA_JWOBhDRARIsANymNOaCSG8dlvOvHUECWGLBcIl84htJy1PVXOu3ddhZrNp-9b9vZ0ADULwaAlhCEALw_wcB");
       
		Actions act=new Actions(driver);
		
		WebElement el = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
	   act.contextClick(el).build().perform();
	   
	   Robot rob=new Robot();
	  rob.keyPress(KeyEvent.VK_DOWN);
	  rob.keyRelease(KeyEvent.VK_DOWN);
	
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	  act.contextClick(mob).build().perform();
	   

	  rob.keyPress(KeyEvent.VK_DOWN);
	  rob.keyRelease(KeyEvent.VK_DOWN);
	
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  WebElement hk = driver.findElement(By.xpath("//a[normalize-space()='Home & Kitchen']"));
	  act.contextClick(hk).build().perform();
	   

	  rob.keyPress(KeyEvent.VK_DOWN);
	  rob.keyRelease(KeyEvent.VK_DOWN);
	
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.keyRelease(KeyEvent.VK_ENTER);
	  
	  
	  Set<String> multi = driver.getWindowHandles();   // 3 windows need to go so for each loop concept is used
	  for (String str : multi) {
		String title = driver.switchTo().window(str).getTitle();
		System.out.println(title);
	}
	   String s="Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	   for (String str1 : multi) {
		if(driver.switchTo().window(str1).getTitle().equalsIgnoreCase(s));
		break; 
	}
	  
	}

}

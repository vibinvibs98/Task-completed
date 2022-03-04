package com.sele;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

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
	}
	

}

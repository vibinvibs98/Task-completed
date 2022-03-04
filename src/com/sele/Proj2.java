package com.sele;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Proj2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");	
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("henriq123@gmail.com");
		
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("h2134");
		
	   WebElement submit = driver.findElement(By.id("SubmitLogin"));
		submit.click();
		
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		js.executeScript("arguments[0].scrollIntoView();",image);
	 
		WebElement img = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		 img.click();
		 
		 driver.switchTo().frame(0);
		
		 WebElement quan = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		 quan.click();
		 
		 WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		 Select s=new Select(size);
		 s.selectByValue("2");
		 
		 WebElement color = driver.findElement(By.name("Blue"));
		 color.click();
		 
		 WebElement cart = driver.findElement(By.name("Submit"));
		 cart.click();
		 
		 driver.switchTo().defaultContent();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement check1 = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
				 check1.click();
	    
		WebElement check2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));	
		check2.click();
		
		WebElement check3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));	
		check3.click();
		
		WebElement tick = driver.findElement(By.id("cgv"));
		tick.click();
		
		WebElement check4 = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		check4.click();
		
		WebElement paybycheck = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		paybycheck.click();
		
		WebElement confrmorder = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		confrmorder.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\workspace\\Selenim\\pic\\pic1.png");
		FileUtils.copyFile(source, destination);
      }

}

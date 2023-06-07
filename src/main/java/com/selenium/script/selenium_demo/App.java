package com.selenium.script.selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{	@Test
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		//automation
		driver.get("http://localhost:8080/addressbook/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Niladri");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Mondal");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("nil@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("6/6/23,");
		Thread.sleep(2000);
		//click on the save button
		driver.findElement(By.className("v-button-primary")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
    }
}

package com.oliulka.rocketmilesUI;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public abstract class RocketMilesUIAbstractTest {
	
	protected WebDriver driver = null;

	@BeforeMethod
	public void SetUpMethod()
	{
		///Users/oliulka/GIT/RocketmilesUI/RocketMilesUI/chromedriver
		System.setProperty("webdriver.chrome.driver", "/Users/oliulka/GIT/RocketmilesUI/RocketMilesUI/chromedriver");
		driver= new ChromeDriver();
		// Disabled implicit wait for now
   	 	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	driver.get("https://www.rocketmiles.com/");
    	assertEquals(driver.getTitle(), "Rocketmiles - Book Hotels Earn Thousands of Frequent Flyer Miles");
    	System.out.println("[LOGGING]---------RocketMiles home page was loaded successfully");
    	driver.findElement(By.cssSelector("button.btn.cookie-banner-button")).click();
    	driver.findElement(By.cssSelector("div#new-sign-up-modal button.close")).click();
		System.out.println("[LOGGING]---------Set Up Method is over");
	}

	@AfterMethod
	public void AfterTest()
	{
		driver.quit();
	}

}

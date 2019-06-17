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
		System.setProperty("webdriver.chrome.driver", "C:\\GIT\\New\\RocketMilesUI\\RocketMilesUI\\src\\test\\resources\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
   	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get("https://www.rocketmiles.com/");
    	assertEquals(driver.getTitle(), "Rocketmiles - Book Hotels Earn Thousands of Frequent Flyer Miles");
    	System.out.println("RocketMiles home page was loaded successfully");
    	driver.findElement(By.cssSelector("button.btn.cookie-banner-button")).click();
    	driver.findElement(By.cssSelector("div#new-sign-up-modal button.close")).click();
		System.out.println("Set Up Method is over");
	}

	@AfterMethod
	public void AfterTest()
	{
		driver.quit();
	}

}

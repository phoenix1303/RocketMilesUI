package com.oliulka.rocketmilesUI;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public abstract class RocketMilesUIAbstractTest {
	
	protected WebDriver driver = null;

	@BeforeTest
	public void SetUpMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\GIT\\New\\RocketMilesUI\\RocketMilesUI\\src\\test\\resources\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
   	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	 	System.out.println("driver=" + driver); 
		System.out.println("Set Up Method is over");
	}

	@AfterTest
	public void AfterTest()
	{
		driver.quit();
	}

}

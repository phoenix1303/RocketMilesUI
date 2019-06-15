package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oliulka.rocketmilesUI.pages.Page01HomePage;

public class FLow01HomePage{

    private Page01HomePage page01;
     
    
    public void homePageBasicElementsFlow(WebDriver driver) throws InterruptedException 
    {
    	driver.get("https://www.rocketmiles.com/");
    	Thread.sleep(10000);
    	System.out.println("driver=" + driver); 
    	//page01.homepageRocketMililesSignUpClose(driver).click();
    	//page01.homepageRocketMililesCoockiesOK(driver).click();
    	assertTrue(page01.homepageRocketMilesLogo(driver).isDisplayed());
    	System.out.println("RocketMiles home page was loaded successfully");

    	System.out.println("RocketMiles home page was asserted successfully"); 
     }




	public void WaitUtil(WebElement element, int seconds) throws InterruptedException
	{
		int count=0;
		while (element.isDisplayed()==false && seconds<=count)
		{
			Thread.sleep(1000);
			count++;
		}
	}
}
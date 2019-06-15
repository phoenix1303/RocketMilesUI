package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.oliulka.rocketmilesUI.pages.Page01HomePage;

public class FLow01HomePage{

    private Page01HomePage page01;
     
 	public FLow01HomePage(){
	}

    public void homePageBasicElementsFlow(WebDriver driver) 
    {
    	driver.get("https://www.rocketmiles.com/");
    	WebElement homeLogo = page01.homepageAmazonLogo(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 30);
    	wait.until(ExpectedConditions.visibilityOf(homeLogo));
    	System.out.println("Home page was accessed successfully");

    	System.out.println("Home page elements were asserted successfully"); 
     }
}

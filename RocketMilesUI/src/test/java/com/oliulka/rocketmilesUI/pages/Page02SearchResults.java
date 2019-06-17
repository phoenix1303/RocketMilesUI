package com.oliulka.rocketmilesUI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page02SearchResults{
	
	//----------------------------------Start: SetUp Elements---------------------------------------------//
    
	public WebElement resultsPageDestination (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("span.twitter-typeahead"));
    }
    public WebElement resultsPageDates (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.stay.ng-scope"));
    }
	
	//----------------------------------Start: Default View Elements--------------------------------------//
	
}

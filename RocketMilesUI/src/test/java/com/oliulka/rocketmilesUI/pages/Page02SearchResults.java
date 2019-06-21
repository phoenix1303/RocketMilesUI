package com.oliulka.rocketmilesUI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page02SearchResults{
	
	//----------------------------------Start: Results Page Elements---------------------------------------------//
    
	public WebElement resultsPageDestination (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.search-summary-container-transparent> span> var:nth-child(3)"));
    }
	public List <WebElement> resultsPagaRewardProgramLogo (WebDriver driver)
    {
    	return driver.findElements(By.cssSelector("img.reward-program-logo"));
    }
    public WebElement resultsPageDates (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.region div.stay.ng-scope"));
    }
    public WebElement resultsPagePricePerRoom (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.hotel-result-container div.hotel-result:nth-child(1) div.unit"));
    }
    public  WebElement resultsPageSpecificResult (WebDriver driver, int i)
    {
    	return driver.findElement(By.cssSelector("div.hotel-result-container div.hotel-result:nth-child("+i+")"));
    }
    
	//----------------------------------End: Results Page Elements----------------------------------------//
	//----------------------------------Start: Specific hotel Elements------------------------------------//
    public  WebElement resultsPageSpecificResultCheckInDate (WebDriver driver)
    {
    	return driver.findElement(By.xpath("//div[@class='rm-sidebar']/div[position()=1]/div[contains(@class, 'trip-date')]"));
    }
    public  WebElement resultsPageSpecificResultCheckOutDate (WebDriver driver)
    {
    	return driver.findElement(By.xpath("//div[@class='rm-sidebar']/div[position()=2]/div[contains(@class, 'trip-date')]"));
    }
    public  WebElement resultsPageSpecificResultNumberORooms (WebDriver driver)
    {
    	return driver.findElement(By.xpath("//div[@class='rm-sidebar']/div[position()=4]/div[contains(@class, 'value')]"));
    }
    public  WebElement resultsPageSpecificResultNumberOfGuests (WebDriver driver)
    {
    	return driver.findElement(By.xpath("//div[@class='rm-sidebar']/div[position()=5]/div[contains(@class, 'value')]"));
    }
    public  List <WebElement> resultsPageSpecificResultReturnBackLinkNoAvailability (WebDriver driver)
    {
    	return driver.findElements(By.cssSelector("div.category-error a.return-btn"));
    }
	//----------------------------------End: Specific hotel Elements--------------------------------------//
   
}

package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oliulka.rocketmilesUI.pages.Page01HomePage;
public class FLow01HomePage{
    
    public void homePageBasicElementsFlow(WebDriver driver) throws InterruptedException 
    {
		Page01HomePage page01 = new Page01HomePage();
    	System.out.println("Asserting basic element of the home page");
    	assertTrue(page01.homepageRocketMilesLogo(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesTetUnderLogo(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesDestinationInput(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesRewardsProgram(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesCheckInDate(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesCheckOutDate(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesNumberOfGuests(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesNumberOfRooms(driver).isDisplayed());
    	assertTrue(page01.homepageRocketMilesSearchButton(driver).isDisplayed());
    	System.out.println("Presence of basic element on the home page was asserted sucessfully"); 
     }
    
    public void searchForHotel(WebDriver driver, String destination, String rewardsProgram, String CheckInDate, String CheckOutDate,
    		int NumberOfGuests, int NumberOfRooms) throws InterruptedException 
    {
		Page01HomePage page01 = new Page01HomePage();
    	System.out.println("Searching for vacation in Barcelona..");
    	assertEquals(page01.homepageRocketMilesTetUnderLogo(driver).getText(), "Book hotels. Earn rewards.");
    	page01.homepageRocketMilesDestinationInput(driver).sendKeys(destination);
    	page01.homepageRocketMilesRewardsProgram(driver).sendKeys(rewardsProgram);
    	page01.homepageRocketMilesCheckInDate(driver).click();
    	WaitUtil(page01.homepageRocketMilesCalendarStartDate(driver, 2019, 5, 28), 20);
    	page01.homepageRocketMilesCalendarStartDate(driver, 2019, 5, 28);
    	page01.homepageRocketMilesCheckOutDate(driver).click();
    	page01.homepageRocketMilesCalendarEndDate(driver, 2019, 5, 30);
    	page01.homepageRocketMilesNumberOfGuests(driver).click();
    	page01.homepageRocketMilesNumberOfGuests(driver, NumberOfGuests);
    	page01.homepageRocketMilesNumberOfRooms(driver).click();
    	page01.homepageRocketMilesNuberOfRooms(driver, NumberOfRooms);
    	page01.homepageRocketMilesSearchButton(driver).click();
    	Thread.sleep(30000);
    	
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
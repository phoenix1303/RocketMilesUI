package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.oliulka.rocketmilesUI.pages.Page01HomePage;
import com.oliulka.rocketmilesUI.util.Utilities;
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
		Utilities util = new Utilities();
    	assertEquals(page01.homepageRocketMilesTetUnderLogo(driver).getText(), "Book hotels. Earn rewards.");
    	System.out.println("Searching for vacation in - "+destination);
    	page01.homepageRocketMilesDestinationInput(driver).sendKeys(destination);
    	Thread.sleep(2000);
    	page01.homepageRocketMilesDestinationInput(driver).sendKeys(Keys.TAB);
    	System.out.println("Picking following rewards program - "+rewardsProgram);
    	page01.homepageRocketMilesRewardsProgram(driver).sendKeys(rewardsProgram);
    	util.WaitForElementVisible(page01.homepageRocketMilesRewardsProgram(driver), 10);
    	page01.homepageRocketMilesRewardsPredictions(driver).click();
    	System.out.println("Setting up CheckIn date");
    	page01.homepageRocketMilesCheckInDate(driver).click();
    	System.out.println("Determining exact CheckIn date");
    	CheckInDate = CheckInDate.replaceAll("/", "");
    	int year = Integer.valueOf(CheckInDate.substring(0, 4));
    	int month = Integer.valueOf(CheckInDate.substring(4, 6));
    	int day = Integer.valueOf(CheckInDate.substring(6));
    	System.out.println("Exact checkIn date - "+year+"/"+month+"/"+day);
    	util.WaitForElementVisible(page01.homepageRocketMilesCalendarStartDate(driver, year, (month-1), day), 20);
    	page01.homepageRocketMilesCalendarStartDate(driver, year, (month-1), day).click();
    	System.out.println("Setting up CheckOut date");
    	page01.homepageRocketMilesCheckOutDate(driver).click();
    	System.out.println("Determining exact CheckOut date");
    	CheckOutDate = CheckOutDate.replaceAll("/", "");
    	year = Integer.valueOf(CheckOutDate.substring(0, 4));
    	month = Integer.valueOf(CheckOutDate.substring(4, 6));
    	day = Integer.valueOf(CheckOutDate.substring(6));
    	System.out.println("Exact CheckOut date - "+year+"/"+month+"/"+day);
    	util.WaitForElementVisible(page01.homepageRocketMilesCalendarEndDate(driver, year, (month-1), day), 20);
    	page01.homepageRocketMilesCalendarEndDate(driver, year, (month-1), day).click();
    	System.out.println("Setting up number of Guests as - "+ NumberOfGuests);
    	page01.homepageRocketMilesNumberOfGuests(driver).click();
    	page01.homepageRocketMilesNumberOfGuests(driver, NumberOfGuests).click();
    	System.out.println("Setting up number of Rooms as - "+ NumberOfRooms);
    	page01.homepageRocketMilesNumberOfRooms(driver).click();
    	page01.homepageRocketMilesNuberOfRooms(driver, NumberOfRooms).click();
    	page01.homepageRocketMilesSearchButton(driver).click();
    	System.out.println("Searching...");
    	util.WaitForElementVisible(page01.homepageRocketMilesSearchTransition(driver), 10);
    	util.WaitForElementInVisible(page01.homepageRocketMilesSearchTransition(driver), 30);
    	System.out.println("On Results page now");
     }

}
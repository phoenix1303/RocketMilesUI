package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    	Thread.sleep(3000);
    	page01.homepageRocketMilesDestinationInput(driver).sendKeys(Keys.TAB);
    	System.out.println("Picking following rewards program - "+rewardsProgram);
    	page01.homepageRocketMilesRewardsProgram(driver).sendKeys(rewardsProgram);
    	Thread.sleep(3000);
    	page01.homepageRocketMilesRewardsPredictions(driver).click();
    	System.out.println("Setting up CheckIn date");
    	page01.homepageRocketMilesCheckInDate(driver).click();
    	util.WaitForElementVisible(page01.homepageRocketMilesCalendarStartDate(driver, 2019, 5, 28), 20);
    	page01.homepageRocketMilesCalendarStartDate(driver, 2019, 5, 28).click();
    	System.out.println("Setting up CheckOut date");
    	page01.homepageRocketMilesCheckOutDate(driver).click();
    	util.WaitForElementVisible(page01.homepageRocketMilesCalendarEndDate(driver, 2019, 5, 30), 20);
    	page01.homepageRocketMilesCalendarEndDate(driver, 2019, 5, 30).click();
    	System.out.println("Setting up number of Guests as - "+ NumberOfGuests);
    	page01.homepageRocketMilesNumberOfGuests(driver).click();
    	page01.homepageRocketMilesNumberOfGuests(driver, NumberOfGuests);
    	System.out.println("Setting up number of Guests as - "+ NumberOfRooms);
    	page01.homepageRocketMilesNumberOfRooms(driver).click();
    	page01.homepageRocketMilesNuberOfRooms(driver, NumberOfRooms);
    	page01.homepageRocketMilesSearchButton(driver).click();
    	System.out.println("Searching...");
    	util.WaitForElementVisible(page01.homepageRocketMilesSearchTransition(driver), 10);
    	util.WaitForElementInVisible(page01.homepageRocketMilesSearchTransition(driver), 30);
    	Thread.sleep(5000);
    	System.out.println("On Results page now");
     }

}
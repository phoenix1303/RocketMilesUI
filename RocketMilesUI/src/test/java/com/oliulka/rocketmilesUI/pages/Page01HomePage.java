package com.oliulka.rocketmilesUI.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page01HomePage{
	
	//----------------------------------Start: SetUp Elements---------------------------------------------//
    
	public WebElement homepageRocketMililesCoockiesOK (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("button.btn.cookie-banner-button"));
    }
    public WebElement homepageRocketMililesSignUpClose (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div#new-sign-up-modal button.close"));
    }
	
	//----------------------------------Start: Default View Elements--------------------------------------//
	
    public WebElement homepageRocketMilesLogo (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("img.rm-logo-priceline-ready"));
    } 
    public WebElement homepageRocketMilesTetUnderLogo (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("h3.text-center"));
    } 
    public WebElement homepageRocketMilesDestinationInput (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("input[placeholder='Where do you need a hotel?']"));
    } 
    public WebElement homepageRocketMilesRewardsProgram (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("input[placeholder='Select reward program']"));
    } 
    public WebElement homepageRocketMilesCheckInDate (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.checkin.booking-date"));
    } 
    public WebElement homepageRocketMilesCheckOutDate (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.checkout.booking-date"));
    } 
    public WebElement homepageRocketMilesNumberOfGuests (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.adults.search-field"));
    } 
    public WebElement homepageRocketMilesNumberOfRooms (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.rooms.ng-scope"));
    } 
    public WebElement homepageRocketMilesSearchButton (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("button.search-submit-btn"));
    } 
	//----------------------------------End: Default View Elements--------------------------------------//
	//----------------------------------Start: Additional Elements showing up based on actions----------//
    public WebElement homepageRocketMilesRewardPrograms (WebDriver driver, String rewardsProgramName)
    {
    	return driver.findElement(By.xpath("//a[text()='"+rewardsProgramName+"']"));
    } 
    public WebElement homepageRocketMilesCalendarStartDate (WebDriver driver, int year, int month, int date)
    {
    	return driver.findElement(By.xpath("//td[@data-month='"+month+"'][@data-year='"+year+"']/a[text()='"+date+"']"));
    }
    public WebElement homepageRocketMilesCalendarEndDate (WebDriver driver, int year, int month, int date)
    {
    	return driver.findElement(By.xpath("//td[@data-month='"+month+"'][@data-year='"+year+"']/a[text()='"+date+"']"));
    }
    public WebElement homepageRocketMilesNumberOfGuests (WebDriver driver, int numberOfGuests)
    {
    	return driver.findElement(By.cssSelector("div.adults ul.dropdown-menu> li:nth-child("+numberOfGuests+")"));
    }
    public WebElement homepageRocketMilesNuberOfRooms (WebDriver driver, int numberOfRooms)
    {
    	return driver.findElement(By.xpath(" //a[text()='"+numberOfRooms+" Guest']"));
    } 
    public WebElement homepageRocketMilesRewardsPredictions (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.program li.uib-typeahead-match"));
    }
    public WebElement homepageRocketMilesSearchTransition (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.search-transition"));
    } 
	//------------------------------------End: Additional Elements showing up based on actions----------//
}

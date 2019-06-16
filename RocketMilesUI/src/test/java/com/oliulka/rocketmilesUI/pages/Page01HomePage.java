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
    public static WebElement homepageRocketMilesTetUnderLogo (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("h3.text-center"));
    } 
    public static WebElement homepageRocketMilesDestinationInput (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("input[placeholder='Where do you need a hotel?']"));
    } 
    public static WebElement homepageRocketMilesRewardsProgram (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("input[placeholder='Select reward program']"));
    } 
    public static WebElement homepageRocketMilesCheckInDate (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.checkin.booking-date"));
    } 
    public static WebElement homepageRocketMilesCheckOutDate (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.checkout.booking-date"));
    } 
    public static WebElement homepageRocketMilesNumberOfGuests (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.adults.search-field"));
    } 
    public static WebElement homepageRocketMilesNumberOfRooms (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("div.rooms.ng-scope"));
    } 
    public static WebElement homepageRocketMilesSearchButton (WebDriver driver)
    {
    	return driver.findElement(By.cssSelector("button.search-submit-btn"));
    } 
	//----------------------------------End: Default View Elements--------------------------------------//
	//----------------------------------Start: Additional Elements showing up based on actions----------//
    public static WebElement homepageRocketMilesRewardPrograms (WebDriver driver, String rewardsProgramName)
    {
    	return driver.findElement(By.xpath("//a[text()='"+rewardsProgramName+"']"));
    } 
    public static WebElement homepageRocketMilesCalendarStartDate (WebDriver driver, int year, int month, int date)
    {
    	return driver.findElement(By.xpath("//td[@data-month='"+month+"'][@data-year='"+year+"']/a[text()='"+date+"']"));
    }
    public static WebElement homepageRocketMilesCalendarEndDate (WebDriver driver, int year, int month, int date)
    {
    	return driver.findElement(By.xpath("//td[@data-month='"+month+"'][@data-year='"+year+"']/a[text()='"+date+"']"));
    }
    public static WebElement homepageRocketMilesNumberOfGuests (WebDriver driver, int numberOfGuests)
    {
    	return driver.findElement(By.xpath(" //a[text()='"+numberOfGuests+" Guest']"));
    }
    public static WebElement homepageRocketMilesNuberOfRooms (WebDriver driver, int numberOfRooms)
    {
    	return driver.findElement(By.xpath(" //a[text()='"+numberOfRooms+" Guest']"));
    }
	//------------------------------------End: Additional Elements showing up based on actions----------//
}

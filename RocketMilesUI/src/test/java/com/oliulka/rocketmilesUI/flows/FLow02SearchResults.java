package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oliulka.rocketmilesUI.pages.Page02SearchResults;
import com.oliulka.rocketmilesUI.util.Utilities;
public class FLow02SearchResults{
    
    
    public void assertingSearchResults(WebDriver driver) throws InterruptedException 
    {
    	Page02SearchResults page02 = new Page02SearchResults();
    	System.out.println(page02.resultsPageDates(driver).getText());
    	System.out.println(page02.resultsPageDestination(driver).getText());
     }


}
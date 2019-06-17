package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.oliulka.rocketmilesUI.pages.Page02SearchResults;
import com.oliulka.rocketmilesUI.util.Utilities;
public class FLow02SearchResults{
    
    
    public void assertingSearchResults(WebDriver driver, String destination, String rewardsProgram, String CheckInDate, String CheckOutDate,
    		int NumberOfGuests, int NumberOfRooms) throws InterruptedException 
    {
		Utilities util = new Utilities();
    	Page02SearchResults page02 = new Page02SearchResults();
    	System.out.println("Asserting destination point");
    	assertTrue(page02.resultsPageDestination(driver).getText().contains(destination));
      	System.out.println("Destination point was asserted sucessfully");
      	System.out.println("Asserting actual search results");
      	for (int i=1;i<6; i++)
      	{
       	   	String resultsTab = driver.getWindowHandle();
      		page02.resultsPageSpecificResult(driver, i).click();
      		Thread.sleep(1000);
      	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
      	    newTab.remove(resultsTab);
          	System.out.println("Switching to new result tab with result");
      	    driver.switchTo().window(newTab.get(0));
      	    util.WaitForElementVisible(page02.resultsPageSpecificResultCheckInDate(driver), 30);
      	    System.out.println("Asserting result for following hotel - "+driver.getTitle().replaceAll("Rocketmiles - Hotel details:", ""));
      	    //assertTrue(page02.resultsPageSpecificResultCheckInDate(driver).getText().contains("Need to implement calendar"));
      	    //assertTrue(page02.resultsPageSpecificResultCheckOutDate(driver).getText().contains("Need to implement calendar"));
      	    assertEquals(page02.resultsPageSpecificResultNumberORooms(driver).getText(), String.valueOf(NumberOfRooms));
      	    System.out.println("Asserted number of rooms sucessfullt as  - "+NumberOfRooms);
      	    assertEquals(page02.resultsPageSpecificResultNumberOfGuests(driver).getText(), String.valueOf(NumberOfGuests));
      	    System.out.println("Asserted number of rooms sucessfullt as  - "+NumberOfGuests);
      	    System.out.println("Done with this hotel, moving back to results page.");
      	    driver.close();
      	    driver.switchTo().window(resultsTab);
      	}
      	
      	
    	
     }


}
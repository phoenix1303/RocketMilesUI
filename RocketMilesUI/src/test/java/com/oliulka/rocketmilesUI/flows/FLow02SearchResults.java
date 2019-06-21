package com.oliulka.rocketmilesUI.flows;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import com.oliulka.rocketmilesUI.pages.Page02SearchResults;
import com.oliulka.rocketmilesUI.util.Utilities;

public class FLow02SearchResults {
    
    public void assertingSearchResults(WebDriver driver, String destination, String rewardsProgram, String CheckInDate, String CheckOutDate,
    		int NumberOfGuests, int NumberOfRooms) throws InterruptedException 
    {
		Utilities util = new Utilities();
    	Page02SearchResults page02 = new Page02SearchResults();
    	System.out.println("[LOGGING]---------Asserting destination point");
    	assertTrue(page02.resultsPageDestination(driver).getText().contains(destination));
      	System.out.println("[LOGGING]---------Destination point was asserted sucessfully");
      	assertTrue(page02.resultsPagaRewardProgramLogo(driver).size()>0);
      	System.out.println("[LOGGING]---------Asserting actual search results");
      	for (int i=1;i<=3; i++)
      	{
       	   	String resultsTab = driver.getWindowHandle();
      		page02.resultsPageSpecificResult(driver, i).click();
      		while(driver.getWindowHandles().size()==0){
      			Thread.sleep(500);
      		}
      	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
      	    newTab.remove(resultsTab);
          	System.out.println("[LOGGING]---------Switching to new result tab with result");
      	    driver.switchTo().window(newTab.get(0));
      	    System.out.println("[LOGGING]---------Continue testing if site is rocketmiles and hotel has availability");
      	    Thread.sleep(3000);
      	    if(driver.getCurrentUrl().contains("www.rocketmiles.com") && page02.resultsPageSpecificResultReturnBackLinkNoAvailability(driver).size()==0)
      	    {	
	      	    util.WaitForElementVisible(page02.resultsPageSpecificResultCheckInDate(driver), 30);
	      	    System.out.println("[LOGGING]---------Asserting result for following hotel - "+driver.getTitle().replaceAll("Rocketmiles - Hotel details:", ""));
	      	    assertTrue(page02.resultsPageSpecificResultCheckInDate(driver).getText().contains(util.transformDate(CheckInDate)));
	      	    System.out.println("[LOGGING]---------CheckIn date was asserted sucessfully");
	      	    assertTrue(page02.resultsPageSpecificResultCheckOutDate(driver).getText().contains(util.transformDate(CheckOutDate)));
	      	    System.out.println("[LOGGING]---------CheckOut date was asserted sucessfully");
	      	    assertEquals(page02.resultsPageSpecificResultNumberORooms(driver).getText(), String.valueOf(NumberOfRooms));
	      	    System.out.println("[LOGGING]---------Asserted number of rooms sucessfully as  - "+NumberOfRooms);
	      	    assertEquals(page02.resultsPageSpecificResultNumberOfGuests(driver).getText(), String.valueOf(NumberOfGuests));
	      	    System.out.println("[LOGGING]---------Asserted number of guests sucessfully as  - "+NumberOfGuests);
	      	    System.out.println("[LOGGING]---------Done with this hotel, moving back to results page.");
      	    }
      	    else
      	    {
      	    	System.out.println("[LOGGING]---------Automation of other websites is outside of this test's scope");
      	    }
      	    driver.close();
      	    driver.switchTo().window(resultsTab);
      	}  	
     }
}
package com.oliulka.rocketmilesUI.tests;

import org.testng.annotations.Test;
import com.oliulka.rocketmilesUI.RocketMilesUIAbstractTest;
import com.oliulka.rocketmilesUI.flows.FLow01HomePage;
import com.oliulka.rocketmilesUI.flows.FLow02SearchResults;
import com.oliulka.rocketmilesUI.util.Utilities;

public class Test01HomePageTests extends RocketMilesUIAbstractTest {
	
	public final String todayDate = Utilities.todaysDate();
	
	@Test(enabled = true)
	public void Tes01AssertPresenceOfBasicHomePageElements() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageBasicElementsFlow(driver);	
	}
	
	@Test(enabled = true)
	public void Tes01SearchForHotelsInBarcelonaTwoGuestsOneRoom() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		FLow02SearchResults flow02 = new FLow02SearchResults();
		String futuredate = Utilities.futureDate(2);
		flow01.searchForHotel(driver, "Barcelona", "Amazon.com Gift Card", todayDate, futuredate, 2, 1);	
		flow02.assertingSearchResults(driver, "Barcelona", "Amazon.com Gift Card", todayDate, futuredate, 2, 1);
	}
	
	@Test(enabled = true)
	public void Tes01SearchForHotelsInAustinThreeGuestsTwoRooms() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		FLow02SearchResults flow02 = new FLow02SearchResults();
		String futuredate = Utilities.futureDate(1);
		flow01.searchForHotel(driver, "Austin", "United MileagePlus", todayDate, futuredate, 3, 2);	
		flow02.assertingSearchResults(driver, "Austin", "United MileagePlus", todayDate, futuredate, 3, 2);
	}
	
	@Test(enabled = true)
	public void Tes01SearchForHotelsInChicagoFourGuestsThreeRooms() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		FLow02SearchResults flow02 = new FLow02SearchResults();
		String futuredate = Utilities.futureDate(2);
		flow01.searchForHotel(driver, "Chicago", "American Express Membership Rewards", todayDate, futuredate, 4, 3);	
		flow02.assertingSearchResults(driver, "Chicago", "American Express Membership Rewards", todayDate, futuredate, 4, 3);
	}
	
	@Test(enabled = true)
	public void Tes01SearchForHotelsMiamiOneGuestTwoRooms() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		FLow02SearchResults flow02 = new FLow02SearchResults();
		String futuredate = Utilities.futureDate(3);
		flow01.searchForHotel(driver, "Miami", "Asia Miles", todayDate, futuredate, 1, 2);	
		flow02.assertingSearchResults(driver, "Miami", "Asia Miles", todayDate, futuredate, 1, 2);
	}
}

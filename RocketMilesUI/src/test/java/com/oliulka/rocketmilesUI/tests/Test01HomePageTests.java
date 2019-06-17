package com.oliulka.rocketmilesUI.tests;

import org.testng.annotations.Test;

import com.oliulka.rocketmilesUI.RocketMilesUIAbstractTest;
import com.oliulka.rocketmilesUI.flows.FLow01HomePage;
import com.oliulka.rocketmilesUI.flows.FLow02SearchResults;

public class Test01HomePageTests extends RocketMilesUIAbstractTest {
	
	
	@Test(enabled = true)
	public void Tes01AssertPresenceOfBasicHomePageElements() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageBasicElementsFlow(driver);	
	}
	
	@Test(enabled = true)
	public void Tes01SearchForHotels() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		FLow02SearchResults flow02 = new FLow02SearchResults();
		flow01.searchForHotel(driver, "Barcelona", "Amazon.com Gift Card", "2019/5/29", "2019/5/30", 2, 1);	
		flow02.assertingSearchResults(driver, "Barcelona", "Amazon.com Gift Card", "2019/5/29", "2019/5/30", 2, 1);
	}
}

package com.oliulka.rocketmilesUI.tests;

import org.testng.annotations.Test;

import com.oliulka.rocketmilesUI.RocketMilesUIAbstractTest;
import com.oliulka.rocketmilesUI.flows.FLow01HomePage;

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
		flow01.searchForHotel(driver, "Barcelona", "Amazon.com Gift Card", null, null, 2, 1);	
	}
}

package com.oliulka.rocketmilesUI.tests;

import org.testng.annotations.Test;

import com.oliulka.rocketmilesUI.RocketMilesUIAbstractTest;
import com.oliulka.rocketmilesUI.flows.*;
import com.oliulka.rocketmilesUI.pages.Page01HomePage;

public class Test01HomePageTests extends RocketMilesUIAbstractTest {
	
	
	@Test(enabled = true)
	public void Tes01HomePage() throws InterruptedException
	{
		FLow01HomePage flow01 = new FLow01HomePage();
		flow01.homePageBasicElementsFlow(driver);	
	}
}

package com.oliulka.rocketmilesUI.util;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class Utilities {
	
	public void WaitForElementVisible(WebElement element, int seconds) throws InterruptedException
	{
		int count=0;
		while (element.isDisplayed()==false && count<=seconds)
		{
			Thread.sleep(1000);
			count++;
		}
	}
	
	public void WaitForElementInVisible(WebElement element, int seconds) throws InterruptedException
	{
		try{
			int count=0;
			while (element.isDisplayed()==true && count<=seconds)
			{
				Thread.sleep(1000);
				count++;
			}
		} catch(StaleElementReferenceException e)
		{}

	}

}

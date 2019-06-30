package com.oliulka.rocketmilesUI.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.NoSuchElementException;

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
	
	public static String todaysDate()
	{
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		return date.format(localDate);
	}
	
	public static String futureDate(long daysFromToday)
	{
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		return date.format(localDate.plusDays(daysFromToday));
	}
	
	public String transformDate(String date)
	{
		String currentMonth = null;
		if(date.contains("/06/"))
		{
			currentMonth = "Jun";
			//this can be implemented for each month using switch statement
		}
		if(date.contains("/07/"))
		{
			currentMonth = "Jul";
			//this can be implemented for each month using switch statement
		}
		String Day = date.substring(date.length()-2);
		if(Day.startsWith("0"))
		{
			Day = Day.substring(1);
		}
		String newDateFormat = currentMonth+" "+Day+", "+date.substring(0, 4);
		return newDateFormat.replaceAll("/", "");
	}

}

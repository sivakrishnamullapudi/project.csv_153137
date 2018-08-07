package com.cg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage {
	private static WebElement element;
	public static WebElement submit(WebDriver driver ) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.id("final"));
		return element;
	}
	static void makeWait() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}

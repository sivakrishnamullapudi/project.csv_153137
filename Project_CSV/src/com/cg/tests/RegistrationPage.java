package com.cg.tests;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationPage {
	private static WebElement element;
	
	public static WebElement fName(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("fName"));
		return element;
	}
	public static WebElement lName(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("lName"));
		return element;
	}
	public static WebElement mail(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("mail"));
		return element;
	}
	public static WebElement cNum(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("cnum"));
		return element;
	}
	public static WebElement address(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("add"));
		return element;
	}
	public static WebElement city(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("city"));
		return element;
	}
	public static WebElement state(WebDriver driver) throws InterruptedException
	{
		makeWait();
		WebElement state = driver.findElement(By.name("state"));
		return state;
	}
	public static WebElement clickAlert(WebDriver driver) throws InterruptedException
	{
		makeWait();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		return element;
	}
	public static WebElement submit(WebDriver driver) throws InterruptedException
	{
		makeWait();
		element=driver.findElement(By.name("submit"));
		return element;
	}
	
	static void makeWait() throws InterruptedException
	{
		Thread.sleep(2000);
	}

}

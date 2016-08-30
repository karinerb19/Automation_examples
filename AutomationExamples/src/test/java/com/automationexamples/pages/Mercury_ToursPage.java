package com.automationexamples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

public class Mercury_ToursPage {
	
	private WebDriver driver;
	By usernameLocator = By.name("userName");
	By passwordLocator = By.name("password");
	By loginLocator = By.name("login");
	
	By passCountLocator = By.name("passCount");
	By fromPortLocator = By.name("fromPort");
	By fromMonthLocator = By.name("fromMonth");
	By fromDayLocator = By.name("fromDay");
	By toPortLocator = By.name("toPort");
	By toMonthLocator = By.name("toMonth");
	By toDayLocator = By.name("toDay");
	By airlineLocator = By.name("airline");
	
	By roundtripRadioButtonLocator = By.xpath("//input[@value='roundtrip']");
	By onewayRadioButtonLocator = By.xpath("//input[@value='oneway']");
	
	//Coach
	//Business
	//First
	
	public Mercury_ToursPage(WebDriver driver, String urlPage)
	{
		this.driver = driver;
		driver.get(urlPage);
		driver.manage().window().maximize();
		
	}
	
	public void Login(String username, String password)
	{
		driver.findElement(usernameLocator).clear();
		driver.findElement(usernameLocator).sendKeys(username);
		
		driver.findElement(passwordLocator).clear();
		driver.findElement(passwordLocator).sendKeys(password);
		
		driver.findElement(loginLocator).click();
	}
	
	public String jsCalls()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String title = (String) js.executeScript("return document.title");
		
		System.out.println(title);
		return title;
	}
	
	public void jsTestcode()
	{
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		String value = (String) js2.executeScript("var textToChange = document.querySelectorAll();");
	
	}

	public long linksAmount()
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		long linksamount = (Long) js1.executeScript("var links = document.getElementsByTagName('A'); return links.length");
		return linksamount;
	}
	
	public void SelectFlight()
	{
		Select fromPort = new Select(driver.findElement(fromPortLocator));
		fromPort.selectByVisibleText("New York");
		
		WebElement tripType = driver.findElement(roundtripRadioButtonLocator);
		if(!tripType.isSelected())
		{
			tripType.click();
		}
		
			
	}

	
	public Boolean successMessagePresent()
	{
		return true;// driver.findElement(successMessageLocator).isDisplayed();
	}
}

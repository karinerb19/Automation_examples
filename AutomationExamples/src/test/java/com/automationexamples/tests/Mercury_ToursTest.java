package com.automationexamples.tests;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

import static org.junit.Assert.*;

import com.automationexamples.pages.*;

public class Mercury_ToursTest {
	
	private WebDriver driver;
	Mercury_ToursPage page;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		page = new Mercury_ToursPage(driver, "http://www.newtours.demoaut.com/");
	}
	
	@Test
	public void succeeded()
	{
		page.Login("karina.rb195", "kleopatra");
		page.SelectFlight();
		assertEquals("Find a Flight: Mercury Tours:",page.jsCalls());
		String links = String.valueOf(page.linksAmount());
		System.out.println(links);
	}

	@After
	public void tearDown()
	{
		//driver.quit();
	}
}

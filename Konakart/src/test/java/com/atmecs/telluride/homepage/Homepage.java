package com.atmecs.telluride.homepage;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.konakart.helpers.Pageaction;
import com.atmecs.konakart.pathallocator.Pathallocator;
import com.atmecs.konakart.pathallocator.PathallocatorValidation;
import com.atmecs.konakart.testbase.Testbase;


public class Homepage extends Testbase {
	Pathallocator path = new Pathallocator();
	PathallocatorValidation path1 = new PathallocatorValidation();
	

	@Test
	public void homePage() throws Exception {
		path.getdata();	
		
		Pageaction.dropdown(driver, path.getProducttype(),"Computer Peripherals");
		Pageaction.sendkeys(driver, path.getProductsearch(), "logitech");
		Pageaction.click(driver, path.getSearch());
		
		String actualValue = driver.findElement(By.xpath("//a[text()=\"Logitech Illuminated Keyboard\"]")).getText();
		String expectedValue = "Logitech Illuminated Keyboard";
		Assert.assertEquals(actualValue, expectedValue);
		System.out.println("actualValue :" + actualValue);
		 
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path.getProductsearch())));
		
		FluentWait <WebDriver> wait1 = new FluentWait <WebDriver> (driver);
		wait1.withTimeout(10, TimeUnit.SECONDS);
		wait1.pollingEvery(2,TimeUnit.SECONDS);
		wait1.ignoring(NoSuchElementException.class);
				
		
		Pageaction.sendkeys(driver, path.getProductsearch(), "Nikon");
		Pageaction.click(driver, path.getSearch());
		
		String actualValue1 = driver.findElement(By.xpath("//div[@class=\"items-message\"]")).getText();
		String expectedValue1 = "There are no available products.";
		Assert.assertEquals(actualValue1, expectedValue1);
		System.out.println("actualValue1 :" + actualValue1);
	}
	}
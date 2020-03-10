package com.atmecs.konakart.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pageaction {

	public static void click(WebDriver driver, String path) {
		driver.findElement(By.xpath(path)).click();
	}

	public static void sendkeys(WebDriver driver, String path, String data) {
		driver.findElement(By.xpath(path)).sendKeys(data);
	}

	public static void dropdown(WebDriver driver, String path, String text) {
		WebElement element = driver.findElement(By.xpath(path));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}


	 public static void scrollDown(WebDriver driver, String elementPath) {
	JavascriptExecutor javascriptexecutor = (JavascriptExecutor) driver;
	javascriptexecutor.executeScript("arguments[0].scrollIntoView();", elementPath);
	}

	public static void mousehover(WebDriver driver, String path, String text) {
		WebElement element = driver.findElement(By.xpath(path));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

}

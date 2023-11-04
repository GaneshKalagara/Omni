package com.auto.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auto.base.browser;

public class GenericMethods extends browser{
	public static void clickButton(WebDriver d, By locator ) {
		d.findElement(locator).click();
	}
	public static void Sendkeys(WebDriver d, By xpath, String text ) {
		d.findElement(xpath).sendKeys(text);
	}
	public static void isdisplayed(WebDriver d, By xpath ) {
		d.findElement(xpath).isDisplayed();
	}
	public static void clear(WebDriver d, By xpath ) {
		d.findElement(xpath).clear();
		
	}
}

package com.auto.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public WebDriver d;
	
	public WebDriver browserLanch(String URL) {
		WebDriverManager.chromedriver().setup();
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(URL);
		return d;
	}
	
	public void browserClose() {
		d.close();
	}
	
	public void browserQuick() {
		d.quit();
	}

}

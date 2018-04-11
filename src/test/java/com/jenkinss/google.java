package com.jenkinss;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {

	@Test
	public void star() {
		System.setProperty("webdriver.chrome.driver", "D:\\MS OFFICE\\SELENIUM\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		
	}

}

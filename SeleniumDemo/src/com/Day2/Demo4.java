package com.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.urbanladder.com/");
		w.manage().window().maximize();
		Thread.sleep(10000);
		WebElement google=w.findElement(By.className("google-auth"));
		google.click();
	}
}

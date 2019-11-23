package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
	WebDriver w=new ChromeDriver();
	w.get("https://www.myntra.com/");
	w.manage().window().maximize();
	Thread.sleep(3000);
	WebElement search=w.findElement(By.className("desktop-searchBar"));
	search.sendKeys("Shirts",Keys.ENTER);
	WebElement shirt1=w.findElement(By.xpath("//img[@class='img-responsive']"));
	shirt1.click();
}
}

package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com/");
		w.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=w.findElement(By.name("q"));
		search.sendKeys("Java");
		Thread.sleep(3000);
		WebElement enter=w.findElement(By.name("btnK"));
		enter.click();
		Thread.sleep(5000);
		WebElement images=w.findElement(By.xpath("//a[contains(.,'Images')]"));
		images.click();
		w.findElement(By.id("rT8rqQKh8jt3DM:")).click();
	}

}

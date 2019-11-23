package com.Day2;

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
		WebElement data=w.findElement(By.name("q"));
		data.sendKeys("Java");
		Thread.sleep(5000);
		WebElement enter=w.findElement(By.name("btnK"));
		enter.click();
		Thread.sleep(3000);
		WebElement data1=w.findElement(By.name("q"));
		data1.clear();
		Thread.sleep(2000);
		WebElement data2=w.findElement(By.name("q"));
		data2.sendKeys("Selenium");
		Thread.sleep(5000);
		WebElement enter1=w.findElement(By.className("FAuhyb"));
		enter1.click();
		
	}

}

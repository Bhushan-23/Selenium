package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
		Thread.sleep(3000);
		WebElement pop=w.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		pop.click();
		Thread.sleep(10000);
		WebElement Mi=w.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		Mi.click();
	}

}

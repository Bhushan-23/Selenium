package com.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.gmail.com/");
		w.manage().window().maximize();
		WebElement email= w.findElement(By.id("identifierId"));
		email.sendKeys("bhushanbpujar");
		WebElement log1=w.findElement(By.id("identifierNext"));
		log1.click();
		Thread.sleep(2000);
		WebElement pas= w.findElement(By.name("password"));
		pas.sendKeys("ABCD");
		WebElement log2=w.findElement(By.id("passwordNext"));
		log2.click();
		
		
		
			
		
	}

}

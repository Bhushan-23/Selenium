package com.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://actitime.jmr.co.za/actitime/login.do");
		w.manage().window().maximize();
		Thread.sleep(3000);
		WebElement user=w.findElement(By.name("username"));
		user.sendKeys("admin");
		Thread.sleep(3000);
		WebElement log=w.findElement(By.name("pwd"));
		log.sendKeys("manager");
		Thread.sleep(2000);
		WebElement button=w.findElement(By.id("loginButton"));
		button.click();
		
		

	}
}

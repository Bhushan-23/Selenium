package com.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		WebElement email=w.findElement(By.id("email"));
		//email.sendKeys("abcd");
		WebElement pas=w.findElement(By.id("pass"));
		//pas.sendKeys("abcd");
	//	WebElement log=w.findElement(By.id("loginbutton"));
	//	log.click();
		WebElement z=w.findElement(By.xpath("//td[@class='html7magic']"));
		email.sendKeys(z.getText());
	}
}

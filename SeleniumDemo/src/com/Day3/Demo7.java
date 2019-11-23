package com.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		
		Thread.sleep(2000);
		WebElement option4 = driver.findElement(By.xpath("//span[contains(.,'java interview questions')]"));
		option4.click();
		Thread.sleep(5000);
		
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(.,'java interview questions')]"));
		
		for(WebElement list : suggestions)
			System.out.println(list.getText());
		
		driver.findElement(By.xpath("//div[@class='sbl1']")).click();

	}

}
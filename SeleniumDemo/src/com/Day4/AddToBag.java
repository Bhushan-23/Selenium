package com.Day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToBag {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shirt",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class=\"img-responsive\"]")).click();
		Thread.sleep(3000);
		Set<String> wins=driver.getWindowHandles();
		for(String z:wins)
		{
			driver.switchTo().window(z);
		}
		driver.findElement(By.xpath("//div[@class='size-buttons-size-buttons']//p[contains(.,'40')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		Thread.sleep(3000);
		
		

	}

}
package com.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://www.urbanladder.com/");
		w.manage().window().maximize();
		Thread.sleep(10000);
		WebElement pop=w.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		pop.click();
		Thread.sleep(5000);
		WebElement dining=w.findElement(By.xpath("//li[@class='topnav_item diningunit']"));
		//dining.click();
		Thread.sleep(3000);
		List <WebElement> living=w.findElements(By.xpath("//li/span[contains(.,'Living')]/parent::li/descendant::ul[@class='taxonlist']"));
		for(WebElement z:living) {
			System.out.println(z.getText());
		}
		Thread.sleep(3000);
		
		System.out.println(dining.getText());
		WebElement search=w.findElement(By.xpath("//input[@placeholder='Search']"));
		search.sendKeys(dining.getText());
		WebElement stores=w.findElement(By.xpath("//li/a[contains(.,'Stores')]"));
		System.out.println(stores.getText());
		List <WebElement> menu = w.findElements(By.xpath("//ul[@class='topnav bodytext']"));
		for(WebElement z: menu) {
		System.out.println(z.getText());
		} 
	}

}




package com.Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement a1 = driver.findElement(By.id("login"));
		a1.click();
		Thread.sleep(2000);
	    driver.findElement(By.id("email-id")).sendKeys("bhushanatheaven@gmail.com",Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("bhushan@23",Keys.ENTER);
	}

}
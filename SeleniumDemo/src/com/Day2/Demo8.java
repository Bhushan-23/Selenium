package com.Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@type=\\\"email\\\"]\""));
		System.out.println(email.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type=\\\"email\\\"]\"")).sendKeys(email.getText());
		Thread.sleep(5000);
		WebElement pass = driver.findElement(By.xpath("//label[@for=\\\"pass\\\"]\""));
		System.out.println(pass.getText());
		driver.findElement(By.xpath("//input[@type=\\\"pass\\\"]\"")).sendKeys(pass.getText());
		Thread.sleep(5000);
		email.sendKeys("email.gettext()");
        
	}

}
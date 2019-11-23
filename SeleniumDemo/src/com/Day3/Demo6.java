package com.Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Software//chromedriver.exe");
		WebDriver w= new ChromeDriver();
		w.get("https://www.google.com");
		w.manage().window().maximize();
		WebElement search= w.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("java");
		//List <WebElement> search1= w.findElements(By.xpath("//form[@class='tsf nj']"));
		//for(WebElement z:search1)
		//{
		//System.out.println(z.getText());
		//}
		Thread.sleep(5000);
		WebElement search2= w.findElement(By.xpath("//span[contains(.,' interview questions')]"));
		search2.click();
		Thread.sleep(5000);
		WebElement link1= w.findElement(By.xpath("//span[contains(.,'800+ Java Interview Questions | Answered with diagrams & code‎')]"));
		System.out.println(link1.getText());
		Thread.sleep(5000);
		WebElement link2= w.findElement(By.xpath("//span[contains(.,'Top 50+ Core Java Interview Questions and Answers')]"));
		System.out.println(link2.getText());
		Thread.sleep(5000);
		WebElement link3= w.findElement(By.xpath("//span[contains(.,'Core Java Interview Questions and Answers - JournalDev')]"));
		System.out.println(link3.getText());
		Thread.sleep(5000);
		WebElement link4= w.findElement(By.xpath("//span[contains(.,'100+ Java Interview Questions And Answers For 2019 | Edureka')]"));
		System.out.println(link4.getText());
		Thread.sleep(5000);
		WebElement link5= w.findElement(By.xpath("//span[contains(.,'100+ Core JAVA Interview Questions & Answers - Guru99')]"));
		System.out.println(link5.getText());
		Thread.sleep(5000);
		WebElement link6= w.findElement(By.xpath("//span[contains(.,'Java Interview Questions - Tutorialspoint')]"));
		System.out.println(link6.getText());
		Thread.sleep(5000);
		
		WebElement link7= w.findElement(By.xpath("//span[contains(.,'Java Interview Questions - Preparation Guide - HowToDoInJava')]"));
		System.out.println(link7.getText());
		Thread.sleep(5000);
		WebElement link8= w.findElement(By.xpath("//span[contains(.,'Java Interview Questions - Tutorialspoint')]"));
		System.out.println(link8.getText());
		Thread.sleep(5000);
		WebElement link9= w.findElement(By.xpath("//span[contains(.,'Java Interview Questions - Preparation Guide - HowToDoInJava')]"));
		System.out.println(link9.getText());
		Thread.sleep(5000);
		
}
}
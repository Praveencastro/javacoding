package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\91638\\eclipse-workspace\\Selenium test\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.xpath("(//button)[2]")).click();
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("(//button)[3]")).click();
//		Thread.sleep(7000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("(//button)[4]")).click();
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("(//button)[5]")).click();
//		Alert ss= driver.switchTo().alert();
//	ss.sendKeys("hahahsh");
//	System.out.println(ss.getText());
//		Thread.sleep(2000);
//		ss.accept();
		System.out.println("---------------------------------------------------------------------");
		driver.navigate().to("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		Alert bb = driver.switchTo().alert();
		System.out.println(bb.getText());
		bb.dismiss();
		driver.findElement(By.id("prompt")).click();
		Alert gg = driver.switchTo().alert();
		gg.sendKeys("hhuhhgud");
		System.out.println(gg.getText());
		Thread.sleep(1000);
		gg.accept();
		driver.findElement(By.xpath(" //button[@id = 'modern']")).click();
		driver.findElement(By.xpath(" //button[@aria-label = 'close']")).click();
		
		
		 
		
		
		
	}
}

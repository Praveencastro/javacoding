package com.alert;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91638\\eclipse-workspace\\Selenium test\\chrome\\chromedriver.exe");
				        WebDriver driver = new ChromeDriver();
				        driver.get("https://easyupload.io/");
				      JavascriptExecutor js = (JavascriptExecutor)driver;
				      Thread.sleep(3000);
				       WebElement filechoose = driver.findElement(By.xpath("//div[@class='dz-default dz-message']/button[@type='button']"));
				      filechoose.click(); 
//				       js.executeScript("argument[0].scrollIntoView();", filechoose);
//				       js.executeScript("argument[0].click();",filechoose);
				        Runtime.getRuntime().exec("C:\\Users\\91638\\eclipse-workspace\\Selenium test\\autoai\\fileupload.exe");
	}
		
	}



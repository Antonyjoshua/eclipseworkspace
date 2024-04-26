package com.MyHotelAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PMS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
	     driver.get("https://acwpms.com/");
	     driver.manage().window().maximize();
	     WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
	     username.sendKeys("info@myhotelai.com");
	     WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	  	 password.sendKeys("pass123");
	  	 //to verify the recapcha we need to make the webdriver wait and manually clear it
	  	 Thread.sleep(30000);
//	  	  try {
//	            Thread.sleep(10000); // Wait for 10 seconds
//	        } catch (InterruptedException e) {
//	           System.out.println("Unable to clear");
//	        }
	  	 WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
	  	 login.click();
	  	 

	}

}

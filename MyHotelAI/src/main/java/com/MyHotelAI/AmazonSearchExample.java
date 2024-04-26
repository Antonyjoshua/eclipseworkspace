package com.MyHotelAI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("smart");

		// Use Actions class to send DOWN arrow key
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.DOWN).build().perform();

		// Explicit wait for the suggestion list to be visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement suggestionList = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='s-suggestion-container']")));

		// Check if "smart watch" is in the suggestion list
		WebElement smartWatchOption = suggestionList.findElement(By.xpath("(//div/span[@class='s-heavy'])[3]"));
		if (smartWatchOption.isDisplayed()) {
			// If "smart watch" is in the suggestion list, click on it
			smartWatchOption.click();
			System.out.println("Selected 'smart watch' from suggestions.");
		} else {
			System.out.println("'smart watch' not found in suggestions.");
		}

		// Additional actions or validations can be added here

		// Close the browser
		driver.quit();
	}
}

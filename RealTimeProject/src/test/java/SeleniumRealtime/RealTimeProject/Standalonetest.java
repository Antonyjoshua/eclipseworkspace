package SeleniumRealtime.RealTimeProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Standalonetest {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("antony@yopmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Welcome@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("div.mb-3"));
		for (int i = 0; i < products.size(); i++) {
			
			if(products.get(i).getText().contains("ADIDAS ORIGINAL"))
			{
				//button[@class='btn w-10 rounded']
				driver.findElements(By.xpath("//button[@class='btn w-10 rounded']")).get(i).click();
			}
			
		}

		// Using Java streams
//		WebElement prod= products.stream().filter(product->
//		product.findElement(By.cssSelector("b")).getText().equals("ADIDAS ORIGINAL")).findFirst().orElse(null);
//		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		}

}

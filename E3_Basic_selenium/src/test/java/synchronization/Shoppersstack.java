package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/products_page/21");
		
		driver.findElement(By.id("Check Delivery")).sendKeys("201017");
//		driver.findElement(By.id("Check")).click(); //ElementClickInterceptedException
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();
		
		FluentWait wait2 = new FluentWait(driver);
		wait2.withTimeout(Duration.ofSeconds(15));
		wait2.pollingEvery(Duration.ofSeconds(2));
		wait2.ignoring(ElementClickInterceptedException.class);	
	}
}

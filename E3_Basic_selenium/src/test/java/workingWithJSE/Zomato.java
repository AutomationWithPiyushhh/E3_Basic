package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location='https://www.zomato.com/';");

		jse.executeScript("window.scrollBy(0,300);");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,300);");
		Thread.sleep(500);
		jse.executeScript("window.scrollTo(0,300);");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,300);");

		Thread.sleep(3000);
		driver.quit();
	}
}

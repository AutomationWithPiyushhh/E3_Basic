package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");

		WebElement element = driver.findElement(By.xpath("(//div[text()='Check it out'])[2]"));

//		Actions act = new Actions(driver);
//		act.scrollByAmount(0, 1000).build().perform();
//		act.scrollToElement(element).build().perform();

//		scrollIntoView(boolean)

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(1000);
		jse.executeScript("arguments[0].scrollIntoView(true)", element);

	}
}

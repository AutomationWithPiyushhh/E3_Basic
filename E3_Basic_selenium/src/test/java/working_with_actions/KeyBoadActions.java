package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoadActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");
		
//		WebElement pwd = driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
//		act.sendKeys("admin" + Keys.TAB + "admin@123" + Keys.ENTER).perform();

		act.sendKeys("admin").perform();
		
		act.keyDown(Keys.TAB).build().perform();
		act.keyUp(Keys.TAB).build().perform();
		
		act.sendKeys("admin@123").perform();
		
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();
			
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}

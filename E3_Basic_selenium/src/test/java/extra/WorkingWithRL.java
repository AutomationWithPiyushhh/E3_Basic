package extra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WorkingWithRL {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(RelativeLocator
							.with(By.tagName("input"))
//							.below(By.id("email"))	
//							.above(By.id("email"))	
//							.near(By.name("email"))
//							.toLeftOf(By.id("abc"))
//							.toRightOf(By.id("abc"))
				).sendKeys("admiasdnfhadf");
	}
}

package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripConfirmPopup {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/search?q=12345678");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.name("q")).sendKeys("Computers");

	}
}

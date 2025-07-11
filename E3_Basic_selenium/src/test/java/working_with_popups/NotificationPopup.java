package working_with_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
//		setting.addArguments("--incognito");
//		setting.addArguments("--start-maximized");
		
		
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com/");
		
		

		Thread.sleep(3000);
		driver.quit();
	}
}

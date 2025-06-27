package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		driver.get("https://www.facebook.com/");
//		
//		WebElement loginbtn = driver.findElement(By.name("login"));
//		
		Actions act = new Actions(driver);
//		act.moveToElement(loginbtn).build().perform();
//		Thread.sleep(3000);
////		act.click().build().perform();
//		
//		act.contextClick().build().perform();
//		
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement dc = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		act.moveToElement(dc).build().perform();
//		act.doubleClick().build().perform();
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		
		WebElement eye = driver.findElement(By.className("shownhide"));
		
		act.clickAndHold(eye).build().perform();
		
		Thread.sleep(5000);
		act.release().build().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}

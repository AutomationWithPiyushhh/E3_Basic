package workingWithJSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement password = driver.findElement(By.name("pass"));
		WebElement username = driver.findElement(By.name("email"));
		
		String un = "unknown";
		
		jse.executeScript("arguments[2].value=arguments[4];","admin","Drishti",username,"Pankaj",un);
		jse.executeScript("arguments[0].value='admin@123';",password);
		
		
//		jse.executeScript("document.getElementById('email').value='admin';");
//		jse.executeScript("document.getElementById('pass').value='admin123456';");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		
//		loginBtn.click();
//		jse.executeScript("javascript ka code", arguments jo aayega java se)
		jse.executeScript("arguments[0].click()",loginBtn);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

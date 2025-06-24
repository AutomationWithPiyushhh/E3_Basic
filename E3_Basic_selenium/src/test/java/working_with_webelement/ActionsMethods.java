package working_with_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("admin");
		Thread.sleep(1000);
		un.clear();

		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginbtn.click();

		String textOfLogin = loginbtn.getText();
		System.out.println("textOfLogin : " + textOfLogin);

		System.out.println("Loginbtn font color : " +loginbtn.getCssValue("color"));
		
		
		if (loginbtn.isDisplayed()) {
			if (loginbtn.isEnabled()) {
				loginbtn.submit();
			} else {
				System.out.println("Loginbtn is not enabled...");
			}
		} else {
			System.out.println("loginbtn is not visible");
		}

	}
}

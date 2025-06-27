package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("file:///C:/Users/User/git/E3_Basic/E3_Basic_selenium/src/test/java/dropdown/multiselect.html");

		WebElement carDD = driver.findElement(By.id("cars"));
		Select selCar = new Select(carDD);
		Boolean status = selCar.isMultiple();
		System.out.println(status);

		Thread.sleep(3000);
		driver.quit();
	}
}

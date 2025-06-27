package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("file:///C:/Users/User/git/E3_Basic/E3_Basic_selenium/src/test/java/dropdown/multiselect.html");

		WebElement carDD = driver.findElement(By.id("cars"));
		Select selCar = new Select(carDD);

		if (selCar.isMultiple()) {
			System.out.println("Your given DD is multi select");
		} else {
			System.out.println("its not multiselect");
		}

		selCar.selectByIndex(1);
		selCar.selectByIndex(2);

//		Thread.sleep(2000);
//		selCar.deselectByIndex(2);

		Thread.sleep(2000);
		selCar.selectByIndex(3);

//		Thread.sleep(2000);
//		selCar.deselectAll();

		String valueOfFirstSelected = selCar.getFirstSelectedOption().getText();
		System.out.println(valueOfFirstSelected);

		List<WebElement> carsSelected = selCar.getAllSelectedOptions();
		for (WebElement i : carsSelected) {
			System.out.println(i.getText());
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
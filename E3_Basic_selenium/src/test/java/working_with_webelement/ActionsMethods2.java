package working_with_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsMethods2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/r.php?entry_point=login");

		WebElement male = driver.findElement(By.cssSelector("input[value='2']"));
		male.click();

		String tagOfMale = male.getTagName();
		String valueOfType = male.getAttribute("type");

		System.out.println("tagOfMale : " + tagOfMale);
		System.out.println("valueOfType : " + valueOfType);

		Thread.sleep(1000);

		if (male.isSelected()) {
			System.out.println("Male is selected");
		}

	}
}

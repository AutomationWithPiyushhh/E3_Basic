package handling_window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		try {
			driver.get("https://www.shoppersstack.com/products_page/23");

//			step 1 : get the home address
			String parentID = driver.getWindowHandle();
			System.out.println(parentID);

//			step 2 : Clicking on the i button so that every child windows can open
			driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='InfoOutlinedIcon']")).click();

//			step 3 : Getting the session IDs of every window
			Set<String> IDs = driver.getWindowHandles();
			IDs.remove(parentID);

			for (String i : IDs) {
//				System.out.println(i);
				driver.switchTo().window(i);

				System.out.println(driver.getCurrentUrl());

//				System.out.println(driver.getCurrentUrl());

//				step 4 : by if condition go to particular webpage and perform task
				if (driver.getCurrentUrl().equals("https://www.amazon.in/")) {
					Thread.sleep(2000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
//					driver.findElement(By.xpath("//span[text()='Login']")).click();
					break;
				}
			}
			driver.close();
			Thread.sleep(2000);

//			step 5 : come back to home
			driver.switchTo().window(parentID);
			driver.close();

		}

		finally {

			Thread.sleep(1000);
			driver.quit();

		}
	}
}

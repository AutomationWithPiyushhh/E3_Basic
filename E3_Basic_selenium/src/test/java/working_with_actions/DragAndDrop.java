package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement cap1 = driver.findElement(By.id("box1"));
		WebElement country1 = driver.findElement(By.id("box101"));

		WebElement cap2 = driver.findElement(By.id("box2"));
		WebElement country2 = driver.findElement(By.id("box102"));

		WebElement cap3 = driver.findElement(By.id("box3"));
		WebElement country3 = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(cap1, country2).build().perform();
		act.dragAndDrop(cap2, country1).perform();
		act.dragAndDrop(cap3, country3).perform();
		
	}
}

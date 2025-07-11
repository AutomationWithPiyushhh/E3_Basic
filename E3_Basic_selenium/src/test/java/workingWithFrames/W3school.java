package workingWithFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='iframewrapper']/child::iframe"));
		
//		driver.switchTo().frame(0); because we are not sure about the numbers
//		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(frame);
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.id("runbtn")).click();
		
		System.out.println("clicked on Submit button");
	}
}

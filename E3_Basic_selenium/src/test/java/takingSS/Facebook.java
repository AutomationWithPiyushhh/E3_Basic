package takingSS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Facebook {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
//		Taking screenshot of a webpage
		TakesScreenshot tks = (TakesScreenshot) driver;
		File source = tks.getScreenshotAs(OutputType.FILE);
		File destination = new File("path of file1.png");	
		FileHandler.copy(source, destination);
		
//		Taking screenshot of a webelement
		WebElement loginbtn = driver.findElement(By.name("login"));
		File source1 = loginbtn.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("path of file2.png");	
		FileHandler.copy(source1, destination1);
	}
}

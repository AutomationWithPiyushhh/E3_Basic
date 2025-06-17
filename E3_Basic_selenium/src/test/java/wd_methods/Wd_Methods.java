package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wd_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		String title = driver.getTitle();
		System.out.println(title);

		String url = driver.getCurrentUrl();
		System.out.println(url);

//		String sourceCode = driver.getPageSource();
//		System.out.println(sourceCode);

//		driver.switchTo().newWindow(WindowType.TAB);

//		driver.findElement(By.linkText("Meta")).click();

		driver.manage().window().maximize();
		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		Thread.sleep(1000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(1000);

		Window win = driver.manage().window();

		Dimension dim = win.getSize();
		System.out.println(dim);

		int h = dim.getHeight();
		int w = dim.getWidth();
		System.out.println(w + " " + h);

		Dimension dim2 = new Dimension(500, 500);

		win.setSize(dim2);
		
		
		Point pt = win.getPosition();
		System.out.println(pt);
		
		System.out.println("X : " + pt.getX());
		System.out.println("Y : " + pt.getY());
		
		
		Point pt2 = new Point(200,300);
		
		win.setPosition(pt2);
		

		
		Thread.sleep(10000);

		driver.close();
	}
}

package FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
//		driver.switchTo().frame("frame1_a");
		driver.findElement(By.name("iframe_a"));
		// driver.switchTo().frame(frame);
		// String frame = driver.findElement(By.xpath("//a[text()='Current
		// Affairs']")).getText();

	}

}

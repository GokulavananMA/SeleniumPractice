package flipkartPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartProductPrice2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("basketball");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text = driver
				.findElement(
						By.xpath("//a[text()='NIVIA Engraver Basketball - Size: 7']/following-sibling::a/div[1]/div"))
				.getText();
		System.out.println(text);
		driver.quit();
	}
}

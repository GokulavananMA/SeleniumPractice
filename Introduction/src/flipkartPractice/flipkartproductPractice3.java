package flipkartPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartproductPractice3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("i watch apple");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//a[text()='Apple Watch Series7 (GPS + Cellular, 45mm)Blue Aluminiu...']/following-sibling::a/div/div")).getText();
		System.out.println(text);
		driver.quit();
	}

}

package flipkartPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartProductPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("tshirt");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String text = driver
				.findElement(By.xpath(
						"//a[text()='Men Printed Round Neck Pure Cotton Brown T-Shirt']/following-sibling::a/div/div"))
				.getText();
		System.out.println(text);
		driver.quit();
	}

}


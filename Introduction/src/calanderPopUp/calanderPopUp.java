package calanderPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calanderPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("first_date_picker")).click();
		boolean result = true;

		while (result) {
			String monthText = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if ((monthText).contains("December 2023")) {
				driver.findElement(By.xpath("//a[text()='25']")).click();
				break;
			} else {
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
			driver.quit();
		}
	}

}

package keyboardHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysEnum {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manugowda123@gmail.com", Keys.TAB, "12345678", Keys.TAB,
				Keys.SPACE, Keys.TAB, Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}

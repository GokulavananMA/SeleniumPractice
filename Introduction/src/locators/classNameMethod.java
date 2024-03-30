package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement login= driver.findElement(By.className("ico-login"));
//		login.click();
		driver.findElement(By.className("ico-login")).click();
		driver.quit();
	}

}

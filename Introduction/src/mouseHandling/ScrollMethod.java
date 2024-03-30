package mouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Labels:']"));
		Actions act = new Actions(driver);
		act.scrollToElement(scroll);
		Thread.sleep(3000);

		act.perform();
		driver.quit();
	}

}

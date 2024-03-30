package mouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement click = driver
				.findElement(By.xpath("//button[contains(text(),'Double-Click me to see Alert message')]"));
		Actions act = new Actions(driver);
		act.doubleClick(click);// with argument method overloading
		// act.moveToElement(Electronic).doubleClick(); without argument method
		// overloading
		act.perform();
		driver.quit();
	}

}

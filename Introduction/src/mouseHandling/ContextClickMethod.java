package mouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement electroinc = driver.findElement(By.xpath("//a[contains(text(),'Electronics')][1]"));
		Actions act = new Actions(driver);
		act.contextClick(electroinc);// with argument method overloading
		// act.moveToElement(Electronic).contextClick(); without argument method
		// overloading
		act.perform();
		driver.quit();
	}

}

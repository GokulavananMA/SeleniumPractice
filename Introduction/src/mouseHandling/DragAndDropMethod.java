package mouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Labels:']"));
		WebElement dragElement = driver.findElement(By.id("draggable"));
		WebElement dropElement = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.scrollToElement(scroll);
		act.clickAndHold(dragElement).moveToElement(dropElement).release();
		// act.moveToElement(dropElement).clickAndHold().moveToElement(dropElement).release();
		// act.dragAndDrop(dragElement, dropElement);
		Thread.sleep(3000);

		act.perform();
		driver.quit();
	}

}

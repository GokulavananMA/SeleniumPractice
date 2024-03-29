package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/cars/");
		driver.findElement(By.id("downshift-1-input")).sendKeys("vela");
		Thread.sleep(3000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//div[@role='option']"));
		for(WebElement sugg:autosugg)
		{
			String text=sugg.getText();
			if(text.contains("Velachery"))
			{
				sugg.click();
				break;
			}
		}
		driver.quit();
	}

}

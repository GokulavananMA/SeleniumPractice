package seleniumChallange;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qaplayground.dev/apps/tags-input-box/");
		List<WebElement> elements = driver.findElements(By.tagName("li"));
		int tagsCount = elements.size();
		
		System.out.println("Count of Tags: "+tagsCount);

		
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc",Keys.ENTER,"java",Keys.ENTER,"appium",Keys.ENTER,"r",Keys.ENTER,"app",Keys.ENTER,"rust",Keys.ENTER,"rrr",Keys.ENTER,"car",Keys.ENTER,"road",Keys.ENTER,"van",Keys.ENTER,"bike",Keys.ENTER);
		WebElement match = driver.findElement(By.xpath("//div[@class='details']/p/span"));
		String countRemaining = match.getText();
		if(countRemaining.equals("0")) {
			System.out.println("Count is Zero Hence Verified");
		}
		else {
			System.out.println("Count is not Zero Hence Not Verified");
		}
		driver.quit();
	}

}

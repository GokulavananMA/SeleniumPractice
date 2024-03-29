package shopperStack;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ss_001_Add_to_cart {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
		loginbtn.click();
		driver.findElement(By.id("Email")).sendKeys("gokulavanan31@gmail.com",Keys.TAB,"gokulJAMES@3105",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.id("search")).sendKeys("men");
		driver.findElement(By.id("searchBtn")).click();
		driver.navigate().refresh();
		driver.findElement(By.className("css-k58djc")).click();
		driver.findElement(By.id("cart")).click();
		
		File path = new File("./ScreenShots/cartPg.png");
		File sc =ts.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(sc, path);
		
		
		driver.quit();
		
		

	}

}

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
import org.openqa.selenium.io.FileHandler;

public class E2E_05_Search {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot) driver;
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		WebElement loginbtn=driver.findElement(By.id("loginBtn"));
		loginbtn.click();
		driver.findElement(By.id("Email")).sendKeys("gokulavanan31@gmail.com",Keys.TAB,"gokulJAMES@3105",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.id("search")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[name()='svg' and @id='searchBtn']")).click();
		
		driver.findElement(By.className("css-bjoz8z")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/li[6]")).click();
		
		File path = new File("./ScreenShots/E2Esearch.png");
		File ss=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, path);
		
		driver.quit();
	}

}

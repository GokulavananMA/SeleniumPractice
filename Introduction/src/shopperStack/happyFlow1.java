package shopperStack;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class happyFlow1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot) driver;
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		Thread.sleep(3000);
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.id("Email")).sendKeys("gokulavanan31@gmail.com",Keys.TAB,"gokulJAMES@3105",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("women")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='svg'and @data-testid='FavoriteIcon']")).click();
		driver.findElement(By.xpath("//*[name()='svg'and @data-testid='SettingsIcon']")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='wishlist_wishlistProduct__8i+Bx'][3]/div[2]/h2")).getText());
		//WebElement present = driver.findElement(By.xpath("//div[@class='wishlist_listContainer__8f0IY']/div[3]"));
		String wishlistText = driver.findElement(By.xpath("//div[@class='wishlist_wishlistProduct__8i+Bx'][3]/div[2]/h2")).getText();
		if(wishlistText.contains("FOREVER 21  Casual Regular Sleeves Solid Women Black Top"))
		{
			System.out.println("succesfully verifed");
		}
		else
		{
			System.out.println("faild");
		}
		
		File path = new File("./ScreenShots/whishlist.png");
		File sc =ts.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(sc, path);
		
		
		driver.quit();
	}

}

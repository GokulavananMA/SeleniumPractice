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

public class ss_005_Edit_the_Address {
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
		//account setting
		driver.findElement(By.className("css-bjoz8z")).click();
		//profile
		driver.findElement(By.xpath("//ul[@role='menu']/li[1]")).click();
		//my address
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		
		driver.findElement(By.id("editaddress_fl")).click();
		
		driver.findElement(By.id("Phone Number")).sendKeys("2345987601");
		driver.findElement(By.id("Update Address")).click();
		

		File path = new File("./ScreenShots/editAddress.png");
		File sc =ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, path);
		
		driver.quit();
		
	}
}

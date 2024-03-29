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
import org.openqa.selenium.support.ui.Select;

public class ss_004_Add_Address {

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
		
		driver.findElement(By.className("css-1hw9j7s")).click();
		
		driver.findElement(By.id("Name")).sendKeys("gokulavanan",Keys.TAB,"no 16",Keys.TAB,"pudur",Keys.TAB,"ambattur",Keys.TAB,Keys.ENTER,Keys.ARROW_DOWN,Keys.ENTER);
		
		WebElement state = driver.findElement(By.name("State"));
		Select sel=new Select(state);
		sel.selectByValue("Tamil Nadu");
		
		WebElement City = driver.findElement(By.name("City"));
		Select sel1=new Select(City);
		sel1.selectByValue("Chennai");
		
		driver.findElement(By.id("Pincode")).sendKeys("432101",Keys.TAB,"0987654321",Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.className("css-bjoz8z")).click();
		//profile
		driver.findElement(By.xpath("//ul[@role='menu']/li[1]")).click();
		//my address
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		
		
		File path = new File("./ScreenShots/AddAddress.png");
		File sc =ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, path);
		
		
		driver.quit();
		
	
	}

}

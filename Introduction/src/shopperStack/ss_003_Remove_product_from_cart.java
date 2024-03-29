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

public class ss_003_Remove_product_from_cart {
	
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
		
		driver.findElement(By.id("search")).sendKeys("women");
		driver.findElement(By.id("searchBtn")).click();
		driver.navigate().refresh();
		driver.findElement(By.className("css-k58djc")).click();
		driver.findElement(By.id("cart")).click();
	
		driver.findElement(By.className("css-1bhvu8")).click();
		
		driver.findElement(By.className("css-1ap6el4")).click();
		
		
		String confirmation=driver.findElement(By.xpath("//div[@class='cart_checkoutProductContainer__jtOKS']/div/h2")).getText();
		String text= "Your cart is empty!";
		if(confirmation.contains(text))
		{
			System.out.println("empty cart is  sucessfully displayed");
		}
		else
		{
			System.out.println("failed");
		}
		
		File path = new File("./ScreenShots/emptyCart.png");
		File sc =ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, path);
		
		
		driver.quit();
	}
}

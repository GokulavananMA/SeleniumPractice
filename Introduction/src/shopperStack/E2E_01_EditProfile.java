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

public class E2E_01_EditProfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver (); 
		TakesScreenshot ts=( TakesScreenshot)driver;
		driver.manage () .window(). maximize();
		driver.get("https://www.shoppersstack.com/");
		//Home page
		driver.manage ().timeouts(). implicitlyWait(Duration.ofSeconds(50));
		WebElement loginbtn= driver.findElement(By.id("loginBtn"));
		// LoginButton
		loginbtn.click();
		//login page
		
		driver.findElement(By.id("Email")).sendKeys("gokulavanan31@gmail.com",Keys.TAB,"gokulJAMES@3105",Keys.TAB,Keys.TAB,Keys.ENTER);
		//Home page 
		driver.findElement (By.className("css-1rzb3uu")).click();
		driver.findElement(By.xpath( " //li @class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1kmlehz'][2]")). click ();
		//Wish list page 
		driver.findElement (By.xpath( "/ /button[text ()='Add To Cart']")).click();
		driver.findElement(By.id( "cartIcon")).click(); 
		//cart page 
		Thread.sleep (2000);
		driver.findElement(By.id( "buynow_f1")).click();
		//Address page 
		driver.findElement(By. className ("selectaddress_adneadd__cICdt")). click ();
		//address form page
		driver.findElement(By.id( "Name")) .sendKeys( "Dinesh kumar"); 
		driver.findElement(By.id( "House/Office Info")).sendKeys("833");
		driver.findElement(By.id( "Street Info")).sendKeys("12th main");
		driver.findElement(By.id( "Landmark")).sendKeys( "Central mall");
		WebElement contryDropDown = driver.findElement(By.id( "Country"));
		Select contry=new Select (contryDropDown);
		contry.selectByVisibleText ( "Canada");
		WebElement stateDropDown = driver.findElement(By.id( "State")); 
		Select state=new Select( stateDropDown); state.selectByVisibleText( "Alberta");
		WebElement cityDropDown = driver.findElement(By.id("City"));
		Select city=new Select ( cityDropDown); 
		city.selectByVisibleText( "Blackfalds");
		driver.findElement(By.id( "Pincode")).sendKeys ("432102"); 
		driver.findElement(By.id( "Phone Number")).sendKeys ("9876543210");
		driver.findElement(By.id( "addAddress")).click();
		//Add Address button 
		Thread.sleep (1500); 
		
		driver.findElement(By.id( "29755")).click(); 
		driver.findElement(By.xpath( "//button[text()='Proceed'1")).click();
		//pavment dage
		driver.findElement(By.xpath( "//input [@value='COD']")).click();
		driver.findElement (By.xpath( "//button[text ()='Proceed']")).click();
		//order confirm page 
		Thread.sleep (1500);
		File path=new File("./ Screenshots/orderConfirmPage2.png");
		File ss=ts.getScreenshotAs( OutputType.FILE);
		FileHandler.copy(ss, path);

	}
}
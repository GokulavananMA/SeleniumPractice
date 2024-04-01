import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
		// dropdown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(3);// first type of static dropdown
		System.out.println(dropdown.getFirstSelectedOption().getText());// for checking the option that wholud be right
																		// or not

		dropdown.selectByVisibleText("AED");// second type static dropdown
		System.out.println(dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("INR");// value->attributes third type static dropdown
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// *****************************************************************//
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// how much adult is present before

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 4;
		while (i > 0) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i--;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());// how much adult is present after

	}

}

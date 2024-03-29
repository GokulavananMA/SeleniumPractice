package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getSelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement month = driver.findElement(By.name("Month"));
		Select sel = new Select(month);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);

		List<WebElement> opts = sel.getAllSelectedOptions();
		for (WebElement opts1 : opts) {
			System.out.println(opts1.getText());
		}

		System.err.println("*************************************");
		System.out.println(sel.getFirstSelectedOption().getText());
		System.err.println("*************************************");
		List<WebElement> options = sel.getOptions();
		for (WebElement options1 : options) {
			System.out.println(options1.getText());
		}

		driver.close();
	}

}

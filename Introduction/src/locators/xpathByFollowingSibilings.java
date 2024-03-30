package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByFollowingSibilings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//h2[@class='product-title']/following-sibling::div[1]")).getText();
		System.out.println(
				driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../following-sibling::div[3]/div[1]/span"))
						.getText());

		driver.close();
	}

}

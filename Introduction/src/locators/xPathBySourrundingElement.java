package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathBySourrundingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String text = driver.findElement(By.xpath("//a[text()='Build your own computer']/../../div[3]/div[1]/span"))
				.getText();
		System.out.println(text);
		String text1 = driver.findElement(By.xpath("//a[text()='Simple Computer']/../../div[3]/div[1]/span")).getText();
		System.out.println(text1);
		driver.quit();
	}

}

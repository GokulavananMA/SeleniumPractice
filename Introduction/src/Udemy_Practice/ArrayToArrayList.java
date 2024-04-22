package Udemy_Practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayToArrayList {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] itemNeeded = { "Cucumber", "Carrot", "Brocolli" };
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < product.size(); i++) {
			
			// splitting the name of the product
			String[] name = product.get(i).getText().split("-");
			String formattedname = name[0].trim();
			// converting arry to array list
			List itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == 3) {
					break;
				}

			}
		
		}
		driver.close();

	}

}

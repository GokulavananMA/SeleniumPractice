package seleniumChallange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thisDay1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// protocal://username:password@url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.close();
	}

}

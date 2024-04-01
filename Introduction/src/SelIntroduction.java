import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// invoking browser
		// chrome - chromeDriver exten->methods close get
		// firefox - firefoxDriver ->methods close get
		// safari - safariDriver->methods close get
		// WebDriver close get
		// WebDriver method + class method
		// chromeDrive.exe -> chrome browser
		// step to invoke chrome driver
		// Selenium manager

		// chrome browser
		// chromeDrive.exe -> chrome browser
		// WebDriver driver =new ChromeDriver();
		// driver.get("https://www.youtube.com/");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// driver.close();

		// firefox browser
		// geeckodriver

		// WebDriver driver =new FirefoxDriver();

		// driver.get("https://www.youtube.com/");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		// driver.close();
		// driver.quit();

		// microsoft edge browser
		// edgedriver

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}

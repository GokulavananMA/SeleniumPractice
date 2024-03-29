import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivties {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//it is use to maximise the screen of windows
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");//another way to enter the url
		
		driver.navigate().back();//it is use to go-back to the google page
		driver.navigate().forward();//it is use to go-forword to the  rahulshettyacademy page
	}

}

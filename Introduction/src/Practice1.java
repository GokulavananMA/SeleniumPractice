import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("gokulavanan");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("gokulavanan");
		driver.findElement(By.xpath("//textarea [contains(@class,'form-control')]")).sendKeys("16 pudur , Ambattur , Chennai");
		driver.findElement(By.name("radiooptions")).click();
		driver.close();
		
		
		

	}

}

package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");

		// 5. Enter Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 6. Click Login
	 driver.findElement(By.className("decorativeSubmit")).click();

		// 7. Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		
		
		
	}

}

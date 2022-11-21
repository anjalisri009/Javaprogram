package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		driver.switchTo().defaultContent();
		
		
		WebElement element = driver.findElement(By.xpath("//iframe[@src='nested.html']"));
		

		
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("(//button[@id='Click1'])")).click();
		
	}

}

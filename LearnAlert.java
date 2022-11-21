package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Alert AL = driver.switchTo().alert();
		String text = AL.getText();
		System.out.println(text);
		
		AL.accept();
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert sa = driver.switchTo().alert();
		String text2 = sa.getText();
		System.out.println(text2);
		sa.dismiss();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert pm= driver.switchTo().alert();
		pm.sendKeys("anjali");
	String text3 = pm.getText();
	System.out.println(text3);
		pm.accept();
		
		
		
		
		
		
		

	}

}


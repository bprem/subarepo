package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Prem Kumar\\\\Downloads\\\\geckodriver-v0.21.0-win64\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Prem%20Kumar/Desktop/frame.html");
		driver.switchTo().frame("demo");
		driver.findElement(By.name("uid")).sendKeys("mngr165341");
		driver.findElement(By.name("password")).sendKeys("mUmAvUn");
		//account.findElement(By.xpath("")).click();
		WebElement lb=	driver.findElement(By.name("btnLogin"));
		lb.click();
		driver.switchTo().defaultContent();
	
	
	
	
	
	
	driver.switchTo().frame("tour");
	driver.findElement(By.name("userName")).sendKeys("123");
	driver.findElement(By.name("password")).sendKeys("123");
	driver.findElement(By.name("login")).submit();
	driver.switchTo().defaultContent();
WebElement f3=	driver.findElement(By.xpath("//iframe[@title='auto']"));
driver.switchTo().frame(f3);
driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("abc");
driver.switchTo().defaultContent();
driver.findElement(By.linkText("click for facebook")).click();
driver.navigate().back();
	

	}

}

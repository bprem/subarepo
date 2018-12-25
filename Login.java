package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver open = new FirefoxDriver();
		open.get("http://newtours.demoaut.com/");
		open.findElement(By.name("userName")).sendKeys("123");
		open.findElement(By.name("password")).sendKeys("123");
		open.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		open.findElement(By.linkText("SIGN-OFF")).click();
		
	
	}

}

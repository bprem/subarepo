package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver account = new FirefoxDriver();
		account.get("http://demo.guru99.com/v4/");
		account.findElement(By.name("uid")).sendKeys("mngr165341");
		account.findElement(By.name("password")).sendKeys("mUmAvUn");
		//account.findElement(By.xpath("")).click();
	WebElement lb=	account.findElement(By.name("btnLogin"));
	lb.click();
	
		}

}

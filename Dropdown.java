package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver tour = new FirefoxDriver();
		tour.get("http://newtours.demoaut.com/");
		tour.findElement(By.name("userName")).sendKeys("123");
		tour.findElement(By.name("password")).sendKeys("123");
		tour.findElement(By.name("login") ).click();
		Thread.sleep(2000);
		WebElement pc=	tour.findElement(By.name("passCount"));
		Select pcs = new Select(pc);
		pcs.selectByIndex(3);

		
		
		
		
	}

}

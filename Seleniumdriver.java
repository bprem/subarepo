package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver tour = new FirefoxDriver();
		tour.get("http://newtours.demoaut.com/");
		tour.findElement(By.linkText("REGISTER")).click();
		tour.findElement(By.name("firstName")).sendKeys("Subha");
		tour.findElement(By.name("lastName")).sendKeys("Guru");
		tour.findElement(By.name("phone")).sendKeys("7894561231");
		tour.findElement(By.id("userName")).sendKeys("subha@gmail.com");
		tour.findElement(By.name("address1")).sendKeys("dsfkjsdhgkss");
		tour.findElement(By.name("city")).sendKeys("chennai");
		tour.findElement(By.name("state")).sendKeys("Tamil Nadu");
		tour.findElement(By.name("postalCode")).sendKeys("600091");
		tour.findElement(By.id("email")).sendKeys("subha@gmail.com");
		tour.findElement(By.name("password")).sendKeys("1234");
		tour.findElement(By.name("confirmPassword")).sendKeys("1234");
		

	}

}

package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver xfind = new FirefoxDriver();
		xfind.get("http://newtours.demoaut.com/");
		xfind.findElement(By.linkText("REGISTER")).click();
		xfind.findElement(By.xpath("//input[@size='20']")).sendKeys("kayal");
		xfind.findElement(By.xpath("//input[@name='lastName']")).sendKeys("guru");
		xfind.findElement(By.cssSelector("input[name='phone']")).sendKeys("789944561");
	} 
	

}

package Webdriverconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver pop = new FirefoxDriver();
		pop.get("http://demo.guru99.com/v4/");
	//	pop.findElement(By.name("btnLogin")).click();
		try
		{
	String msg=	pop.switchTo().alert().getText();
	System.out.println(msg);
	pop.switchTo().alert().accept();
	}
		catch(NoAlertPresentException e)
		{
			System.out.println("No alert");
		}
	}
}

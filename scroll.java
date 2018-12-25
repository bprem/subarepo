package Webdriverconcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	WebElement r=	driver.findElement(By.name("radiooptions"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",r);
	
	String pn=driver.getWindowHandle();
	Set<String> aw=driver.getWindowHandles();
	
	for(String w:aw)
	{
		if(!w.equals(pn))
		{
			driver.switchTo().window(w);
			driver.close();
		}
	}
	driver.switchTo().window(pn);
	}

}

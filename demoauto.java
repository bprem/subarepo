package Webdriverconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoauto {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prem Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,90);
		driver.get("http://demo.automationtesting.in/Register.html");
	/*	WebElement Sk = driver.findElement(By.id("Skills"));
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		Select dd = new Select(Sk);
		//dd.selectByIndex(2);
		dd.selectByValue("Analytics");
		//dd.selectByVisibleText("AutoCAD");
		WebElement place =driver.findElement(By.id("countries"));
		wait.until(ExpectedConditions.visibilityOf(place));
		
		Select coun = new Select(place);
		coun.selectByIndex(1);
		WebElement year = driver.findElement(By.id("yearbox"));
		Select st = new Select(year);
		st.selectByValue("1916");
		//WebElement  = driver.findElement(By.id("yearbox"));
		//Select st = new Select(year);
	List<WebElement> radios=	driver.findElements(By.xpath("//input[@type='radio']"));
				for(WebElement r:radios)
				{
					String v=r.getAttribute("value");
					if(v.equalsIgnoreCase("female"))
					{
						r.click();
						break;
					}
				}
		
		List<WebElement> checks= driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		for(WebElement C :checks)
		{
			String B = C.getAttribute("value");
			if(B.equalsIgnoreCase("Cricket")||B.equalsIgnoreCase("hockey"))
			{
				C.click();
				
				
			}
			
		}*/
		
	//	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	//	WebElement ra=driver.findElement(By.xpath("//input[@value='Male']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ra);
		driver.findElement(By.id("imagesrc")).click();
		
		StringSelection fn = new StringSelection("C:\\Users\\Prem Kumar\\Desktop\\selqn.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fn, null);
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_CONTROL);
		
		fu.keyPress(KeyEvent.VK_ENTER);
		
	}

}

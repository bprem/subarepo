package Webdriverconcepts;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem Kumar\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver tour = new FirefoxDriver();
		tour.get("https://www.naukri.com/");
		String cw = tour.getWindowHandle();
		Set<String> aw= tour.getWindowHandles();
		for(String w:aw)
		{
			if(!w.equals(cw))
			{
				tour.switchTo().window(w);
				tour.close();
			}
		}
			}
		

	}


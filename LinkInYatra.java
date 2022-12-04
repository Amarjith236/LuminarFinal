package JunitPkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkInYatra {

WebDriver driver;
	
	@Before
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void countTest()
	{
		driver.get("https://www.yatra.com");
		driver.manage().window().maximize();
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("No of links="+l.size());
	}
	@After
	public void browserClose()
	{
		driver.quit();
	}
	

}


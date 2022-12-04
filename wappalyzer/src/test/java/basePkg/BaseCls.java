package basePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCls {
	
	public WebDriver driver;
	@BeforeClass
	public void urlLoad()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com/");
		driver.manage().window().maximize();
	}

}

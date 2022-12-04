package pagPkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PageCls {
	WebDriver driver;
	By resource=By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span");
	By technologies=By.cssSelector("#list-item-50 > div > div.v-list-item__title.subtitle-2");
	By searchbox=By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div[1]");
	By searchbox2=By.xpath("/html/body/div/div/div/div[2]/div/form/div/div/div/div[1]/input");
	By ecom=By.cssSelector("#list-item-584-0 > div > div:nth-child(1)");
	By lead=By.cssSelector("#app > div > main > div > div:nth-child(2) > div:nth-child(1) > div.container.py-10.py-sm-12 > div > div:nth-child(2) > div.v-alert.mt-6.v-sheet.theme--dark.primary.lighten-1 > div > div > a > span");
	
	public PageCls(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clk()
	{
		driver.findElement(resource).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(technologies).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(searchbox).click();
	}
	public void searccTech(String srchitem) 
	{
		Actions hov=new Actions(driver);
		hov.moveToElement(driver.findElement(searchbox2)).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(searchbox2).sendKeys(srchitem);
	}
	public void clk2()
	{
		driver.findElement(ecom).click();
	}
	public void leadClick()
	{
		driver.findElement(lead).click();
	}

}

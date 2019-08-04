package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	private static WebDriver driver;


	@Test(dataProvider="Authentication")
	public void dataProviderTestCase(String sUsername, String sPassword) throws Exception {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath("/html/body/p/a")).click();
		driver.findElement(By.xpath("//*[@id='noo-site']/header/div[1]/div/ul[2]/li[2]/a")).click();
		Thread.sleep(2000);
		System.out.println(sUsername);
		driver.findElement(By.id("username")).sendKeys(sUsername);
		driver.findElement(By.id("password")).sendKeys(sPassword);
		Thread.sleep(2000);
		driver.quit();
	}
	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { 
			{ "talentTEK", "Test@123" }, 
			{ "talentTEK2", "Test@123" }

		};
	}
}

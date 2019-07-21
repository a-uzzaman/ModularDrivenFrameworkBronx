package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SetUpBreakDown {
	public WebDriver driver;

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("*** TEST SUITE STARTED ");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		//		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashif\\eclipse-workspace\\SelniumBasicClassBronx19\\Drivers\\chromrdriver.exe");


		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		driver.quit();
		// close db
		// suite end time

	}




}

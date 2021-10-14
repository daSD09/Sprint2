package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooksclass {

	WebDriver driver;
	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHRAMANA DAS\\CAPGEMINI_JSWorkspace\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://realty-real-estatem1.upskills.in/");
	}

@After
public void closedriver()
{
System.out.println("Browser is closing now");
driver.quit();
}
}
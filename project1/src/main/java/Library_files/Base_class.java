package Library_files;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_class {

 public static WebDriver driver;
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	@Test
	public void InitializeBrowser() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

		    driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();


	}



}

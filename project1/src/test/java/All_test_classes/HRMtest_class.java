package All_test_classes;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import All_pom_classes.HRMpom1;
import All_pom_classes.hrmPIMpom1;
import Library_files.Base_class;
import Library_files.Utility_class;

public class HRMtest_class extends  Base_class {
	 HRMpom1 login1;
	 hrmPIMpom1 login2;
	@BeforeClass
	public void openbrowser(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(2000);
		InitializeBrowser();


		  login1   =new HRMpom1( driver );
		  login2  =new hrmPIMpom1 (driver);

	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{    Thread.sleep(2000);
		login1.Username(Utility_class.getDataFromPF("UN"));
		Thread.sleep(2000);
		login1.Password(Utility_class.getDataFromPF("PSW"));
		Thread.sleep(2000);
		login1.clickBTN();
	}
	@Test
	public void verifyTC()
	{
System.out.println("hello test1");
Assert.assertTrue(true);

	}
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}
	@AfterClass
	public void closebrowser()
	{

	}




}

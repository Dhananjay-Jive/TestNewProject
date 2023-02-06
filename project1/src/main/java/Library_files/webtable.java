package Library_files;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
  public static void main(String[] args) throws InterruptedException {
	
	   	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

	   	   WebDriver driver=new ChromeDriver();
	   	      Thread.sleep(2000);
	   	      try
	   	      {
	   	    	  
	   	      
	   	      driver.get("");
	   	      
	   	      }
	   	      catch(Exception e)
	   	      {
	   	    	  
	   	      }
	   	   
	   	   
}
}

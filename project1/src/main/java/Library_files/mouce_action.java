package Library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class mouce_action {
        
public static void main(String[] args) throws InterruptedException {
  	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

 	   WebDriver driver=new ChromeDriver();
 	      Thread.sleep(2000);
 	      driver.get("https://www.facebook.com");
 	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 	   Thread.sleep(2000);
 	   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
 	  Thread.sleep(2000);
 	  WebElement s1=driver.findElement(By.xpath("//select[@id='month']"));
 	  //left click
 	 Actions Act=new Actions(driver);
 	        Act.click(s1);
 	 for(int i=0;i<=9;i++) {
 	 Act.sendKeys(Keys.ARROW_UP).perform();
 	 }
 	 Act.sendKeys(Keys.ENTER).perform();
 	 
 	
 	  
}
}

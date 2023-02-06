package Library_files;

import javax.swing.ActionMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class Alert_popup {
    public static void main(String[] args) throws InterruptedException {

   	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

   	   WebDriver driver=new ChromeDriver();
   	      Thread.sleep(2000);
   	      driver.get("https://www.facebook.com");
   	   Thread.sleep(2000);
   	       driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
   	    Thread.sleep(2000);
   	      WebElement s1=driver.findElement(By.xpath("//select[@id='month']"));
   	       Actions Act=new Actions(driver);
   	    Thread.sleep(2000);
   	       Act.click(s1).perform();
   	    Thread.sleep(2000);
   	    Act.sendKeys(Keys.ARROW_DOWN).perform();
   	    Act.sendKeys(Keys.ARROW_UP).perform();
   	 Act.sendKeys(Keys.ARROW_UP).perform();
   	Act.sendKeys(Keys.ARROW_UP).perform();
   	Act.sendKeys(Keys.ARROW_UP).perform();
   	
   	Act.sendKeys(Keys.ARROW_UP).perform();
   	Act.sendKeys(Keys.END).perform();
   	for(int i=1;i<=9;i++)
   	{
   	 	Act.sendKeys(Keys.ARROW_UP).perform();
   	}
   	 Act.sendKeys(Keys.ENTER).perform();   
   	    
   	    
   	       
	}
}

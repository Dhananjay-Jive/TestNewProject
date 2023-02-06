package Library_files;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windopopup {
    public static void main(String[] args) throws InterruptedException, IOException {
      	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

   	   WebDriver driver=new ChromeDriver();
   	      Thread.sleep(2000);
   	      driver.get("https://skpatro.github.io/demo/links");
   	   Thread.sleep(2000);
   	   driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
   	  Set <String> s1  = driver.getWindowHandles();
   	  ArrayList<String>ar=new ArrayList<String>(s1);
   	       String mainpageID=ar.get(0);
   	       String windowpageID=ar.get(1);
   	       driver.switchTo().window(windowpageID);
   	    driver.findElement(By.xpath("(//span[@class='menu-text'])[1]")).click();
   	    
   	       
   	  
}
    }

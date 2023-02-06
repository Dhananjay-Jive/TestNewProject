package Library_files;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_browser {
     public static void main(String[] args) throws InterruptedException {


    	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

    	   WebDriver driver=new ChromeDriver();
    	      Thread.sleep(2000);
    	      driver.get("https://skpatro.github.io/demo/links");
    	      
    	      Thread.sleep(2000);	
    	      driver.manage().window().maximize();
              driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
              //change the focus from main page to frame
           Set <String> s1  = driver.getWindowHandles();
              Thread.sleep(2000);
              ArrayList<String> Id=new ArrayList<String>(s1);
              String mainpageId=Id.get(0);
              String windowpopupId=Id.get(1);
              //to switch to windopopup
              driver.switchTo().window(windowpopupId);
              Thread.sleep(2000);
            driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            
            driver.switchTo().window(mainpageId);
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
            
            
     
     
     
     }
}

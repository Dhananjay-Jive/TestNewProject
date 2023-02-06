package Library_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dyanamic {
public static void main(String[] args) throws InterruptedException {

	 System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");

	   WebDriver driver=new ChromeDriver();
	      Thread.sleep(2000);
	      driver.get("https://www.makemytrip.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ben");
	      Thread.sleep(2000);
	      try {
	       List <WebElement> text=driver.findElements(By.xpath("//li[@role='option']//div[@class='calc60']/p[@class='font14 appendBottom5 blackText']"));

	       for(WebElement s1:text)
	       {
	    	 if( s1.getText().contains("Bengaluru") )
	    	 {
	    		 s1.click();
	    	 }
	       }
	      }catch(Exception e) {
	    	 e.printStackTrace();
	      }
	      driver.findElement(By.xpath("(//span[@class='lbl_input latoBold  appendBottom5'])[2]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("mumb");
	      Thread.sleep(1000);
	      try {
	     List <WebElement>t =driver.findElements(By.xpath("//li[@role='option']//div[@class='makeFlex hrtlCenter']//div[@class='calc60']/p[@class='font14 appendBottom5 blackText']"));
	     Thread.sleep(1000);
	     for(WebElement s1:t)
          {
        	  if(s1.getText().contains("Mumbai"))
        	  {
        		   s1.click();
        	  }
          }
	      }
	      catch(Exception e)
	      {
	    	    
	      }
	       driver.findElement(By.xpath("//label[@for='departure']")).click();
	            
	      
	    	  
	      
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("((//div[@class='DayPicker']//div//div//div[@class='DayPicker-Body'])[2]//div[@role='row'])[5]//div[3]")).click();
	    
	     
	      
	      
}

}

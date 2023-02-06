package All_pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMpom1 {


  @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[1]")     private  WebElement UN;
  @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")    private   WebElement PSW;
  @FindBy(xpath="//button[@type='submit']  ")                             private  WebElement BTN;




  public HRMpom1 ( WebDriver driver)
  {
	 PageFactory.initElements(driver, this);
  }

  public void Username(String user)
  {
	  UN.sendKeys("user");
  }

  public void Password(String Pass)
  {
	  PSW.sendKeys("pass");
  }
  public void clickBTN()
  {
	  BTN.click();
  }





}



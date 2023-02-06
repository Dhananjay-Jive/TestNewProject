package All_pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hrmPIMpom1 {

	@FindBy(xpath="")   private  WebElement USERNAME;

	public hrmPIMpom1( WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}

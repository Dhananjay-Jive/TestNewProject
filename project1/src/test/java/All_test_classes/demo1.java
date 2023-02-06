package All_test_classes;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
    @Test(groups="login")
    public void TC1()
    {    
    	//Assert.fail();
    	Reporter.log("running test case1",true);
    }
    @Test(groups="login")
    public void TC2()
    {
    	//Assert.fail();
    	Reporter.log("running test case2",true);
    	
    }
    @Test
    public void TC3()
    {
    	Reporter.log("running test case3",true);
    }
	
}

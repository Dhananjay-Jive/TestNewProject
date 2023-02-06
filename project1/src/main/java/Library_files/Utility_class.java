package Library_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Utility_class {


	@Test
	public static String getDataFromPF(String UN) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\RSC\\eclipse-workspace\\project1\\Property_File\\PF.properties");

		    Properties prop=new Properties();
		       prop.load(file);
		        String value= prop.getProperty(UN);
		        return value;



	}
	@Test
	public void getDataFromExcelSheet() throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream("");



	}



}

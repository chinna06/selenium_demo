package chinna_demo.chinna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AppTest{
	@Test
	public static void main()
    {
		//tess
        WebDriver n=new FirefoxDriver();
         n.get("https://www.guru99.com/");
         System.out.println();    }
   }

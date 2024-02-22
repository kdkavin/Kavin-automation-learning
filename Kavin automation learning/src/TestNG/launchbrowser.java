package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class launchbrowser {
	@BeforeSuite	
	public void browser() {
		
		
	}
	WebDriver driver;
	long starttime;
	long endtime;
	public void openbrowser() {
		
		starttime=System.currentTimeMillis();
		driver=new ChromeDriver();	
	}

    @Test
	public void opengoogle() {
		
		driver.get("http://www.google.co.in");
	  	driver.quit();
	}
    
	public void openbing() { 
		
		driver.get("http://www.bing.com");	
		driver.quit();
	}
		@AfterSuite
		public void closebrowser() {
			endtime=System.currentTimeMillis();
		}
		
}

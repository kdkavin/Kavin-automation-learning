package kavinselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtt {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:SubmittalExchange_TFSQAAutomation3rdpartychromechromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");

		
	//	if(driver.getTitle().equals("Google"))

		{

	//	test.log(LogStatus.PASS, "Navigated to the specified URL");

		}
//
	//	else

		{

//		test.log(LogStatus.FAIL, "Test Failed");

		}

		}

	//	@AfterClass

	//	public static void endTest()

		{

	//	report.endTest(test);

	//	report.flush();

	//	}

	//	}
	}

}//

package kavinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdownpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","\\chromedriver_win32 (1)\\\\chromedriver.exeD:\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01x4932e7djscg3x4lm6fcs9uj537768.node0");

		driver.manage().window().maximize();
		
		WebElement dropdown1=driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		
		Select drop=new Select(dropdown1);

		drop.selectByIndex(3);
		List<WebElement>listofoptions=drop.getOptions();
		int size=listofoptions.size();
		System.out.println("list of ioptions :"+ size);
		
		
		
		
	
		
		
	}

}

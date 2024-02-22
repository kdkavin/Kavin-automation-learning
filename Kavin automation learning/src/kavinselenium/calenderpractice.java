package kavinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		driver.manage().window().maximize();
		
		WebElement calendar=driver.findElement(By.xpath("//button[text()='Next']"));
		Thread.sleep(3000);
		calendar.click();
		
		WebElement calendar1=driver.findElement(By.xpath("//button[text()='Previous']"));
		calendar1.click();
		
		
		
		
		
		
		
	}

}

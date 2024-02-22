package kavinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
		WebElement To=driver.findElement(By.id("form:drop_header"));
		
		Actions drop=new Actions(driver);
		drop.clickAndHold(from).moveToElement(To).release().build().perform();
		
		
		
		
		
		
	}

}

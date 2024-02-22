package kavinselenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		WebElement frame=driver.findElement(By.id("Click"));
		frame.click();
		
	String textname=	driver.findElement(By.id("Click")).getText();
	System.out.println(textname);
	
	driver.switchTo().defaultContent();
	
	List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
	int noofframes=totalframes.size();
	System.out.println(noofframes);
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(1);
    driver.switchTo().frame("frame2");
	WebElement text2=driver.findElement(By.id("frame2"));
	text2.click();
	
	
		
		
		
		
	}

}

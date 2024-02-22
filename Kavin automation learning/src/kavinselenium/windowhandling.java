package kavinselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowhandling {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/window.xhtml");
	driver.manage().window().maximize();

	
String oldwindow=	driver.getWindowHandle();
WebElement windows=driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
windows.click();
Set<String> allwindows=driver.getWindowHandles();

for (String newwindow :allwindows ) {
	
	driver.switchTo().window(newwindow);
		
}

     WebElement newwindows=driver.findElement(By.id("email"));
     newwindows.click();
	driver.close();
	driver.switchTo().window(oldwindow);
	
	WebElement noofwindows=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
	noofwindows.click();
	int windownumbers=driver.getWindowHandles().size();
	System.out.println("no of windows is : "+ windownumbers);
	
	WebElement close=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
	close.click();
	
	Set<String>multiplewindows=driver.getWindowHandles();
	for (String alllwindows : multiplewindows) {
		if (!alllwindows.equals(oldwindow)) {
			
			driver.switchTo().window(alllwindows);
			driver.close();
			
			
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	}
}

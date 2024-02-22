package kavinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class checkboxespractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01wjzftl4ggvtc1qhpc01s7m4fm543056.node0");
		
		driver.manage().window().maximize();
		
	    WebElement checkbox=driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
	    checkbox.click();
		
	    WebElement notify=driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
	    notify.click();
	    
	    
	    WebElement drop=driver.findElement(By.xpath("//*[@id=\'j_idt87:multiple\']/ul"));
	    drop.click();
	    Actions drop1=new Actions(driver);
	    drop1.moveToElement(driver.findElement
	    		(By.xpath("//*[@id=\'j_idt87:multiple_panel\']/div[2]/ul/li[1]/div/div[2]"))).build().perform();
	    
	   
	    
	 
	    
		
		
		
		
		
		
		
	}

}

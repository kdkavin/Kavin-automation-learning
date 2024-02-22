package kavinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","\chromedriver_win32 (1)\\chromedriver.exeD:");
		
		WebDriver driver=new ChromeDriver();
		driver.get
		("https://www.leafground.com/alert.xhtml;jsessionid=node0x6wplvn0dyi911grpdhxw6rti527357.node0");
		driver.manage().window().maximize();
		WebElement show=driver.findElement
				(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[1]"));
		show.click();
		Alert selenium=driver.switchTo().alert();
		Thread.sleep(4000);
		selenium.accept();
		WebElement test=driver.findElement	
				(By.xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		test.click();
		Alert testing=driver.switchTo().alert();
		Thread.sleep(3000);
		testing.dismiss();
		WebElement sweetalert=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']/span[2]"));
		sweetalert.click();
		WebElement dismissalert=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
		dismissalert.click();
		WebElement bitteralert=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span[2]"));
		bitteralert.click();
		//WebElement alertalert=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt101\']/div[1]/a/span"));
		Thread.sleep(3000);
		WebElement alertalert=driver.findElement(By.name("ui-icon ui-icon-closethick"));
		
		alertalert.click();
		
		
		
		
		
		
		
		
		WebElement java=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt104\']/span[2]"));
		java.click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("viratkohli");
		Thread.sleep(3000);
		prompt.accept();
		
		
		
		
	}

}

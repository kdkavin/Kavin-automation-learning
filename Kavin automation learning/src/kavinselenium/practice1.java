package kavinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://evo2app.otr-ict.chn:6116/LoginAccess");
		
		WebElement contract=
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/fieldset/div/div[1]/span"));
	         	contract.click();
	driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("username"));
	username.click();
	username.sendKeys("kavin.v");
	WebElement password=driver.findElement(By.id("password"));
	password.click();
	password.sendKeys("K@vin291397");
	WebElement login=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/form/fieldset/div/div[3]/button/i"));
	login.click();
	Thread.sleep(5000);
	WebElement mouse=driver.findElement(By.xpath("//a[text()='Create Contract']//ancestor::ul[@class='sub-menu']//parent::li//img"));
	mouse.click();
	Thread.sleep(3000);
	WebElement createContract=driver.findElement(By.xpath("//a[text()='Create Contract']"));
	createContract.click();
	
	Thread.sleep(3000);
	
	WebElement dropdown=driver.findElement(By.xpath("//button[text()='...']"));
	dropdown.click();
	WebElement search=driver.findElement(By.id("customerNameSearchId"));
	search.click();
	search.sendKeys("sant*");
	Actions a=new Actions(driver);
	a.keyDown(Keys.ENTER).build().perform();
	a.moveToElement(driver.findElement(By.xpath(""))).build().perform();
	a.click();
	
	
	
	}	

}

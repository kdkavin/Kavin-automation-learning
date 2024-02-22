package kavinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttonspractice {
	
	public static void main(String[]args) throws InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver","\"D:\\\\chromedriver_win32 (1)\\\\chromedriver.exe" );	
		
		
		WebDriver driver=new ChromeDriver();
		driver.get
		("https://www.leafground.com/button.xhtml;jsessionid=node0wl9pftfs3bz51b2nsoroj4ozy528292.node0");
		
		driver.manage().window().maximize();
		WebElement disabled=driver.findElement
				(By.xpath("//*[@id=\'j_idt88\']/div/div[1]/div[2]"));
		disabled.click();
		WebElement position=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt94\']/span[2]"));
		Point abposition=position.getLocation();
		int avalue=abposition.getX();
		int bvalue=abposition.getY();
		System.out.println("a value is :"+avalue + "b value is :"+ bvalue);
		
		WebElement buttoncolor=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/span[2]"));
		String color=buttoncolor.getCssValue("background");
		System.out.println("button color is :"+color);
		
		WebElement buttonsize=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height=buttonsize.getSize().getHeight();
		int width=buttonsize.getSize().getWidth();
		System.out.println("height value is :="+ height + "width value is :=" + width);
		
		WebElement mouseover=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"));
		String actions=mouseover.getCssValue("background-color");
		Actions test=new Actions(driver);
		Thread.sleep(2000);
		test.moveToElement(driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt100\']/span"))).build().perform();
	
		
		//Thread.sleep(5000);
		//a.clickAndHold(driver.findElement(By.xpath("//button[@name='j_idt88:j_idt100']"))).build().perform();
	int count=driver.findElements(By.xpath("(//div[@class='card'])[7]//button")).size();
		System.out.println(count);
		
		
		int j=driver.findElements(By.xpath("//div[@class='card']/h5")).size();
		System.out.println(j);
		for(int i=1;i<=j;i++)
		{
			System.out.println(driver.findElement(By.xpath("(//div[@class='card']/h5)["+i+"]")).getText());
			int n=driver.findElements(By.xpath("(//div[@class='card'])["+i+"]//button")).size();
			System.out.println("The Total count of Buttons are "+driver.findElements(By.xpath("(//div[@class='card'])["+i+"]//button")).size());
			for(int k=1;k<=n;k++)
			{
			System.out.println(driver.findElement(By.xpath("(//div[@class='card'])["+k+"]//button")).getText());
			}
			
			
		}
		/*WebElement text=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']"));
		String buttonname=text.getText();
		System.out.println("button name is :"+ buttonname);
		
		WebElement buttons=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]"));
		String name=buttons.getText();
		System.out.println("buttonname is :" + name);*/
		WebElement clickimage=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt102:imageBtn\']/span"));
		clickimage.click();
		WebElement hidden=driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div/div[2]/div[3]/div"));
		Actions hiddenclick=new Actions(driver);
		hiddenclick.moveToElement(driver.findElement(By.xpath("//*[@id=\'j_idt88\']/div/div[2]/div[3]/div"))).build().perform();
		
		
		
		
		
	}
	
  


}

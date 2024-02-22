package kavinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		WebElement radio=driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span"));
		radio.click();
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[1]/div/div[2]/span"));
	WebElement radio2=driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[2]/div/div[2]/span"));
	 WebElement radio3=driver.findElement(By.xpath("//*[@id=\'j_idt87:city2\']/div/div[3]/div/div[2]/span"));
	 
	 boolean checked1=radio1.isSelected();
	 boolean checked2=radio2.isSelected();
	 boolean checked3=radio3.isSelected();
	 
	 System.out.println("r");
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

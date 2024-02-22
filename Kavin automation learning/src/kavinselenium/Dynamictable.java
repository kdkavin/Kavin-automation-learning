package kavinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		
		List<WebElement>column=driver.findElements(By.tagName("th"));
		int columncount=column.size();
	    System.out.println("no of column is "+ columncount);
	    
	    List<WebElement>rows=driver.findElements(By.tagName("tr"));
		int rowscount=rows.size();
	    System.out.println("no of row is "+ rowscount);
	    
	  
		
		
		
		
	}

}

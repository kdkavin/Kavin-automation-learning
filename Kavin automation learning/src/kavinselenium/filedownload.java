package kavinselenium;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filedownload {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0cz9axv2gntkb1unxs7cqhekcu569930.node0");
		driver.manage().window().maximize();
		
		WebElement download=driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		download.click();
		
       File newfile=new File("C:\\Users\\kavin.v\\Downloads");
       
       File[] allfiles=newfile.listFiles();
	
		
		for (File file : allfiles) {
			if(file.getName().equals("TestLeaf Logo")) {
				System.out.println("file");
				
			}
			
			
		}
			}			
		
		
		
		
		
		
		
		
	}



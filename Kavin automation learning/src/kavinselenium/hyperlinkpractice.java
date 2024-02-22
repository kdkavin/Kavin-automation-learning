package kavinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperlinkpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		
		WebElement linktext=driver.findElement(By.linkText("Go to Dashboard"));
		linktext.click();
		
		driver.navigate().back();
		
		WebElement find=driver.findElement(By.partialLinkText("Find the URL "));
		String wheretofind=find.getAttribute("href");
		System.out.println("destination is "+ wheretofind);
		
		WebElement broken=driver.findElement(By.linkText("Broken?"));
		broken.click();
	String title=	driver.getTitle();
		if (title.contains("404")) {
			
		System.out.println("link is broken");
		}
		driver.navigate().back();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
	int nooflinks=	links.size();
		System.out.println("no of links is "+ nooflinks);
		
	}

}

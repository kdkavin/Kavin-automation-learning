package kavinselenium;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main (String[]args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get
		("https://www.leafground.com/file.xhtml;jsessionid=node0cz9axv2gntkb1unxs7cqhekcu569930.node0");
		
		WebElement upload=driver.findElement(By.id("j_idt88:j_idt89_input"));
		upload.click();
		
		
		
	}
		
		
		
		
		
	}



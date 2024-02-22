package kavinselenium;

import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.sessionqueue.ClearSessionQueue;
import org.openqa.selenium.support.ui.Select;

public class seleniumclass1 {
      public static void main(String[]args) throws InterruptedException {
    	  
    	 // System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
    	  
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.leafground.com/input.xhtml");
    	 driver.manage().window().maximize();
    	driver.findElement(By.id("j_idt88:name")).sendKeys("virat kohli");
    	driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("  India" );
    	driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("  killer");
    	 driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
         driver.findElement(By.id("j_idt88:j_idt95")).clear();
         driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
         driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("virat@gmail.com");
         driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("tell me about yourself");
         System.out.println(driver.getTitle());
         //driver.manage().window().maximize();
         driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("10/30/2023");
         driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys(Keys.TAB);
       
         driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("15");
         driver.findElement(By.id("j_idt106:slider")).sendKeys("50");
         Thread.sleep(2000);
         driver.findElement(By.id("j_idt106:j_idt122")).click();//sendKeys(Keys.SHIFT);
         
         driver.findElement(By.id("j_idt106:j_idt122")).sendKeys("hi");
         driver.findElement(By.xpath
        		 ("//button[@title='Close the keypad']")).click();
         driver.findElement(By.xpath
        		 ("/html/body/div[4]/div[1]/button[13]")).sendKeys(Keys.TAB);
        		 
       //  driver.get("https://www.leafground.com/alert.xhtml");
             
      
	}}

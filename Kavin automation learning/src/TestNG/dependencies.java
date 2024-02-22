package TestNG;

import org.testng.annotations.Test;

public class dependencies {

	
	@Test (enabled=false)
	public void highschool(){
		System.out.println("high school");
			
	}
	@Test (dependsOnMethods="highschool")
	public void highersecondaryschool(){
		System.out.println("highher secondary school");
			
	}
	@Test (dependsOnMethods="highersecondaryschool")
	public void college(){
		System.out.println("collge");
			
	}
	
	
	
	
	
	
	
	
	
	
}

package TestNG;

import org.testng.annotations.Test;

public class testNGpractice {

	
	@Test 
	public void firstpractice () {
		System.out.println("virat kohli");
		
	}
	@Test (priority=3)
	public void secondpractice () {
		System.out.println("MS Dhoni");
	
	}
	@Test (priority=2,enabled=false)
	public void thirdpractice () {
		System.out.println("steve smith");
	
	}
	
	
}

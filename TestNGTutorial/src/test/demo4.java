package test;

import org.testng.annotations.Test;

public class demo4 {
	
	@Test
	public void Homeloan()
	{
		//selenium
		System.out.println("webloginHome");
	}
	
	@Test(groups=("Smoke"))
	public void mobileappHomeloan()
	{
		//appium
		System.out.println("mobileloginHome");
	}

	@Test
	public void HomeAPIlogin()
	{
		//rest API automation
		System.out.println("APIloginHome");
	}
}

package test;

import org.testng.annotations.Test;

public class demo3 {
	
	@Test
	public void carloan()
	{
		//selenium
		System.out.println("weblogincar");
	}
	
	@Test
	public void mobileappcarloan()
	{
		//appium
		System.out.println("mobilelogincar");
	}

	@Test
	public void mobiledeviseloan()
	{
		//appium
		System.out.println("mobiledevise");
	}
	@Test(groups=("Smoke"))
	public void mobileapploan()
	{
		//appium
		System.out.println("mobileapp");
	}
	@Test
	public void loginAPI()
	{
		//rest API automation
		System.out.println("APIlogincar");
	}
}

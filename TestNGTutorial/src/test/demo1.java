package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {

	
		// TODO Auto-generated method stub
    @Test
	public void Demo()
	{
		System.out.println("Hello World");
	}
    
    @Test(groups=("Smoke"))
    public void testcase()
    {
    	System.out.println("See you later");
    }
    
    @BeforeTest
    public void prerequisites()
    {
    	System.out.println("I will exicute deletion tests first");
    }

    @AfterTest
    public void requisites()
    {
    	System.out.println("I have exicuted deletion tests first");
    }
}

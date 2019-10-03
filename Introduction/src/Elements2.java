import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.cssSelector("#username")).sendKeys("emailidentered");
	    driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345678");
	   // driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
	    driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
	    System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
	    

	    
	  
	}

}

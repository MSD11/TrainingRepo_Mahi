import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    //driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mahathi");
	    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("sreshta");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("myri");
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	   // System.out.println(driver.findElement(By.xpath("//*[@id=\'u_0_9\']/div/div[2]/p/strong")).getText());
	    driver.navigate().back();
	    driver.quit();
	    
	}

}

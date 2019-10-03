import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com//");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	    driver.findElement(By.xpath("//input[@id=\'login1\']")).sendKeys("mahathi");
	    driver.findElement(By.cssSelector("input#password")).sendKeys("name");
	    driver.findElement(By.xpath("//input[@value=\'Go']")).click();
	    //System.out.println(driver.findElement(By.xpath("//div[@style*='float']")).getText());
	    
	}

}

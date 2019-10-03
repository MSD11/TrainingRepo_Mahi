import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("mahathi");
	    driver.findElement(By.cssSelector("input[id='password']")).sendKeys("raj");
	    driver.findElement(By.cssSelector("input[id='Login']")).click();
	    System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
	    driver.navigate().back();
	    driver.quit();
	}

}

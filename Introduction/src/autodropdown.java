import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mum");
	    driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
	    driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div/input[@type='text']")).sendKeys("Hyd");
	    driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/div[@class(text()='HYD')]")).click();
	}

}

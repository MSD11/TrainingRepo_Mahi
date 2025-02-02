import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coloumdriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumdriver.findElements(By.tagName("a")).size());
		
		for (int i=1;i<coloumdriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);		
			
		}	
			Set<String>ids=driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}		
		
	}

}

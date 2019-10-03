import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com//");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("mahathisesham");
	    driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[3]/center/input[1]")).click();
	    //driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	    driver.findElement(By.xpath("//div[@id='search']/div/div/div/div/div[1]")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.quit();  
	}

}

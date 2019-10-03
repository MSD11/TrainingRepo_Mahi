import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
	    driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
	    driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
	    System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	    driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
	    
	    

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='right-align']/fieldset[1]/label[2]")).getText());
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='right-align']/fieldset[1]/label[2]"));
				
	}

}



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://google.com");
     System.out.println(driver.getTitle()); //this is to get the title of the url
     
     System.out.println(driver.getCurrentUrl());  //this is to get the current url
     driver.get("http://yahoo.com");
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     driver.navigate().back();
     driver.quit();
	}

}

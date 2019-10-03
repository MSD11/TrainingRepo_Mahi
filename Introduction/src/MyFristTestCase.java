import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyFristTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           System.setProperty("webdriver.gecko.driver", "C:\\exefiles\\geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();
	     //System.setProperty("webdriver.ie.driver", "C:\\exefiles\\MicrosoftWebDriver.exe");
	     //WebDriver driver=new InternetExplorerDriver();
	     
	     driver.get("http://google.com");
	     System.out.println(driver.getTitle());
	   }
}
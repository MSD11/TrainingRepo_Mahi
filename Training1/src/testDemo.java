import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code-	
        //create a Driver object for chrome browser
		/*Class name= ChromeDriver,
		 * x driver= newx();
		return type should be webdriver*/
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}

}

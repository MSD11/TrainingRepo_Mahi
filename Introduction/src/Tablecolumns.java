import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tablecolumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstcolumn = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstcolumn.size(); i++) {
			originalList.add(firstcolumn.get(i).getText());
		}

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {
			copiedList.add(originalList.get(i));
		}
		System.out.println("****************");
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		for (String s: copiedList) //for (int i = 0; i < copiedList.size(); i++)
		{
			System.out.println(s);
		}
		System.out.println("********original list********");
		for (String s: originalList) {
			System.out.println(s);
		}
		Assert.assertTrue(originalList.equals(copiedList));
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

	}

}

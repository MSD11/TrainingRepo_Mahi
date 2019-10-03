import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemsNeeded = {"Cauliflower","Cucumber","Carrot","Beetroot"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000L);

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			/*Format it to get actual vegetable name
			  convert array in to array list for easy search
			  check name you have extracted is present in the array list or not 
			  we should trim the name of the vegetables as they are mentioned as Brocolli - 1kg
			  methods like trim and split to get only brocolli instead of Brocolli - 1 kg
			  name(0) = Brocolli
			  name(1) = 1kg
			  */
			
			List itemsList = Arrays.asList(itemsNeeded);
			
				if (itemsList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//break; break statement can be used only if we are searching for single item.
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}

	}

}

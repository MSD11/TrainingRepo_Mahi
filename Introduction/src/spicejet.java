import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.findElements(By.cssSelector("input[type='radio']")).size());
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='OneWay']")).isSelected());

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("its Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[contains(text(),'Shirdi
		// (SAG)')]")).click();
		driver.findElement(By.xpath("(//a[@value='SAG'])[2]")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		int i = 1;
		while (i < 2) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult");
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int a = 1;
		while (a < 2) {
			driver.findElement(By.id("hrefIncChd")).click();
			a++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int b = 1; b < 2; b++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult, 1 Child, 1 Infant");
		Thread.sleep(2000L);
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// to get the count of all the check boxes in the page

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println(driver.getTitle());
//	    driver.quit();
	}

}

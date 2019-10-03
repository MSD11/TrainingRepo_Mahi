package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	public WebDriver driver = null;

	@Test
	public void Login() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\msesham2\\eclipse-workspace\\TestNGTutorial\\src\\test\\datadriven.properties");
		prop.load(fis);

		// System.out.println(prop.getProperty("username"));
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\exefiles\\chromedriver.exe");

		if (prop.getProperty("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void software() {
		System.out.println("running the test");
	}

	@AfterSuite
	public void deinstallsoftware() {
		System.out.println("delete the software installed");
	}
}

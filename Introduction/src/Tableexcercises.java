import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexcercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\exefiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23269/indw-vs-rsaw-1st-t20i-south-africa-women-tour-of-india-2019");
		
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	   // int rowcount =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();	
	    int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    
	    for(int i=0; i<count-2; i++)
	    {
	    	String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	    	int valueinteger= Integer.parseInt(value);
	    	sum=sum+valueinteger;
	    }
	    
	    //System.out.println(sum);
	    
	    String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	    int valueExtras=Integer.parseInt(Extras);
	    int TotalSumValue=sum+valueExtras;
	    System.out.println(TotalSumValue);
	    
	    String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	    int ActualTotalValue=Integer.parseInt(ActualTotal);
	    System.out.println(ActualTotalValue);
	    if(ActualTotalValue==TotalSumValue)
	    {
	    	System.out.println("Count matches");
	    }
	    else
	    {
	    	System.out.println("count mismatch");
	    }
	}

}

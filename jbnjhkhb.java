package poiuy;
import java.util.List;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class jbnjhkhb {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//System.out.println("driver object");
		//driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		
//		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("subin");
//		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("biswas");
//		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("ashirwad complex");
//		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
//		driver.navigate().to("http://google.com");
//		//driver.findElement(By.xpath("//input[@id=\"fakebox-input\"]")).click();
//		//driver.navigate().forward();
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.quit();
////		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		
//		List<WebElement> elements=driver.findElements(By.name("name"));
//		System.out.println("number of elements are:" + elements.size());
//		
//		Select drpCountry=new Select(driver.findElement(By.name("country")));
//		drpCountry.selectByVisibleText("INDIA");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("hjgeds");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("jhkjhfhfe");
		
		/*for(int i=0;i<elements.size();i++) {
			System.out.println("radio button text:"+ elements.get(i).getAttribute("value"));*/
		
			
			//driver.navigate().to("http://google.com");
	
			
			 
			
		
		
        
	}
}



package MyPracticeAllTopics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsOrTabsHandles {
	public static void main(String[] args){
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/?bc=HA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//div[@class='btn-container  '])[1]")).click();
		
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> iterator = alltabs.iterator();
		String parenttab = iterator.next();
		String childtab = iterator.next();
		driver.switchTo().window(childtab);
		
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Someshwar");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Wagh");
		driver.quit();
		
	}
}

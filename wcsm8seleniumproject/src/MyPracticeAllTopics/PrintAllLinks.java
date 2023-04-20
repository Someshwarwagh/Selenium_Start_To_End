package MyPracticeAllTopics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		for (int i = 0; i < allLinks.size(); i++) {
			String link=allLinks.get(i).getAttribute("href");
			System.out.println("href : "+link);
		}
		
		driver.quit();
		
	}
}

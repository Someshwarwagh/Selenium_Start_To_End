package MyPracticeAllTopics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllButtons {
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		
		for (int i = 0; i < button.size(); i++) {
			String btn=button.get(i).getText();
			System.out.println(btn);
		}
		
		driver.quit();
		
	}
}

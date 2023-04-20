package MyPracticeAllTopics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.nseindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		List<WebElement> rowElements = driver.findElements(By.xpath("(//div[@id='nse-reference-rates']//table)[2]/tbody/tr"));
		List<WebElement> colElements = driver.findElements(By.xpath("(//div[@id='nse-reference-rates']//table)[2]/tbody/tr[1]/td"));

		driver.findElement(By.xpath("//a[@id='Reference Rates']")).click();
		
		for (int i = 1; i <= rowElements.size(); i++) {
			for (int j = 1; j <= colElements.size(); j++) {
				System.out.print(driver.findElement(By.xpath("(//div[@id='nse-reference-rates']//table)[2]/tbody/tr["+i+"]/td["+j+"]"))
						.getText() + "  ");
			}
			System.out.println();
		}

		// driver.quit();

	}
}

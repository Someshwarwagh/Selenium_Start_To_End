package MyPracticeAllTopics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {
	public static void main(String[] args){
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement sourceArea = driver.findElement(By.xpath("(//span[contains(text(),'Indeeed')])[1]"));
		WebElement destArea = driver.findElement(By.xpath("(//span[contains(text(),'Indeeed')])[2]"));
		
		Actions action=new Actions(driver);
		action.keyDown(sourceArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(destArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
		//driver.quit();
		
	}
}

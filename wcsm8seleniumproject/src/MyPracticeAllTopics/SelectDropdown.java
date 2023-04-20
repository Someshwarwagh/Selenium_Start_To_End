package MyPracticeAllTopics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement multiDropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
		Select select = new Select(multiDropdown);
		select.selectByIndex(3);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Volvo");
		
		WebElement singleDropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		Select select1 = new Select(singleDropdown);
		select1.selectByIndex(1);
		select1.selectByValue("jkl");
		select1.selectByVisibleText("doc 4");
		
		
		driver.quit();
		
	}
}

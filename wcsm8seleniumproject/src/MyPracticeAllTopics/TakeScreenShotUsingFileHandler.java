package MyPracticeAllTopics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShotUsingFileHandler {
	public static void main(String[] args) throws IOException {
			
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//also we can take File Utils to save the screenshot
		File screenshotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);	
		FileHandler.copy(screenshotFile,new File("./screenShots/AccountingLogin.png"));
		
		driver.quit();
		
	}
}

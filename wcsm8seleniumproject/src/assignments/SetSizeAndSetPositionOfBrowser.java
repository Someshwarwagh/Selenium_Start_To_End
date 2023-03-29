package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeAndSetPositionOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Assignment-1
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");

		Dimension targetSize = new Dimension(350,450);

		Thread.sleep(2000);
		driver.manage().window().setSize(targetSize);
		
		Point targetPosition = new Point(450,350);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetPosition);
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}

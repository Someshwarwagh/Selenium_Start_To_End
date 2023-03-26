package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// Handling IlligalStatException
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		//Handling ConnectionfailedException
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-origins=*");

		//Upcasting 
		WebDriver driver=new ChromeDriver(Co);
		driver.manage().window().maximize();

		//opening Facebook Web Application
		driver.get("http://omayo.blogspot.com/");

		//Thread stops execution for some time
		Thread.sleep(5000);

		//Used to close Only Parent Browser Window
		driver.close(); 
	}

}

package qsp;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		// Handling IlligalStatException
		ChromeOptions Co=new ChromeOptions();
		Co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		new ChromeDriver(Co);		
	}

}

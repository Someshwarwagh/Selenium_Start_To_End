package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateElementByTagNameIdName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		// instagram----------------
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Xyz@123");
		Thread.sleep(2000);

		// Facebook----------------
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Abc@123");
		Thread.sleep(2000);

		// Amazon----------------
		driver.navigate().to(
				"https://na.account.amazon.com/ap/signin?_encoding=UTF8&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.pape.max_auth_age=0&ie=UTF8&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=lwa&openid.assoc_handle=amzn_lwa_na&marketPlaceId=ATVPDKIKX0DER&arb=a3cd3d91-a360-4485-ba93-4a6d7313e906&language=en_US&openid.return_to=https%3A%2F%2Fna.account.amazon.com%2Fap%2Foa%3FmarketPlaceId%3DATVPDKIKX0DER%26arb%3Da3cd3d91-a360-4485-ba93-4a6d7313e906%26language%3Den_US&enableGlobalAccountCreation=1&metricIdentifier=amzn1.application.e3b40bcf8dae40e6bf8b197b9b3dec8d&signedMetricIdentifier=b1rnnUP4iinb%2B%2BwjCOWA1f5Y%2B6DlINB%2BDQCz1Q54AtU%3D");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_email")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Abc@123");
		Thread.sleep(2000);

		// Flipkart----------------
		driver.navigate().to("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		Thread.sleep(2000);
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("abc");
		Thread.sleep(2000);
		driver.quit();

	}

}

package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Practice {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("http://omayo.blogspot.com/");
		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		driver.navigate().to("https://www.google.com/");
//		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().refresh();
		
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getPageSource());
//		System.out.println(driver.getWindowHandle());
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wb.until(ExpectedConditions.elementToBeClickable(By.id("user"))).click();
//		driver.findElement(By.id("denyBtn")).click();
//		WebElement ser = driver.findElement(By.id("search_query_top_elastic_search"));
//		ser.sendKeys("Hii");
//		Thread.sleep(2000);
//		ser.clear();
//		
//		WebElement btn = driver.findElement(By.xpath("//a[text()='View More Collections']"));
//		Point loc = btn.getLocation();
//		int x = loc.getX();
//		int y = loc.getY();
//		System.out.println(x+" "+y);
//		JavascriptExecutor je=(JavascriptExecutor)driver;
//		je.executeScript("window.scrollBy("+x+","+(y-250)+")");
//		


//		WebElement multidrop = driver.findElement(By.id("multiselect1"));
//		Select sel=new Select(multidrop);
//		sel.selectByIndex(0);
//		sel.selectByValue("Hyundaix");
//		sel.selectByVisibleText("Audi");
		
//		List<WebElement> alloptions = sel.getOptions();
//		for (int i = 0; i < alloptions.size(); i++) {
//			System.out.println(alloptions.get(i).getText());
//		}
		
//		System.out.println(sel.isMultiple());
//		System.out.println(sel.getFirstSelectedOption().getText());
//
//		sel.deselectAll();
//		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
//		WebElement dest=driver.findElement(By.xpath("//li[@class='placeholder']"));
//		
		
		Actions acn=new Actions(driver);
//		WebElement we = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
//		acn.moveToElement(we).perform();
//		acn.dragAndDrop(src, dest);
		
//		Robot rbt=new Robot();
//		rbt.keyPress(KeyEvent.VK_CONTROL);
//		rbt.keyPress(KeyEvent.VK_P);
//		
//		rbt.keyRelease(KeyEvent.VK_CONTROL);
//		rbt.keyRelease(KeyEvent.VK_P);
//		
//		Thread.sleep(2000);
//		
//		rbt.keyPress(KeyEvent.VK_TAB);
//		rbt.keyRelease(KeyEvent.VK_TAB);
//		
//		Thread.sleep(2000);
//		rbt.keyPress(KeyEvent.VK_ENTER);
//		rbt.keyRelease(KeyEvent.VK_ENTER);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./ScreenShots/sss1.png"); 
		Files.copy(src, dest);

	}
}

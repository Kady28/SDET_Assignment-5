package Assesment.Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_5 {

WebDriver driver;

	
	@BeforeTest(enabled = true)
	public void bt() throws InterruptedException {
     
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shoes");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 8000)");
		

    	WebDriverWait wait = new WebDriverWait(driver,30);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='srp-multi-aspect-guidance srp-controls-v3 srp-multi-aspect-guidance-bos']//li[9]//div[1]//a[1]//div[1]")));

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		
		WebElement search=driver.findElement(By.xpath("//input[@id='gh-ac']"));
		search.sendKeys(Keys.CONTROL+"a");
		search.sendKeys(Keys.BACK_SPACE);
		  

	}
}

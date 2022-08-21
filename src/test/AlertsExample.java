package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//WebElement button1=driver.findElement(By.id("alertButton"));
		//button1.click();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		//alert.accept();
		//WebElement button3=driver.findElement(By.id("confirmButton"));
		//button3.click();
		
		//System.out.println(alert.getText());
		
		//alert.dismiss();
		//Promt Button
		WebElement button4=driver.findElement(By.id("promtButton"));
		button4.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Sreenidhi");
		alert.accept();
		
		
	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//WebElement target=driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
		//JavascriptExecutor obj=(JavascriptExecutor)driver;
		//obj.executeScript("arguments[0].scrollIntoView();", target);
		//Scroll Down
		//obj.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		//Scroll Up
		//obj.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		//Using Actions class page down
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Control plus End to go to bottam of page
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
		
		
		
		

	}

}

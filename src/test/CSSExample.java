package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement mailtext=driver.findElement(By.cssSelector("input#email"));
		mailtext.sendKeys("abcd");
		WebElement pwdtext=driver.findElement(By.cssSelector("input[type=password]"));
		pwdtext.sendKeys("1234");
		WebElement loginbutton=driver.findElement(By.cssSelector("button[name=login"));
		loginbutton.click();
		
		
		
		
		
	}

}

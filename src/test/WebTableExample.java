package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> table= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(table.size());
		List<WebElement> columns= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(columns.size());
	}

}

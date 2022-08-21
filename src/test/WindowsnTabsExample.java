package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsnTabsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement Newtab=driver.findElement(By.id("tabButton"));
		Newtab.click();
		String ParentWin=driver.getWindowHandle();
		Set<String> allwins =driver.getWindowHandles();
		for(String win:allwins) {
			System.out.println(win);
		
		if(!win.equals(ParentWin)) {
			driver.switchTo().window(win);
			
		}}
		WebElement childHeader=driver.findElement(By.id("sampleHeading"));
		System.out.println(childHeader.getText());
		driver.switchTo().window(ParentWin);
		WebElement secondtab=driver.findElement(By.id("messageWindowButton"));
		secondtab.click();

}
}


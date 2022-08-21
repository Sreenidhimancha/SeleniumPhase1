package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\VAISHNAVI YADAV\\OneDrive\\Desktop\\Sreenidhi\\Automation\\Welcome Session Notes.docx");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement Submit=driver.findElement(By.id("submitbutton"));
		Submit.click();
		

	}

}

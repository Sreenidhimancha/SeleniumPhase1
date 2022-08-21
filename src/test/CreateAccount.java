package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement CreateAccButton=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		CreateAccButton.click();
		WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		FirstName.sendKeys("ABC");
		WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
		LastName.sendKeys("12334");
		WebElement MailText=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MailText.sendKeys("66034");
		WebElement NewPassword=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		NewPassword.sendKeys("ABCDE");
		WebElement Day=driver.findElement(By.name("birthday_day"));
		Select ddDay=new Select(Day);
		ddDay.selectByVisibleText("30");
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select ddMonth=new Select(Month);
		ddMonth.selectByVisibleText("Sep");
		System.out.println(ddMonth.getFirstSelectedOption().getText());
		WebElement Year=driver.findElement(By.name("birthday_year"));
		Select ddYear=new Select(Year);
		ddYear.selectByVisibleText("1995");
		System.out.println(ddYear.getFirstSelectedOption().getText());
		
		
	
		
	List<WebElement> Mnt=ddMonth.getOptions();
	for(WebElement ele: Mnt) {
		System.out.println(ele.getText());
		}
		
		
		
		
		
		
		
		

	}
}




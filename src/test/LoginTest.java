package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement LoginLink= driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		WebElement Username=driver.findElement(By.name("user_login"));
		Username.sendKeys("sreenidhi@gmail.com");
		WebElement Password=driver.findElement(By.id("password"));
		Password.sendKeys("Jan@2022");
		WebElement Checkbox=driver.findElement(By.className("rememberMe"));
		Checkbox.click();
		WebElement LoginButton=driver.findElement(By.name("btn_login"));
		LoginButton.click();
		WebElement Error=driver.findElement(By.id("msg_box"));
		String ActError=Error.getText();
		String ExpError= "The email or password you have entered is invalid.";
		if(ActError.equals(ExpError)) {
			System.out.println("TC Passed");
		}else {
			System.out.println("TC Failed");
		}
	List<WebElement> Links=	driver.findElements(By.tagName("a"));
	System.out.println("No of Links " +Links.size());
	//Get all Links
	
	for(int index=0;index<Links.size();index++) {
        
        System.out.println(Links.get(index).getAttribute("href"));
		//driver.close();
		
		
		
		
	}

}
}


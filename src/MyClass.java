import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass {

	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mySetup() {
		
		String URL = "https://www.saucedemo.com/";
		driver.get(URL);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement>AddToCartButtons = driver.findElements(By.className("btn_primary"));
			for(int i= 0; i< AddToCartButtons.size(); i=i+2) {
				AddToCartButtons.get(i).click();
				
			}
	}
	
	
	@Test
	public void myTest() {}

	
	@AfterTest
	public void myPostTesting() {}
	
}

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng {

	@Test
    public void loginPageTest() {
		
		WebDriver driver = new ChromeDriver();

		//maximize the script
		driver.manage().window().maximize();
		  
		//navigate to the webPage
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		String title = driver.getTitle();
		
		String title2 = driver.findElement(By.className("app_logo")).getText();

		assertEquals(title, "Swag Labs");
		
		assertEquals(title2, "Swag Labs");
		
		driver.quit();
    } 

}

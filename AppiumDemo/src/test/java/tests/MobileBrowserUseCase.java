package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class MobileBrowserUseCase extends Base {
	
	@Test
	public void mobBrowerTest() {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation Veera");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		System.out.println("Completed Mobile Browser test usecase");
	}

}

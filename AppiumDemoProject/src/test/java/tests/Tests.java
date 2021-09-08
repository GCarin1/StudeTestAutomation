package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tests extends BaseClass {
	
	@Test
	public void test01(){
		driver.get("https://Google.com");
		driver.findElement(By.name("q")).sendKeys("Automação");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		System.out.println("Teste 01 completo");
	}

}

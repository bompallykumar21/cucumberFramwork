package pages;

import org.openqa.selenium.By;

import domainObjects.loginCred;
import testBase.TestBase;

public class RediffPage extends TestBase{

	public void EnterLoginCredentials(loginCred logCred){
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys(logCred.getUsername());
	}
	
	public void EnterLoginCredentialsSecond(loginCred logCred){
		driver.findElement(By.xpath(".//*[@id='login1']")).clear();
		driver.findElement(By.xpath(".//*[@id='login1']")).sendKeys(logCred.getUserNameSecond());
	}
}

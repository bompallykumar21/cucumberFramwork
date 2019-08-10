package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import domainObjects.loginCred;
import testBase.TestBase;

public class RediffPage extends TestBase{
    
    public RediffPage(){
        PageFactory.initElements(driver, this);
    }
    
	  @FindBy(xpath = ".//*[@id='login1']")
	    public WebElement userName;

	
	public WebElement getUserName() {
		return userName;
	}

	public void EnterLoginCredentials(loginCred logCred){
		getUserName().sendKeys(logCred.getUsername());
	}
	
	public void EnterLoginCredentialsSecond(loginCred logCred){
		getUserName().clear();
		getUserName().sendKeys(logCred.getUserNameSecond());
	}
}

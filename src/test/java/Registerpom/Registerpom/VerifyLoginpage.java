package Registerpom.Registerpom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLoginpage {
	
	@Test
	public void verifyValidLogin()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank");
        Loginpag login= new Loginpag(driver);
        login.UserName();
        login.Password();
        login.LoginButton();
        login.Logout();
	}
	

}

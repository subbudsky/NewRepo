package Registerpom.Registerpom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpag {
	WebDriver driver;
	
	
	    By username=By.xpath("//input[@name='username']");
		By password=By.xpath("//input[@name='password']");
		By Btn=By.xpath("//input[@name=''button]");
	
		 public Loginpag(WebDriver driver)
		 {
			 this.driver=driver;
		 }
		 public void UserName() {
			 driver.findElement(username).sendKeys("subbu9");
		 }
		 public void Password()
		 {
			 driver.findElement(password).sendKeys("subbu1995");
		 }
		 public void LoginButton() {
			 driver.findElement(Btn).click();
		 }
		 public void Logout() {
			 driver.findElement(By.linkText("Log Out")).click();	
		 }
		
}
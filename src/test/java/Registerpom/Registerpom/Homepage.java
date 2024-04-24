package Registerpom.Registerpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	
		// TODO Auto-generated method stub
 public String baseURL="https://parabank.parasoft.com/paraban";
 public String username="subbu9";
 public String password="Subbu1995";
 public static WebDriver driver;
 
 public void setup() {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kaval\\Desktop\\chromedriver-win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 
		 
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
		 
		 
 }
 
 
 
	}



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	private By emailBox = By.id("Email");
	private By passwordBox = By.id("Password");
	private By loginButton= By.tagName("button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterUsername(String username) {
		driver.findElement(emailBox).clear();
		driver.findElement(emailBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(emailBox).clear();
		driver.findElement(passwordBox).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(emailBox).isDisplayed();
		driver.findElement(loginButton).click();
	}
	

}

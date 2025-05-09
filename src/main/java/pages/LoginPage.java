package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	private WebDriver driver;

	private By userNameTextBox = By.xpath("//*[@id=\"Email\"]");
	private By passwordTextBox = By.xpath("//*[@id=\"Password\"]");
	private By loginButton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage( WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUser() {
		driver.findElement(userNameTextBox);
	}
	
	public void enterPassword() {
		driver.findElement(passwordTextBox);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton);
	}
}

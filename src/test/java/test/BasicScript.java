package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		String title = driver.getTitle();
		System.out.println("Title :"+title);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
		password.clear();
		password.sendKeys("admin");
		
		WebElement remember = driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
		remember.click();
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		login.click();
		
		driver.quit();
	}
}
